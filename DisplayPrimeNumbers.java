import java.util.Scanner;

public class DisplayPrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Numbers of Primes");
        int numberOfPrimes = input.nextInt();

        int count = 0;
        int number = 2;

        System.out.println("First " + numberOfPrimes+ " prime numbers are:" );

        while(count < numberOfPrimes){
            boolean isPrime = true;
            for(int divisor = 2; divisor<=number/2; divisor++){
                if (number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                count++;
                System.out.println(number);
            }
            number++;
        }

    }
}
