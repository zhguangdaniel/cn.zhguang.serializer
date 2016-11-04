package cn.zhguang.library;

import com.thoughtworks.xstream.XStream;

import java.io.ByteArrayInputStream;

/**
 * Created by yinggang.zg on 2016/11/4 обнГ4:38 .
 */
public class XStreamCallback implements LibCallback {
	final XStream xstream = new XStream();

	public String getName() {
		return "Xstream test";
	}

	public byte[] writeObject(Object source) {
		return xstream.toXML(source).getBytes();
	}

	public Object readObject(byte[] bytes) {
		return xstream.fromXML(new ByteArrayInputStream(bytes));
	}
}
