package com.nt.service;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        App a = new App();
        System.out.println("Sum : "+a.sum(10, 20));
    }
    public int  sum(int x, int y) {
    	return x=+y;
    }
    public int substitute(int x,int y) {
    	return x=-y;
    }
}
