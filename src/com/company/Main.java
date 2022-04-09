package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите айпи адрес:");
        Scanner sc1=new Scanner(System.in);
        String ip= sc1.nextLine();
        String inpud =ip;
        boolean result=inpud.matches("(((2[0-5]{2})|(2[0-4]\\d)|1\\d{2}|\\d{2}|\\d)\\.){3}((2[0-5]{2})|(2[0-4]\\d|1\\d{2}|\\d{2}|\\d))");
    if(result){
        System.out.println("Ok");
    }
    else {
        System.out.println("Error");
    }
    }

}