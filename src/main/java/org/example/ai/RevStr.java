package org.example.ai;

public class RevStr {

    public static void main(String args[]) {
        String str = "Nayan";

        String str1 = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(str1)) {
            System.out.println(str + "=> true");
        } else {
            System.out.println(str + "=> false");
        }
    }
}
