public class PrimeNumber {
/*
*Java program to check if the given number is Prime
* @autor Pabel Lopez
* */

    public static void main(String[] args) {
        System.out.println("number 3" + isPrime(3));
        System.out.println("number 4" + isPrime(4));
        System.out.println("number 19" + isPrime(19));
    }

    public static boolean isPrime(int number) {
        //base scenario
        if (number==0 || number ==1){
            return false;
        }
        //first prime number
        if (number==2){
           return true;
        }
        //if the provided number is not in base case then divide by natural numbers, only if remaining is not zero is prime
        for (int i =2; i<= number/2; i++){
            if (number % i == 0){
                //number is divisible, not a prime number
                return false;
            }
        }
        return true;
    }
}
