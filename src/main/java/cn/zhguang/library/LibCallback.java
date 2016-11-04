package cn.zhguang.library;

/**
 * ²âÊÔ´úÂë²Î¿¼:http://agapple.iteye.com/blog/859052
 * Created by yinggang.zg on 2016/11/4 ÏÂÎç12:02 .
 */
public interface LibCallback {

	String getName();

	byte[] writeObject(Object source);

	Object readObject(byte[] bytes);
}