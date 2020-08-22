package com.maistruk.spring_1.beans.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import com.maistruk.spring_1.beans.SpellChecker;

public class AutowiredOnPropertyAnnotation {

    @Autowired
    private SpellChecker spellChecker;

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void say() {
        System.out.println("Inside in AutowiredOnPropertyAnnotation");
        
    }

}
