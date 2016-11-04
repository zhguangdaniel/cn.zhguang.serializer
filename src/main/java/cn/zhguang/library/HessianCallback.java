package cn.zhguang.library;

import com.caucho.hessian.io.HessianInput;
import com.caucho.hessian.io.HessianOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by yinggang.zg on 2016/11/4 ÏÂÎç4:33 .
 */
public class HessianCallback implements LibCallback{
	public String getName() {
		return "hessian 1";
	}

	public byte[] writeObject(Object source) {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			HessianOutput out = new HessianOutput(bos);
			out.writeObject(source);
			out.flush();
			return bos.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Object readObject(byte[] bytes) {
		try {
			ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
			HessianInput in = new HessianInput(bin);
			Object obj = in.readObject();
			in.close();
			return obj;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
