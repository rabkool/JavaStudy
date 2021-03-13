package Study2;

import java.util.Arrays;

/**
 * @author 90595
 */
class Comb {
    public static void main(String[] args) {
        char[] date = "ねこふだぼ".toCharArray();
        f(date, 0);
    }

    private static void f(char[] date, int k) {
        if (k == date.length) {
            for (char c : date) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = k; i < date.length; i++) {
            {
                char t = date[k];
                date[k] = date[i];
                date[i] = t;
            }
            f(date, k + 1);
            {
                char t = date[k];
                date[k] = date[i];
                date[i] = t;
            }
        }
    }
}
