package com.zzhw.gtms.common.utils;

import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class RegexUtil {

	private static final Pattern EMAIL_PATTERN = Pattern
			.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");

	private static final Pattern MOBILE_PHONE_PATTERN = Pattern
			.compile("^(13[0-9]|15[0-9]|14[7|5]|18[0-9])\\d{8}$");

	private static final Pattern BANK_ACCOUNT_PATTERN = Pattern
			.compile("^(\\d{16}|\\d{19})$");

	public static boolean isEmail(String email) {
		return StringUtils.isBlank(email) ? false : EMAIL_PATTERN
				.matcher(email).matches();
	}

	public static boolean isMobilePhone(String mobilePhone) {
		return StringUtils.isBlank(mobilePhone) ? false : MOBILE_PHONE_PATTERN
				.matcher(mobilePhone).matches();
	}

	public static boolean isBankAccount(String bankAccount) {
		return StringUtils.isBlank(bankAccount) ? false : BANK_ACCOUNT_PATTERN
				.matcher(bankAccount).matches();
	}

}
