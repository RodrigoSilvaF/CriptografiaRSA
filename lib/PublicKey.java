import java.math.BigInteger;

public class PublicKey {
    public static BigInteger n, e;

    static void getPublicKey(){
		e = new BigInteger("3");
    	//while(PrivateKey.m.gcd(e).intValue() > 1) e = e.add(new BigInteger("2"));
		
		while(EuclidianoExt.EExt(e, PrivateKey.m).intValue() > 1){
			e = e.add(new BigInteger("2"));
			System.out.println("Valor inteiro de euchsdaui" + EuclidianoExt.EExt(e, PrivateKey.m).intValue());
		} 
	}
}
