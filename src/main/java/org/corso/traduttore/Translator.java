package org.corso.traduttore;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Translator {

    private Map<Word, Word> translations;


    public Translator() {
        translations = new HashMap<>();
    }

    public void learn(Word wordA, Word wordB) {
        translations.put(wordA, wordB);
        translations.put(wordB, wordA);
    }


    public Word translate(String simpleWordToTranslate) {
        Word result = null;
        for (Map.Entry<Word, Word> entry : translations.entrySet()) {
            Word wordKey = entry.getKey();
            Word wordValue = entry.getValue();
            if (simpleWordToTranslate.equals(wordKey.getWord())) {
                result = wordValue;
            }
        }
        return result;
    }

    public Word badTranslate(Word wordToTranslate) {
        Word result = null;
        if (translations.containsKey(wordToTranslate));
            result = translations.get(wordToTranslate);
        return result;
    }


    public Word translate(Word wordToTranslate) {
        Word result = null;
        for (Map.Entry<Word, Word> entry : translations.entrySet()) {
            Word wordKey = entry.getKey();
            Word wordValue = entry.getValue();
            if (wordToTranslate.getWord().equals(wordKey.getWord())) {
                result = wordValue;
            }
        }
        return result;
    }



    public Word translate(Word wordToTranslate, Language language) {
        Word result = null;
        for (Map.Entry<Word, Word> entry : translations.entrySet()) {
            Word wordKey = entry.getKey();
            Word wordValue = entry.getValue();
            if ((wordToTranslate.getWord().equals(wordKey.getWord()) && (language.getName().equals(language.getName())))) {
                result = wordValue;
            }
        }
        return result;
    }

}
