import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int gcd = 1;  //greatest common divisor
        int div = 2;  //possible gcd
        while(div <= num1 && div <= num2){
            if(num1 % div == 0 && num2 % div == 0)
                gcd = div;
            div++; //next possible gcd
        }
        System.out.println("Greatest common divisor of " + num1 +" and "+ num2 + " is " + gcd);
    }
}

