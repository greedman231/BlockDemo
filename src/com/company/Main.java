package com.company;

public class Main {

    public static void main(String[] args) {
	boolean b;

    b = false;
    System.out.println("b равно " + b);
    b = true;
    System.out.println("b равно " + b);

    if (b) System.out.println("Как вы думаете, увидите ли вы эту строку?");
    System.out.println("Вырожение 10 > 9 имеет значение" + (10 > 9));
    }
}
