package com.encapsulation;


//Q2:-Write a Java Code with a Class having 4 methods , 
//in each method you have print a new Star pattern create another child 
//class which will inherit the parent class with 4 methods and with the
//help of child class object call all the 4 methods
public class Pattern {

 // Method 1: Print a straight line of stars
 public void printLine() {
     System.out.println("Line of stars:");
     System.out.println("**********");
 }

 // Method 2: Print a right triangle of stars
 public void printRightTriangle() {
     System.out.println("Right triangle:");
     for (int i = 0; i < 5; i++) {
         for (int j = 0; j <= i; j++) {
             System.out.print("*");
         }
         System.out.println();
     }
 }

 // Method 3: Print a triangle of stars
 public void printtriangle() {
     System.out.println("triangle:");
     int rows = 5;
     for (int i = 0; i < rows; i++) {
         for (int j = rows - i; j > 1; j--) {
             System.out.print(" ");
         }
         for (int j = 0; j <= i; j++ ) {
             System.out.print("* ");
         }
         System.out.println();
     }
 }

 // Method 4: Print an inverted triangle of stars
 public void printInvertedtriangle() {
     System.out.println("Inverted triangle:");
     int rows = 5;
     for (int i = rows; i > 0; i--) {
         for (int j = rows - i; j > 0; j--) {
             System.out.print(" ");
         }
         for (int j = 0; j < i; j++ ) {
             System.out.print("* ");
         }
         System.out.println();
     }
 }
}

