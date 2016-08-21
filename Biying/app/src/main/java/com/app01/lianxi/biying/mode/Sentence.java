package com.app01.lianxi.biying.mode;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Sentence {
//    英文短句
    private String engSentence;
//    译文
    private String chiSentence;

    public Sentence() {
    }

    public Sentence(String engSentence, String chiSentence) {
        this.engSentence = engSentence;
        this.chiSentence = chiSentence;
    }

    public String getEngSentence() {
        return engSentence;
    }

    public void setEngSentence(String engSentence) {
        this.engSentence = engSentence;
    }

    public String getChiSentence() {
        return chiSentence;
    }

    public void setChiSentence(String chiSentence) {
        this.chiSentence = chiSentence;
    }
}
