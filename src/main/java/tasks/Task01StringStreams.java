package tasks;

import java.util.Arrays;
import java.util.stream.Collectors;

class Task01StringStreams {

    /**
     * Функция должна вернуть число строчных символов в строке.
     *
     * Пример:
     *  "abcDE" -> 3
     *  "ABC" -> 0
     */
    static long countLowercaseLetters(String str) {
        throw new PleaseImplementMeException();
    }


    /**
     * Функция должна заменить каждое слово в строке его длинной.
     *
     * Слова разделяются одним или более пробелами.
     *
     * Пример:
     *   "a b cd" -> "1 1 2"
     *   "one two   three" -> "3 3 5"
     *
     * Тут подойдут эти методы:
     *    - String::split
     *    - Stream::map
     *    - Stream::collect
     *    - Collectors.joining
     */
    static String replaceWordsOnLength(String str) {
        throw new PleaseImplementMeException();
    }
}