package org.example.ai;

public class TestAIDemo {

    public static void main(String args[]){

        String str = "SSpringg";

        char[] charArr = str.toCharArray();

        for(int i=0; i< str.length(); i++){
            boolean flag = false;
            for(int j=0; j<str.length(); j++){
                if(i!=j && charArr[i]==charArr[j]){
                    flag=true;
                }
            }

            if(!flag){
                System.out.println("first non rep char -> "+charArr[i]);
                break;
            }
        }
    }
}
