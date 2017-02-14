package com.example.noora.interviewprepguide.programmingLanguages.java.topics.string.string;

import com.example.noora.interviewprepguide.model.TopicData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by noora on 2/13/2017.
 */

public class StringJavaDataGenerator {

    public static List<TopicData> createStringJavaData() {
        List<TopicData> list = new ArrayList<>();
        list.add(new TopicData("What is the meaning of immutable in terms of String?",
                "The simple meaning of immutable is unmodifiable or unchangeable. " +
                        "Once string object has been created, its value can't be changed."));

        list.add(new TopicData("Why string objects are immutable in java?",
                "Because java uses the concept of string literal." +
                        " Suppose there are 5 reference variables,all referes " +
                        "to one object \"sachin\".If one reference variable changes " +
                        "the value of the object, it will be affected to all the reference" +
                        " variables. That is why string objects are immutable in java."));

        list.add(new TopicData(" How many ways we can create the string object?",
                "There are two ways to create the string object," +
                        " by string literal and by new keyword."));

        list.add(new TopicData("What is css", "Show the def of string"));
        list.add(new TopicData("What is database", "Show the def of string"));
        return list;
    }
}