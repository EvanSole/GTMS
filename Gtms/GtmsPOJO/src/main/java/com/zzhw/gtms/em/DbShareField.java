package com.zzhw.gtms.em;


/****
 * 数据源划分
 * @author Administrator
 *
 */
public enum DbShareField {

	 ORDER("order"), GPS("gps");

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private DbShareField(String value) {
		this.value = value;
	}

	public String toString() {
		return this.value;
	}

}
