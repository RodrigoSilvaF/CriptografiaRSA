import java.math.BigInteger;
import java.security.SecureRandom;

public class PrivateKey {
    static BigInteger p, q, d;
    public static BigInteger m;

    //Verifica se Dado Numero eh primo
    static boolean getPrimo(BigInteger numero){
		if (numero.isProbablePrime(1)){
			System.out.println("Eh primo>>>>>>>>> " + numero + "\n");
			return true;
		}           
        else {
			return false;
        }
	}

    //Calcular o Inverso Multiplicativo D
	static void inverseMult(){
		d = PublicKey.e.modInverse(m);
	}

    //Gera valores aleatorios enquanto nao se acha um primo.
	static void generatePrime(){
		boolean check = false;
        SecureRandom r = new SecureRandom();
        
        do{
            p = new BigInteger(128, r); 
            check = getPrimo(p);

        }while (check == false);
		check = false;
		do{
            q = new BigInteger(2048, r); 
            check = getPrimo(q);

        }while (check == false);
		System.out.println("Numeros = P>>>>" + p + "\n" + "Q>>>> " + q);
		PublicKey.n = p.multiply(q);
		m = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
		System.out.println("Valor de M>>>>>> " + m + "\n");
        PublicKey.getPublicKey();
	}
    
}
