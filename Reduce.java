public class Reduce{
  public static int[] myFraction(int[] A){
      int g = gcd(A[0], A[1]); 
      A[1]/=g; A[0]/=g; 
      return A;
    }
   public static int gcd (int a , int b ) {  
       return b==0?a:gcd(b,a%b);
   }
}

/*
Write a function which reduces fractions to their simplest form! Fractions will be presented as an array/tuple (depending on the language) of strictly positive integers, and the reduced fraction must be returned as an array/tuple:

input:   [numerator, denominator]
output:  [reduced numerator, reduced denominator]
example: [45, 120] --> [3, 8]
All numerators and denominators will be positive integers.

Note: This is an introductory Kata for a series... coming soon!
*/