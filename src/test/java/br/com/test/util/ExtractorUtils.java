package br.com.test.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class to handle extraction methods.
 */
public final class ExtractorUtils {

    private ExtractorUtils() {}

    /**
     * Method to extract all numbers from some String
     * @param text text that contains numbers to extract
     * @return a list containing all extracted numbers
     */
    public static List<Integer> extractNumbersFromText(String text) {
        final List<Integer> numbers = new ArrayList<>();
        final Matcher matcher = Pattern.compile("\\d+").matcher(text);

        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }

        return numbers;
    }
}
