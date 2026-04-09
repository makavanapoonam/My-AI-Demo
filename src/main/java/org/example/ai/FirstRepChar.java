package org.example.ai;

public class FirstRepChar {

    public static void main(String args[]){

        String str = "springpi";

        char[] chrArr = str.toCharArray();
        
        char dup = 0;

        for(int i=0; i<str.length();i++){
            for(int j=i+1; j<str.length(); j++){
                if(chrArr[i] == chrArr[j]){
                    dup = chrArr[j];
                    break;
                }
            }
        }

        System.out.println("first rep char -> "+dup);
    }
}
