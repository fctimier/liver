package com.liver.utils;

import org.springframework.util.StringUtils;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHelper extends StringUtils {

    public static final String UTF8 = "utf-8";

    public static final String GBK = "gbk";

    public static final String CHARSET = UTF8;

    public static final String ERROR_MSG = "operation.error";
    // 默认分隔符
    public static final String DEFAULT_SEPARATORS = ",";


    public static String uuid() {

        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    //判断是否合法email地址
    public static boolean isEmail(String arg){

//		String regExp = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\\\.[a-zA-Z0-9-]+)*\\\\.[a-zA-Z0-9]{2,6}$";
        String regExp = "^([\\w-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
        Pattern p = Pattern.compile(regExp);
        Matcher matcher = p.matcher(arg);
        return matcher.matches();
    }

    //判断电话号码是否合法
    /**
     * @param arg
     * 	可验证格式：+86-010-40020021     010-40020020   +86-13523458056   10-13523458056   13523458056
     * @return
     */
    public static boolean isTel(String arg) {

        String regex= "^(((\\+\\d{2}-)?0\\d{2,3}-\\d{7,8})|((\\+\\d{2}-)?(\\d{2,3}-)?([1][3,4,5,7,8][0-9]\\d{8})))$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(arg);
        return matcher.matches();

    }

    /**
     * @param arg
     * 		可验证IPV4
     * @author lfc
     * @since 2020年12月1日
     */
    public static boolean isIp(String arg) {

        return isIpV4(arg) || isIpV6(arg);

    }

    public static boolean isIpV4(String arg) {

        String regex= "(?=(\\b|\\D))(((\\d{1,2})|(1\\d{1,2})|(2[0-4]\\d)|(25[0-5]))\\.){3}((\\d{1,2})|(1\\d{1,2})|(2[0-4]\\d)|(25[0-5]))(?=(\\b|\\D))";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(arg);
        return matcher.matches();
    }

    public static boolean isIpV6(String arg) {

        String regex= "^([\\da-fA-F]{1,4}:){6}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)|::([\\da−fA−F]1,4:)0,4((25[0−5]|2[0−4]\\d|[01]?\\d\\d?)\\.)3(25[0−5]|2[0−4]\\d|[01]?\\d\\d?)|^([\\da-fA-F]{1,4}:):([\\da-fA-F]{1,4}:){0,3}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)|([\\da−fA−F]1,4:)2:([\\da−fA−F]1,4:)0,2((25[0−5]|2[0−4]\\d|[01]?\\d\\d?)\\.)3(25[0−5]|2[0−4]\\d|[01]?\\d\\d?)|^([\\da-fA-F]{1,4}:){3}:([\\da-fA-F]{1,4}:){0,1}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)|([\\da−fA−F]1,4:)4:((25[0−5]|2[0−4]\\d|[01]?\\d\\d?)\\.)3(25[0−5]|2[0−4]\\d|[01]?\\d\\d?)|^([\\da-fA-F]{1,4}:){7}[\\da-fA-F]{1,4}|:((:[\\da−fA−F]1,4)1,6|:)|^[\\da-fA-F]{1,4}:((:[\\da-fA-F]{1,4}){1,5}|:)|([\\da−fA−F]1,4:)2((:[\\da−fA−F]1,4)1,4|:)|^([\\da-fA-F]{1,4}:){3}((:[\\da-fA-F]{1,4}){1,3}|:)|([\\da−fA−F]1,4:)4((:[\\da−fA−F]1,4)1,2|:)|^([\\da-fA-F]{1,4}:){5}:([\\da-fA-F]{1,4})?|([\\da−fA−F]1,4:)6:";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(arg);
        return matcher.matches();
    }

    /**
     * @param args
     * 		文件目录路径
     * @author lfc
     * @since 2020年12月1日
     */
    public static boolean isDirectory(String arg) {

        String regex= "^[A-z]:\\\\(.+?\\\\)*(.+?)*$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(arg);
        return matcher.matches();
    }



}
