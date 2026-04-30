package com.thinksworks.palindrome.external;

public class PalindromeCheck {
    public static void main(String[] args) {
        String name = "";
        String reversed = "";

        for (int i = name.length()-1; i >= 0; i--) {
            reversed = reversed+ name.charAt(i);
        }
        if (name.equals(reversed)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }

    void checkPalidrome(){
        String name = "";
        String reversed = "";

        for (int i = name.length()-1; i >= 0; i--) {
            reversed = reversed+ name.charAt(i);
        }
        if (name.equals(reversed)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
