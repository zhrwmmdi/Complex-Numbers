package org.example;
import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    static double i1,i2,r1,r2;
    static Complex complex = new Complex();
    public static void main(String[] args) {
        getNumbers();
            complex.division(r1,r2,i1,i2);
            complex.plus(r1,r2,i1,i2);
            complex.minus(r1,r2,i1,i2);
            complex.multiple(r1,r2,i1,i2);

        getNumber();
            complex.conjugate(r1,i1);

    }
    //"\u001B[0m" and "\u001B[35m" are used before Strings to change the color.
    public static void getNumbers(){
        System.out.print("\u001B[35m"+"Enter REAL PART and IMAGINARY PART of the first complex number: ");
        r1 = input.nextDouble();
        i1 = input.nextDouble();
        System.out.print("\u001B[35m"+"Enter REAL PART and IMAGINARY PART of the second complex number: ");
        r2 = input.nextDouble();
        i2 = input.nextDouble();
        if(i1 == 0 && i2 ==0){
            System.out.printf("\u001B[0m"+"The entered numbers: %.2f\t\t%.2f",r1,r2);
        }else if(i1 == 0){
            System.out.printf("\u001B[0m"+"Entered numbers: %.2f\t\t%.2f %+.2fi",r1,r2,i2);
        }else if(i2 == 0){
            System.out.printf("\u001B[0m"+"Entered numbers: %.2f %+.2fi\t\t%.2f",r1,i1,r2);
        }else if(r1 == 0 && r2 == 0){
            System.out.printf("\u001B[0m"+"Entered numbers: %+.2fi\t\t%+.2fi",i1,i2);
        }else if(r1 == 0){
            System.out.printf("\u001B[0m"+"Entered numbers: %+.2fi\t\t%.2f %+.2fi",i1,r2,i2);
        }else if(r2 == 0){
            System.out.printf("\u001B[0m"+"Entered numbers: %.2f %+.2fi\t\t%+.2fi",r1,i1,i2);
        }else{
            System.out.printf("\u001B[0m"+"Entered numbers: %.2f %+.2fi\t\t%.2f %+.2fi\n",r1,i1,r2,i2);
        }
    }
    public static void getNumber(){
        System.out.print("\u001B[35m"+"Enter REAL PART and IMAGINARY PART of the complex number: ");
        r1 = input.nextDouble();
        i1 = input.nextDouble();
        if(i1 == 0){
            System.out.printf("\u001B[0m"+"Entered number: %.2f\n",r1);
        }else if(r1 == 0){
            System.out.printf("\u001B[0m"+"Entered number: %+.2fi\n",i1);
        }else{
            System.out.printf("\u001B[0m"+"Entered number: %.2f %+.2fi\n",r1,i1);
        }
    }

}