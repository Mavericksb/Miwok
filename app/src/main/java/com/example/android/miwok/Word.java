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

    private int audioId;

    //sets icon for the relative word
    private int iconImg = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    //@param miwokW the miwok translation of the word
    //@param defaultW default language translation
    public Word (String defaultW, String miwokW, int resAudioId) {
        miwokWord = miwokW;
        defaultWord = defaultW;
        audioId = resAudioId;
    }


    public Word (String defaultW, String miwokW, int resImgId, int resAudioId) {
        miwokWord = miwokW;
        defaultWord = defaultW;
        iconImg = resImgId;
        audioId = resAudioId;
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

    public boolean hasImage() {
        return iconImg != NO_IMAGE_PROVIDED;
    }

    public int getAudioId() { return audioId;}

}
