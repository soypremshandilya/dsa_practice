package Strings;

import java.util.StringTokenizer;

public class stringToken {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My Name is Prem");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
