package org.example;
public class Complex {
     void plus(double r1, double r2, double i1, double i2){
         if(i1+i2 == 0){
             System.out.printf("Sum is: %.2f%n",r1+r2);
         }else if(r1+r2 == 0){
             System.out.printf("Sum is: %+.2fi%n",i1+i2);
         }else{
             System.out.printf("Sum is: %.2f %+.2fi5%n",r1+r2,i1+i2);
        }
     }
     void minus(double r1, double r2, double i1, double i2){
         if(i1-i2 == 0){
             System.out.printf("Minus is: %.2f%n",r1-r2);
         }else if(r1-r2 == 0){
             System.out.printf("Minus is: %+.2fi%n",i1-i2);
         }else{
             System.out.printf("Minus is: %.2f %+.2fi%n",r1-r2,i1-i2);
         }
     }
     double multiple(double r1, double r2, double i1, double i2){
         double finalReal = r1*r2 - i1*i2;
         double finalImaginary = r1*i2 + i1*r2;
         double result;
         if(finalImaginary == 0){
             result = finalReal;
             System.out.printf("Multiple is: %.2f%n",result);
             return result;
         }else if(finalReal == 0){
             result = finalImaginary;
             System.out.printf("Multiple is: %+.2fi%n",result);
             return result;
         }else{
             result = finalReal+finalImaginary;
             System.out.printf("Multiple is: %.2f %+.2fi%n",(r1*r2 - i1*i2),(r1*i2 + i1*r2));
             return result;
         }
     }
     void conjugate(double r, double i){
         if((i == 0)){
             System.out.printf("The entered number doesn't have any conjugate!%n");
         }else if(r == 0){
             System.out.printf("Conjugate: %+.2fi%n",(-1*i));
         }else{
             System.out.printf("Conjugate: %.2f %+.2fi%n",r,(-1*i));
         }
     }
     //PrivateMultiple() method can be only used in division() method
    private String PrivateMultiple(double r1, double r2, double i1, double i2){
        double finalReal = r1*r2 - i1*i2;
        double finalImaginary = r1*i2 + i1*r2;
        if(finalImaginary == 0){
            return String.valueOf(finalReal);
        }else if(finalReal == 0){
            return finalImaginary+"i";
        }else{
            return finalReal+" + "+finalImaginary+"i";
        }
    }
    void division(double r1, double r2, double i1, double i2){
        String numerator = PrivateMultiple(r1,r2,i1,(-1*i2));
        String denominator  = String.valueOf((r2*r2)+(i2*i2));
        System.out.println("Division result: "+numerator+" / "+denominator );
    }

}


