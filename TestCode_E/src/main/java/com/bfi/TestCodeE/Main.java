package com.bfi.TestCodeE;

public class Main {

    public static String Mask(String original) {
        StringBuilder ret = new StringBuilder();
        String[] word = original.split(" ");
        for (String obj : word) {
            if (obj.length() == 2) {
                String newWord = obj;
                ret.append(newWord);
            } else {
                String newWord = ReplaceWord(obj, '*');
                ret.append(newWord);
            }
            ret.append(" ");
        }

        String result = ret.toString();
        return result.substring(0, result.length() - 1);
    }

    public static String ReplaceWord(String word, char replacer) {
        StringBuilder ret = new StringBuilder();
        if (word.length() > 2) {
            ret.append(word.charAt(0));
            for (int i = 1; i < word.length() - 1; i++) {
                ret.append(replacer);
            }
            ret.append(word.charAt(word.length() - 1));
            return ret.toString();
        }

        return word;
    }

    public static void main(String[] args) {
        System.out.println(Mask("To Stark"));
        System.out.println(Mask("Peter Parker"));
        System.out.println(Mask("Bumblebee"));
        System.out.println(Mask("El Taurino"));
        System.out.println(Mask("John Doe"));
        System.out.println(Mask("Crazy Rich Asian"));
        System.out.println(Mask("Stephen Strange"));
        System.out.println(Mask("A Kid With Supernatural Abilities"));
    }

}
