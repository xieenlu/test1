package com.xie;

import java.util.Stack;

/**
 * 栈学习.
 *
 * @date: 2019-08-01
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */
public class TestStack {
    String str = new String("good");
    char[] a = {'a','b','c'};
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(3);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        TestStack test = new TestStack();
        test.change(test.str,test.a);
        System.out.println(test.str+"====="+test.a+"====="+String.copyValueOf(test.a));
    }

    public void change(String str1,char[] a){
        str1 = "change";
        a[0] = 'n';
    }



}
