package com.zzhw.gtms.em;

/***
 * 车辆类型
 * @author Administrator
 *
 */
public enum VehicleTypeCode {

	HEAVY("1", "重型"), MIDDLE("2", "中型"), LIGHT("3", "轻型"), MINIYPE("4", "微型");

	private String value;
	private String cnValue;

	private VehicleTypeCode(String value, String cnValue) {
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
