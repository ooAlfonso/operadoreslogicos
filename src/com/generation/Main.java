package com.generation;

public class Main {

    public static void main(String[] args) {
	boolean X = true;
    boolean Y = false;
    boolean z = true;
    System.out.println( (X && Y) || (X && z) ) ;
    System.out.println((X || !Y)&& (!X || z));
    System.out.println(X || Y && z  );
    System.out.println(!(X || Y) && z );
    System.out.println(X || Y || X && !z && !Y );
    System.out.println(!X || !Y || z && X && !Y);
    }
}
