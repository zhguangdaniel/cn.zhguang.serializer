package cn.zhguang.library;

/**
 * ���Դ���ο�:http://agapple.iteye.com/blog/859052
 * Created by yinggang.zg on 2016/11/4 ����12:02 .
 */
public interface LibCallback {

	String getName();

	byte[] writeObject(Object source);

	Object readObject(byte[] bytes);
}