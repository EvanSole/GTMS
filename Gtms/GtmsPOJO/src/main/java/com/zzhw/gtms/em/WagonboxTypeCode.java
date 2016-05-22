package com.zzhw.gtms.em;

/***
 * 车厢类型
 * @author Administrator
 * 
 */
public enum WagonboxTypeCode {

	flat_car("1", "平板车"), high_sided_car("2", "高栏车"), box_car("3", "箱式车"), container_car(
			"4", "集装箱"), cold_storage_car("5", "冷藏车");

	private String value;
	private String cnValue;

	private WagonboxTypeCode(String value, String cnValue) {
		this.value = value;
		this.cnValue = cnValue;
	}

	public String toCn() {
		return this.cnValue;
	}

	public String toString() {
		return this.value;
	}

}
