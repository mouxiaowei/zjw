package com.app01.lianxi.biying.mode;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Word {

    private int image;
    //   音标
    private String ipa;
    //   词义
    private String sense;

    public Word() {
    }

    public Word(int image, String sense, String ipa) {
        this.image = image;
        this.sense = sense;
        this.ipa = ipa;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getSense() {
        return sense;
    }

    public void setSense(String sense) {
        this.sense = sense;
    }

    public String getIpa() {
        return ipa;
    }

    public void setIpa(String ipa) {
        this.ipa = ipa;
    }
}
