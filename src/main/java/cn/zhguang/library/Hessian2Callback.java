package cn.zhguang.library;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by yinggang.zg on 2016/11/4 ÏÂÎç4:37 .
 */
public class Hessian2Callback implements LibCallback{
	public String getName() {
		return "hessian 2 with no deflate";
	}

	public byte[] writeObject(Object source) {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			Hessian2Output out = new Hessian2Output(bos);
			// out.startMessage();
			out.writeObject(source);
			// out.completeMessage();
			out.flush();
			return bos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}


	public Object readObject(byte[] bytes) {
		try {
			ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
			Hessian2Input in = new Hessian2Input(bin);
			// in.startMessage();
			Object obj = in.readObject();
			// in.completeMessage();
			return obj;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
