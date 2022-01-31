import java.math.BigInteger;


public class Decripta {
    public static BigInteger p,q,n,d,aux,aux2,aux3;
    public static int cont= 0;
    static void DecriptarChavePublica(BigInteger n,BigInteger e){
        aux = n;
        aux3 = new BigInteger("1");
        do{ 
            System.out.println(cont);
            cont++;
            aux = aux.subtract(BigInteger.ONE);
            if (aux.isProbablePrime(1)) {
                //System.out.println("Possivel primo maior");
                aux2 = new BigInteger("1");
                do{
                   aux2 = aux2.add(new BigInteger("1"));
                   if (aux2.isProbablePrime(1)){
                    //System.out.println("Possivel");
                       aux3 = aux.multiply(aux2);
                       if (aux3.compareTo(n)==0){
                        System.out.println("Encontrado");
                           break;
                       }
                   }
                }while(aux3.compareTo(n)!=1);
            }
            if(aux3.compareTo(n)==0){
                break;
            }
        }while(aux.compareTo(BigInteger.ONE)!=0);
        p=aux;
        q=aux2;
        System.out.println("D: Numeros = P >>>>" + p + "\n" + "Q >>>> " + q);
		//d = PublicKey.e.modInverse(m);
	}
}
