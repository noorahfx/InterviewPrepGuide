package com.example.noora.interviewprepguide.dataGenerator;

import com.example.noora.interviewprepguide.R;
import com.example.noora.interviewprepguide.model.LanguageData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by noora on 2/13/2017.
 */

public class ProgrammingLanguageGenerator {
    public static List<LanguageData> createProgrammingLanguageData() {
        List<LanguageData> list = new ArrayList<>();

        list.add(new LanguageData(R.drawable.java, "Java"));
        list.add(new LanguageData(R.drawable.java, "Database"));
        list.add(new LanguageData(R.drawable.java, "C++"));
        list.add(new LanguageData(R.drawable.java, "C"));
        list.add(new LanguageData(R.drawable.java, "HTML"));
        list.add(new LanguageData(R.drawable.java, "Python"));

        return list;
    }
}


