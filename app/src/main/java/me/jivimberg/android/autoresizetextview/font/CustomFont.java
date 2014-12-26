package me.jivimberg.android.autoresizetextview.font;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum CustomFont {
    AMATIC("fonts/AmaticSC-Regular.ttf"),
    CHAMPAGNE("fonts/Champagne.ttf"),
    RALEWAY_REGULAR("fonts/Raleway-Regular.ttf"),
    FFF("fonts/FFF_Tusj.ttf"),
    PACIFICO("fonts/Pacifico.ttf");


    private final String url;
    private Typeface typeface;

    private static final List<CustomFont> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    CustomFont(String fontUrl) {
        this.url = fontUrl;
    }

    public Typeface getFont(AssetManager assets){
        if (typeface == null) {
            typeface = Typeface.createFromAsset(assets,url);
        }
        return typeface;
    }


    public void setType(TextView textView, AssetManager assets ){
        final Typeface heavyFont = this.getFont(assets);
        textView.setTypeface(heavyFont);
    }

    public static CustomFont randomFont()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
