package com.itls.smv.stepDefinitions;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static Map<String, String> creditCategoryToCodeMap = new HashMap<String, String>();

    static{
        creditCategoryToCodeMap.put("Wohnen", "886");
        creditCategoryToCodeMap.put("Umschuldung", "8992946");
    }
}
