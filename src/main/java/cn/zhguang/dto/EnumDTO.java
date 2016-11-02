package cn.zhguang.dto;

/**
 * Created by yinggang.zg on 2016/11/2 ÏÂÎç10:53 .
 */
public enum EnumDTO {
	Value1(1, "1"),
	Value2(2, "2"),
	Value3(3, "3"),
	Value4(4, "4"),
	Value5(5, "5"),
	Value6(6, "6"),
	Value7(7, "7");

	private int key1;

	private String key2;

	EnumDTO(int key1, String key2) {
		this.key1 = key1;
		this.key2 = key2;
	}

	public int getKey1() {
		return key1;
	}

	public void setKey1(int key1) {
		this.key1 = key1;
	}

	public String getKey2() {
		return key2;
	}

	public void setKey2(String key2) {
		this.key2 = key2;
	}
}
