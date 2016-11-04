package cn.zhguang.test;

import cn.zhguang.dto.NomalSourceDTO;
import cn.zhguang.library.*;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.List;

/**
 * 测试代码参考:http://agapple.iteye.com/blog/859052
 * Created by yinggang.zg on 2016/11/4 上午11:21 .
 */
public class TotalPerformanceTest {
	private final NomalSourceDTO sourceDTO = new NomalSourceDTO();

	private final int count = 1000;

	private List<LibCallback> callbackList = Lists.newArrayList(
			new HessianCallback(),
			new Hessian2Callback(),
			new Hessian2DeflateCallback(),
			new XStreamCallback(),
			new JavaCallback());

	@Test
	public void test_performance() throws IOException {
		for (LibCallback callback : callbackList) {
			testTemplate(callback);
		}
	}

	private void testTemplate(LibCallback callback) {
		int warmup = 10;
		// 先进行预热，加载一些类，避免影响测试
		for (int i = 0; i < warmup; i++) {
			byte[] bytes = callback.writeObject(sourceDTO);
			callback.readObject(bytes);
		}
		restoreJvm(); // 进行GC回收
		// 进行测试

		long writeTotal = 0;
		long readTotal = 0;
		long size = 0l;
		for (int i = 0; i < count; i++) {
			long writeStart = System.nanoTime();
			byte[] bytes = callback.writeObject(sourceDTO);
			long writeEnd = System.nanoTime();

			writeTotal += (writeEnd - writeStart);
			size += bytes.length;
			long readStart = System.nanoTime();
			callback.readObject(bytes);
			long readEnd = System.nanoTime();

			readTotal += (readEnd - readStart);
			bytes = null;
		}
		System.out.println("total serializer : " + writeTotal + "ns , each serializer :"
				+ (writeTotal / count) + "ns , total deserializer : " + readTotal + "ns , each deserializer :"
				+ (readTotal / count) + "ns , and byte sizes = " + size / count + " , name : " + callback.getName());
		restoreJvm();// 进行GC回收

	}

	private void restoreJvm() {
		int maxRestoreJvmLoops = 10;
		long memUsedPrev = memoryUsed();
		for (int i = 0; i < maxRestoreJvmLoops; i++) {
			System.runFinalization();
			System.gc();

			long memUsedNow = memoryUsed();
			// break early if have no more finalization and get constant mem used
			if ((ManagementFactory.getMemoryMXBean().getObjectPendingFinalizationCount() == 0)
					&& (memUsedNow >= memUsedPrev)) {
				break;
			} else {
				memUsedPrev = memUsedNow;
			}
		}
	}

	private long memoryUsed() {
		Runtime rt = Runtime.getRuntime();
		return rt.totalMemory() - rt.freeMemory();
	}

}
