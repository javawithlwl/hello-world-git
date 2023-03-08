package com.careerit.helloworldgit.util;

public final class CommonUtil {

        private CommonUtil(){

        }
        public static String maskAccountNumber(String accNumber){
            if(accNumber!=null && accNumber.length()>=4) {
               return "********" + accNumber.substring(accNumber.length() - 4);
            }
            return accNumber;
        }
}
