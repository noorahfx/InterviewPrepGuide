package com.example.noora.interviewprepguide.programmingLanguages.java.dataGenerator;

import com.example.noora.interviewprepguide.R;
import com.example.noora.interviewprepguide.model.LanguageData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by noora on 2/13/2017.
 */

public class JavaTopicsGenerator {
    public static List<LanguageData> createJavaTopicsGenerator() {
        List<LanguageData> list = new ArrayList<>();

        list.add(new LanguageData(R.drawable.java, "Basic Java"));
        list.add(new LanguageData(R.drawable.java, "String"));
        list.add(new LanguageData(R.drawable.java, "Array"));
        list.add(new LanguageData(R.drawable.java, "OOP"));
        list.add(new LanguageData(R.drawable.java, "Thread"));
        list.add(new LanguageData(R.drawable.java, "Data Structure"));

        return list;
    }
}
