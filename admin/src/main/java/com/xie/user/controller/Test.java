package com.xie.user.controller;

/**
 * .
 *
 * @date: 2020-11-26
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */
public class Test {

    public static int methodA(){
        int a = 1;
        int b = 2;
        int c = a + b;
        return c;
    }
    public static void main(String[] args){
        String a = new String("abc").intern();
        String b = new String("abc").intern();
        if(a == b){
            System.out.println("a==b");
        }else{
            System.out.println("a!=b");
        }

        String c = "a";
        String d = "a";
        if(c == d){
            System.out.println("c==d");
        }else{
            System.out.println("c!=d");
        }
        System.out.println(methodA());
    }
}
