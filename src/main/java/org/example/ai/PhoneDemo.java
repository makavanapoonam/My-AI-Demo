package org.example.ai;

public class PhoneDemo {

    public static void main(String args[]){

//        Phone phone = new Phone(2,"MI",20000,"red");

        Phone phone = new PhoneBuilder().setName("MI").getPhone();

        System.out.println(phone);
    }
}
