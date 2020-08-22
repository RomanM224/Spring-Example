package com.maistruk.spring_1.beans.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import com.maistruk.spring_1.beans.SpellChecker;

public class AutowiredOnConstructorAnnotation {

    private SpellChecker spellChecker;
    
    @Autowired
    public AutowiredOnConstructorAnnotation(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
