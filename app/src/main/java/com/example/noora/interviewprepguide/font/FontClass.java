package com.example.noora.interviewprepguide.font;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by noora on 2/14/2017.
 */

public class FontClass {

    public static Typeface getCaviarDreamFont (Context c){
        return Typeface.createFromAsset(c.getAssets(), "CaviarDreams.ttf");
    }


}
