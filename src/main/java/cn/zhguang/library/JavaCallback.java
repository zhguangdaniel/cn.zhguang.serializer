package cn.zhguang.library;

import java.io.*;

/**
 * Created by yinggang.zg on 2016/11/4 ÏÂÎç4:38 .
 */
public class JavaCallback implements LibCallback{

	public String getName() {
		return "Java Serializable Test";
	}

	public byte[] writeObject(Object source) {
		try {
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			ObjectOutputStream output = new ObjectOutputStream(bout);
			output.writeObject(source);
			return bout.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Object readObject(byte[] bytes) {
		try {
			ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
			ObjectInputStream input = new ObjectInputStream(bin);
			return input.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
