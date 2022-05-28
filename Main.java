package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        PrintShape printShape = new PrintShape();
        System.out.println("printShape = " + printShape.get(new Circle()));
    }
}
