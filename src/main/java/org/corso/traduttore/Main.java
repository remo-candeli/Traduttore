package org.corso.traduttore;

public class Main {

    private Translator translator = new Translator();

    public static void main(String[] args) {

        Main main = new Main();

        Language english = new Language("inglese");
        Language italian = new Language("italiano");


        main.translator.learn(new Word(english, "bye"      ), new Word(italian, "ciao"         ));
        main.translator.learn(new Word(english, "soft"     ), new Word(italian, "morbido"      ));
        main.translator.learn(new Word(english, "dream"    ), new Word(italian, "sogno"        ));
        main.translator.learn(new Word(english, "old"      ), new Word(italian, "vecchio"      ));
        main.translator.learn(new Word(english, "old "     ), new Word(italian, "vecchio "     ));

        main.translator.learn(new Word(english, "fly"       ), new Word(italian,  "volare"   ));
        main.translator.learn(new Word(english, "sing"       ), new Word(italian, "cantare"   ));
        main.translator.learn(new Word(english, "song"       ), new Word(italian, "canzone"   ));
        main.translator.learn(new Word(english, "bell"       ), new Word(italian, "campana"   ));
        main.translator.learn(new Word(english, "friend"   ), new Word(italian,   "amico"       ));
        main.translator.learn(new Word(english, "carpet"     ), new Word(italian, "tappeto"     ));
        main.translator.learn(new Word(english, "commit"    ), new Word(italian,  "commit"      ));



        System.out.println(main.badTranslation(new Word(english, "commit"    )));
        System.out.println(main.badTranslation(new Word(italian, "tappeto"    )));
        System.out.println(main.badTranslation(new Word(italian, "amico"    )));
        System.out.println(main.badTranslation(new Word(italian, "vecchio"    )));

        System.out.println(main.goodTranslation(new Word(italian, "vecchio"    ), english));


    }

    public String simpleTranslation(String wordText) {
        Word word = translator.translate(wordText);
        if (word==null)
            return "vocabolo non trovato!";
        return wordText + " = " + word.getWord() + " in " + word.getLanguage().getName();
    }


    public String badTranslation(Word wordIn) {
        Word wordOut = translator.badTranslate(wordIn);
        if (wordOut==null)
            return "vocabolo non trovato!";
        return wordIn.getWord() + " = " + wordOut.getWord() + " in " + wordOut.getLanguage().getName();
    }


    public String goodTranslation(Word wordIn, Language language) {
        Word wordOut = translator.translate(wordIn, language);
        if (wordOut==null)
            return "vocabolo non trovato!";
        return wordIn.getWord() + " = " + wordOut.getWord() + " in " + wordOut.getLanguage().getName();
    }
}
