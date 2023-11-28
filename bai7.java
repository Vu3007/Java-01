import java.util.Scanner;

public class bai7 {
    public static  double bmi(double a, double b){
        return a/ (b*b) ;
    }

    public static void main(String[] args) {
        double x= bmi(60 , 1.65);
        System.out.println( "BMI la: "+x);
        }

    }

