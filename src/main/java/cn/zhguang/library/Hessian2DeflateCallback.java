package cn.zhguang.library;

import com.caucho.hessian.io.Deflation;
import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 无压缩hessian 2
 * Created by yinggang.zg on 2016/11/4 下午4:35 .
 */
public class Hessian2DeflateCallback implements LibCallback{
	final Deflation envelope = new Deflation();
	public String getName() {
		return "hessian 2 with deflate";
	}

	public byte[] writeObject(Object source) {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			Hessian2Output out = new Hessian2Output(bos);
			out = envelope.wrap(out);
			out.writeObject(source);
			out.flush();
			out.close(); // 记得关闭
			return bos.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Object readObject(byte[] bytes) {
		try {
			ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
			Hessian2Input in = new Hessian2Input(bin);
			in = envelope.unwrap(in);
			Object obj = in.readObject();
			in.close();
			return obj;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
