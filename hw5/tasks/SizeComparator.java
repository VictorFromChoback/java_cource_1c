package hw5.tasks;

import java.util.Comparator;


public class SizeComparator implements Comparator<String> {
    public int compare(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return -1;
        } else if (str1.length() > str2.length()) {
            return 1;
        }
        return str1.compareTo(str2);
    }
}