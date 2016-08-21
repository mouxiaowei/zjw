package com.app01.lianxi.biying.mode;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Conntent {
    //时间
    private Date date;

    private List<Word> words;

    private List<Passage> passages;

    private List<Sentence> sentences;

    public Conntent() {
    }

    public Conntent(Date date, List<Word> words, List<Passage> passages, List<Sentence> sentences) {
        this.date = date;
        this.words = words;
        this.passages = passages;
        this.sentences = sentences;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public List<Passage> getPassages() {
        return passages;
    }

    public void setPassages(List<Passage> passages) {
        this.passages = passages;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }
}
