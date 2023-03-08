package com.careerit.helloworldgit.util;

import org.apache.commons.lang3.StringUtils;

public final class CommonUtil {

        private CommonUtil(){

        }
        public static String maskAccountNumber(String accNumber){
            if(StringUtils.isNoneEmpty(accNumber) && accNumber.length()>=4) {
               return "********" + accNumber.substring(accNumber.length() - 4);
            }
            return accNumber;
        }
}
