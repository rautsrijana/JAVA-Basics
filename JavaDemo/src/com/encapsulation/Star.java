package com.encapsulation;

public class Star {

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

 // Method 3: Print a pyramid of stars
 public void printPyramid() {
     System.out.println("Pyramid:");
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

 // Method 4: Print an inverted pyramid of stars
 public void printInvertedPyramid() {
     System.out.println("Inverted Pyramid:");
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

