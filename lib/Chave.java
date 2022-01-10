// Java program Miller-Rabin primality test
import java.math.BigInteger;

class Chave {
    static BigInteger key1;
    static BigInteger key2;
    static BigInteger key;
    static int coprime = 17;
    static int lamb;
    static BigInteger value;
    static int testekey1 = 61;
    static int testekey2 = 53;
    //CO prime
    static int e = 17;
    //----------------
    static int d;
    static int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    //Algoritmo do MMC
     static int mmc(int a, int b){
        return (a * (b / mdc(a, b)));
    }

    static int inversomult(int a, int m){
        for (int x = 1; x < m; x++)
            if (((a%m) * (x%m)) % m == 1){
                return x;
            }
                return 0;
    }

    public void getKey(){
        value = new BigInteger("1");
        key1 = new BigInteger("61");
        key2 = new BigInteger("53");
        key = key1.multiply(key2);
        lamb = mmc(testekey1-1, testekey2-1);
        d = inversomult(e, lamb);
    }




	// Utility function to do modular
	// exponentiation. It returns (x^y) % p
	static int power(int x, int y, int p) {
		
		int res = 1; // Initialize result
		
		//Update x if it is more than or
		// equal to p
		x = x % p;

		while (y > 0) {
			
			// If y is odd, multiply x with result
			if ((y & 1) == 1)
				res = (res * x) % p;
		
			// y must be even now
			y = y >> 1; // y = y/2
			x = (x * x) % p;
		}
		
		return res;
	}
	
	// This function is called for all k trials.
	// It returns false if n is composite and
	// returns false if n is probably prime.
	// d is an odd number such that d*2<sup>r</sup>
	// = n-1 for some r >= 1
	static boolean miillerTest(int d, int n) {
		
		// Pick a random number in [2..n-2]
		// Corner cases make sure that n > 4
		int a = 2 + (int)(Math.random() % (n - 4));
	
		// Compute a^d % n
		int x = power(a, d, n);
	
		if (x == 1 || x == n - 1)
			return true;
	
		// Keep squaring x while one of the
		// following doesn't happen
		// (i) d does not reach n-1
		// (ii) (x^2) % n is not 1
		// (iii) (x^2) % n is not n-1
		while (d != n - 1) {
			x = (x * x) % n;
			d *= 2;
		
			if (x == 1)
				return false;
			if (x == n - 1)
                
				return true;
		}
	
		// Return composite
		return false;
	}

	// It returns false if n is composite
	// and returns true if n is probably
	// prime. k is an input parameter that
	// determines accuracy level. Higher
	// value of k indicates more accuracy.
	static boolean isPrime(int n, int k) {
		
		// Corner cases
		if (n <= 1 || n == 4)
			return false;
		if (n <= 3)
			return true;
	
		// Find r such that n = 2^d * r + 1
		// for some r >= 1
		int d = n - 1;
		
		while (d % 2 == 0)
			d /= 2;
	
		// Iterate given nber of 'k' times
		for (int i = 0; i < k; i++)
			if (!miillerTest(d, n))
				return false;
	
		return true;
	}
	
	// Driver program
	public static void main(String args[]) {
		
		int k = 4; // Number of iterations
	
		System.out.println("All primes smaller "
								+ "than 100: ");
								
		for (int n = 1; n < 100; n++)
			if (isPrime(n, k))
				System.out.print(n + " ");
                
	}
}

/* This code is contributed by Nikita Tiwari.*/
