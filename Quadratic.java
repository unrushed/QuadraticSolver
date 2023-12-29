/*
 * Ryan Hayden
 * 9/13/23
 *
 * This program calculates the roots of a quadratic equation when the user inputs the a, b, and c of the quadratic equation. It also determines the amount of roots per the input of the user.
 */

import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        double a, b, c, discriminant, r1, r2;
        System.out.println("This program solves the quadratic equation ax^2 + bx + c = 0 .");
        System.out.print("Enter a: ");
        a = userInput.nextDouble(); //stores the value of the quadratic equation inputted by the user
        if (a == 0){
            //this detects whether this is a quadratic equation
            System.out.println("If a = 0, it is not a quadratic equation.");
        }
        else{
            System.out.print("Enter b: ");
            b = userInput.nextDouble(); //stores the value of b inputted by the user
            System.out.print("Enter c: ");
            c = userInput.nextDouble(); //stores the value of c inputted by the user
            discriminant = (b * b) - (4 * a * c);
            if (discriminant < 0){
                // if the discriminant is less than zero it has no real roots as it would a complex number
                System.out.println("The equation has no real roots.");
            }
            else if (discriminant == 0){
                //calculates the one root this equation has
                r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The quadratic has one real root " + r1);
            }
            else{
                //calculates the two roots this equation has
                 r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                r2 = (-b - Math.sqrt(discriminant))/ (2 * a);
                System.out.println("The quadratic has two real roots " + r1 + " and " + r2);
            }
        }
    }
}