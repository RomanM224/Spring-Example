package com.maistruk.spring_1.beans;

public class TextEditor_1 {

    private SpellChecker spellChecker_1;
    private int year;
    private int number;
    private String str;

    public TextEditor_1(SpellChecker spellChecker_1, int year, int number, String str) {
        this.spellChecker_1 = spellChecker_1;
        this.year = year;
        this.number = number;
        this.str = str;
    }

    public void spellCheck() {
        spellChecker_1.checkSpelling();
    }

    public SpellChecker getSpellChecker_1() {
        return spellChecker_1;
    }

    public void setSpellChecker_1(SpellChecker spellChecker_1) {
        this.spellChecker_1 = spellChecker_1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

}
