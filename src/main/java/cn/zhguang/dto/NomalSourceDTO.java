package cn.zhguang.dto;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.io.Serializable;
import java.util.*;

/**
 * Created by yinggang.zg on 2016/11/2 ÏÂÎç10:43 .
 */
public class NomalSourceDTO implements Serializable {

	private static final long serialVersionUID = -8311318703431862793L;

	public NomalSourceDTO() {
		map.put("key1", "value11");
		map.put("key2", "value12");
		map.put("key3", "value13");
		map.put("key4", "value14");
		map.put("key5", "value15");
		map.put("key6", "value16");
		map.put("key7", "value17");
		map.put("key8", "value18");
		map.put("key9", "value19");
		map.put("key10", "value10");

		list.add("value1");
		list.add("value1");
		list.add("value1");
		list.add("value1");
		list.add("value1");
		list.add("value1");
		list.add("value1");
		list.add("value1");
		list.add("value1");
		list.add("value1");
		list.add("value1");

		set.add("value31");
		set.add("value32");
		set.add("value33");
		set.add("value34");
		set.add("value35");
		set.add("value36");
		set.add("value37");
		set.add("value38");
		set.add("value39");

		longMap.put(11111111111L, true);
		longMap.put(22222222222L, false);
		longMap.put(33333333333L, null);

		longList.add(1L);
		longList.add(111111111111L);
		longList.add(111111111111L);
		longList.add(111111111111L);
		longList.add(111111111111L);
		longList.add(111111111111L);
		longList.add(111111111111L);
		longList.add(111111111111L);
		longList.add(111111111111L);
		longList.add(111111111111L);

		longSet.add(1111L);
		longSet.add(222222L);
		longSet.add(33333L);
		longSet.add(4444444L);
		longSet.add(5555555L);
		longSet.add(6666666L);
		longSet.add(77777777L);
		longSet.add(8888888L);
		longSet.add(99999999L);
		longSet.add(10000000000L);

		listNodeDTOs.add(new ListNodeDTO());
		listNodeDTOs.add(new ListNodeDTO());
		listNodeDTOs.add(new ListNodeDTO());
		listNodeDTOs.add(new ListNodeDTO());
		listNodeDTOs.add(new ListNodeDTO());
		listNodeDTOs.add(new ListNodeDTO());
		listNodeDTOs.add(new ListNodeDTO());
		listNodeDTOs.add(new ListNodeDTO());
		listNodeDTOs.add(new ListNodeDTO());
		listNodeDTOs.add(new ListNodeDTO());
		listNodeDTOs.add(new ListNodeDTO());
		listNodeDTOs.add(new ListNodeDTO());
		listNodeDTOs.add(new ListNodeDTO());
		listNodeDTOs.add(new ListNodeDTO());
		listNodeDTOs.add(new ListNodeDTO());
		listNodeDTOs.add(new ListNodeDTO());
		listNodeDTOs.add(new ListNodeDTO());

		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());
		mapNodes.put(new MapKeyDTO(), new MapValueDTO());

