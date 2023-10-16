package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
package com.epam.utils;

        public class StringUtils {
            public static boolean isPositiveNumber(String str) {
                if (str == null){
                    return false;
                }else if (str.contains("-") || str.contains("null") || str.equals("") || str.contains(" ")){
                    return false;
                }else if (str.contains(".")){
                    return Double.parseDouble(str) > 0;
                }else {
                    return Integer.parseInt(str) > 0;
                }
            }
        }    }
}
