import java.math.BigInteger;

public class PublicKey {
    public static BigInteger n, e;

    static void getPublicKey(){
		e = new BigInteger("3");
    	while(PrivateKey.m.gcd(e).intValue() > 1) e = e.add(new BigInteger("2"));
	}
}
