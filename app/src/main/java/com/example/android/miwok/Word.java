package com.example.android.miwok;

/**
 * @link Word. It contains a class object. It is a vocabulary to let the user learn the miwok language.
 *  The object contains a default translation and the respective miwok translation
 */

public class Word{

    // Miwok translation
    private String miwokWord = "";

    //Default language translation
    private String defaultWord = "";

    //sets icon for the relative word
    private int iconImg;

    //@param miwokW the miwok translation of the word
    //@param defaultW default language translation
    public Word (String defaultW, String miwokW, int resImgId) {
        miwokWord = miwokW;
        defaultWord = defaultW;
        iconImg = resImgId;
    }

    //Get the miwok translation
    public String getMiwokWord(){
        return miwokWord;
    }

    //Get the english translation
    public String getDefaultWord(){
        return defaultWord;
    }

    public int getIconImg() { return iconImg;}
}
