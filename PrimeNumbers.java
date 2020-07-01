public class PrimeNumbers {
    public static void main(String[] args) {
        final int NO_OF_PRIMES = 50;
        final int NO_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        // findd the prime numbers
        while (count < NO_OF_PRIMES) {
            boolean isPrime = true;
            // test the number
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count % NO_OF_PRIMES_PER_LINE == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }

            number++;
        }
    }
}