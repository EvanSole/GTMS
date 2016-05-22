package com.zzhw.gtms.common.utils;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import com.zzhw.gtms.common.constants.Constants;

public class URLUtil {

    public static String encode(String url) {
        try {
            return URLEncoder.encode(url, Constants.ENCODING_UTF_8);
        } catch (UnsupportedEncodingException e) {
            return url;
        }
    }

    public static String decode(String url) {
        try {
            return URLDecoder.decode(url, Constants.ENCODING_UTF_8);
        } catch (UnsupportedEncodingException e) {
            return url;
        }
    }

}
