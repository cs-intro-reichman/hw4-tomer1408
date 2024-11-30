public class Primes {
    public static void main(String[] args) {
   final int N = Integer.parseInt(args[0]);
   int primeNumbers = 0;
   boolean[] numbers = new boolean[N+1];
   for (int i=0; i<=N; i++) numbers[i] = true; // Assume that all numbers are prime
   numbers[0] = false; // non-prime
   numbers[1] = false; // non-prime
    int p = 2; // first prime number
    while (p * p <= N) {
        if (numbers[p]) { //  if p is true == prime
            int multiple = p * p;
            while (multiple <= N) { // Until we reach the end of the array 
                numbers[multiple] = false; // Change the number to false == non-prime
                multiple = multiple + p; // Adding p to continue the multiplication
            }
        }
        p++; 
        
    }
     // Count all prime numbers
     for (int i = 2; i <= N; i++) {
        if (numbers[i]) { //  if i is true == prime
            primeNumbers++;
        }
        }
      
    System.out.println("There are " + primeNumbers + " primes between 2 and " + N + "( " + (primeNumbers * 100 / N) + " % are primes)");
    
}}