		arrayNodes[0] = new ArrayNodeDTO();
		arrayNodes[1] = new ArrayNodeDTO();
		arrayNodes[2] = new ArrayNodeDTO();
		arrayNodes[3] = new ArrayNodeDTO();
		arrayNodes[4] = new ArrayNodeDTO();
		arrayNodes[5] = new ArrayNodeDTO();
		arrayNodes[6] = new ArrayNodeDTO();
		arrayNodes[7] = new ArrayNodeDTO();
		arrayNodes[8] = new ArrayNodeDTO();
		arrayNodes[9] = new ArrayNodeDTO();
		arrayNodes[10] = new ArrayNodeDTO();
		arrayNodes[11] = new ArrayNodeDTO();
		arrayNodes[12] = new ArrayNodeDTO();
	}

	private static String staticStr = "This is static string";

	private static Long staticBigLongValue = 1L;

	private static long staticLongValue = 2L;

	private transient String transientStr = "This is transient string";

	private int intValue = 5;

	private long longValue = 1L;

	private boolean boolValue = true;

	private float floatValue = 2.1F;

	private double doubleValue = 3.1D;

	private char charValue = 'a';

	private byte[] byteValue = "byte".getBytes();

	private short shortValue = 4;

	private Integer bigIntValue = 5;

	private Long bigLongValue = 1L;

	private Boolean bigBoolValue = true;

	private Float bigfloatValue = 2.2F;

	private Double bigDoubleValue = 3.2D;

	private Character bigCharValue = 'A';

	private Byte bigByteValue = Byte.MAX_VALUE;

	private Short bigShortValue = 4;

	private String str = "Just for test string, Just for test string, Just for test string,Just for test string,Just for test string,Just for test string,Just for test string,Just for test string,Just for test string,Just for test string,Just for test string,Just for test string,Just for test string,Just for test string,Just for test string,Just for test string,Just for test string,Just for test string,Just for test string,Just for test string,Just for test string,Just for test string,Just for test string,";

	private String[] strArray = new String[]{"stringArrayNode1", "stringArrayNode2", "stringArrayNode3", "stringArrayNode4", "stringArrayNode5", "stringArrayNode16"};

	private int[] intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 200, 4000, 10000};

	private Long[] bigIntegerArray = new Long[]{10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 1100L, 1200L, 14000L, 110000L};

	private Date date = new Date();

	private EnumDTO enumValue = EnumDTO.Value1;

	private Map<String, String> map = Maps.newHashMap();

	private List<String> list = Lists.newArrayList();

	private Set<String> set = Sets.newHashSet();

	private Map<Long, Boolean> longMap = Maps.newHashMap();

	private List<Long> longList = Lists.newArrayList();

	private Set<Long> longSet = Sets.newHashSet();

	private ArrayNodeDTO[] arrayNodes = new ArrayNodeDTO[50];

	private List<ListNodeDTO> listNodeDTOs = Lists.newArrayList();

	private Map<MapKeyDTO, MapValueDTO> mapNodes = Maps.newHashMap();

	private SingleObjectDTO obj = new SingleObjectDTO();

	public Map<MapKeyDTO, MapValueDTO> getMapNodes() {
		return mapNodes;
	}

	public void setMapNodes(Map<MapKeyDTO, MapValueDTO> mapNodes) {
		this.mapNodes = mapNodes;
	}

	public SingleObjectDTO getObj() {
		return obj;
	}

	public void setObj(SingleObjectDTO obj) {
		this.obj = obj;
	}

	public ArrayNodeDTO[] getArrayNodes() {
		return arrayNodes;
	}

	public void setArrayNodes(ArrayNodeDTO[] arrayNodes) {
		this.arrayNodes = arrayNodes;
	}

	public Boolean getBigBoolValue() {
		return bigBoolValue;
	}

	public void setBigBoolValue(Boolean bigBoolValue) {
		this.bigBoolValue = bigBoolValue;
	}

	public Byte getBigByteValue() {
		return bigByteValue;
	}

	public void setBigByteValue(Byte bigByteValue) {
		this.bigByteValue = bigByteValue;
	}

	public Character getBigCharValue() {
		return bigCharValue;
	}

	public void setBigCharValue(Character bigCharValue) {
		this.bigCharValue = bigCharValue;
	}

	public Double getBigDoubleValue() {
		return bigDoubleValue;
	}

	public void setBigDoubleValue(Double bigDoubleValue) {
		this.bigDoubleValue = bigDoubleValue;
	}

	public Float getBigfloatValue() {
		return bigfloatValue;
	}

	public void setBigfloatValue(Float bigfloatValue) {
		this.bigfloatValue = bigfloatValue;
	}

	public Long[] getBigIntegerArray() {
		return bigIntegerArray;
	}

	public void setBigIntegerArray(Long[] bigIntegerArray) {
		this.bigIntegerArray = bigIntegerArray;
	}

	public Integer getBigIntValue() {
		return bigIntValue;
	}

	public void setBigIntValue(Integer bigIntValue) {
		this.bigIntValue = bigIntValue;
	}

	public Long getBigLongValue() {
		return bigLongValue;
	}

	public void setBigLongValue(Long bigLongValue) {
		this.bigLongValue = bigLongValue;
	}

	public Short getBigShortValue() {
		return bigShortValue;
	}

	public void setBigShortValue(Short bigShortValue) {
		this.bigShortValue = bigShortValue;
	}

	public boolean isBoolValue() {
		return boolValue;
	}

	public void setBoolValue(boolean boolValue) {
		this.boolValue = boolValue;
	}

	public byte[] getByteValue() {
		return byteValue;
	}

	public void setByteValue(byte[] byteValue) {
		this.byteValue = byteValue;
	}

	public char getCharValue() {
		return charValue;
	}

	public void setCharValue(char charValue) {
		this.charValue = charValue;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getDoubleValue() {
		return doubleValue;
	}

	public void setDoubleValue(double doubleValue) {
		this.doubleValue = doubleValue;
	}

	public EnumDTO getEnumValue() {
		return enumValue;
	}

	public void setEnumValue(EnumDTO enumValue) {
		this.enumValue = enumValue;
	}

	public float getFloatValue() {
		return floatValue;
	}

	public void setFloatValue(float floatValue) {
		this.floatValue = floatValue;
	}

	public int[] getIntArray() {
		return intArray;
	}

	public void setIntArray(int[] intArray) {
		this.intArray = intArray;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public List<ListNodeDTO> getListNodeDTOs() {
		return listNodeDTOs;
	}

	public void setListNodeDTOs(List<ListNodeDTO> listNodeDTOs) {
		this.listNodeDTOs = listNodeDTOs;
	}

	public List<Long> getLongList() {
		return longList;
	}

	public void setLongList(List<Long> longList) {
		this.longList = longList;
	}

	public Map<Long, Boolean> getLongMap() {
		return longMap;
	}

	public void setLongMap(Map<Long, Boolean> longMap) {
		this.longMap = longMap;
	}

	public Set<Long> getLongSet() {
		return longSet;
	}

	public void setLongSet(Set<Long> longSet) {
		this.longSet = longSet;
	}

	public long getLongValue() {
		return longValue;
	}

	public void setLongValue(long longValue) {
		this.longValue = longValue;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public short getShortValue() {
		return shortValue;
	}

	public void setShortValue(short shortValue) {
		this.shortValue = shortValue;
	}

	public static Long getStaticBigLongValue() {
		return staticBigLongValue;
	}

	public static void setStaticBigLongValue(Long staticBigLongValue) {
		NomalSourceDTO.staticBigLongValue = staticBigLongValue;
	}

	public static long getStaticLongValue() {
		return staticLongValue;
	}

	public static void setStaticLongValue(long staticLongValue) {
		NomalSourceDTO.staticLongValue = staticLongValue;
	}

	public static String getStaticStr() {
		return staticStr;
	}

	public static void setStaticStr(String staticStr) {
		NomalSourceDTO.staticStr = staticStr;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String[] getStrArray() {
		return strArray;
	}

	public void setStrArray(String[] strArray) {
		this.strArray = strArray;
	}

	public String getTransientStr() {
		return transientStr;
	}

	public void setTransientStr(String transientStr) {
		this.transientStr = transientStr;
	}
}
