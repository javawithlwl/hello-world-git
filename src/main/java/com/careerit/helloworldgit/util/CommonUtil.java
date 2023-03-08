package com.careerit.helloworldgit.util;

import org.apache.commons.lang3.StringUtils;

public final class CommonUtil {

        private CommonUtil(){

        }
        public static String maskData(String str){
            if(StringUtils.isNoneEmpty(str) && str.length()>=4) {
               return "********" + str.substring(str.length() - 4);
            }
            return str;
        }
}
