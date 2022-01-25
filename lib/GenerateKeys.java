import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Dictionary;
import java.util.Hashtable;

public class GenerateKeys {

    public static Dictionary<String, BigInteger> PrivateKeyDic = new Hashtable<String, BigInteger>();
    public static Dictionary<String, BigInteger> PublicKeyDic = new Hashtable<String, BigInteger>();
    
    static void Generate(){
        PrivateKey.generatePrime();
        PrivateKey.inverseMult();
        PrivateKeyDic.put("n", PublicKey.n);
        PrivateKeyDic.put("d", PrivateKey.d);
        PublicKeyDic.put("n", PublicKey.n);
        PublicKeyDic.put("e", PublicKey.e);
        try(FileWriter fw = new FileWriter("Chaves.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
                {   
                out.println("Chave privada D");
                out.println(PrivateKeyDic.get("d"));
                out.println("Chave privada N");
                out.println(PrivateKeyDic.get("n"));
                out.println("Chave publica E");
                out.println(PublicKeyDic.get("e"));   
                out.println("Chave publica N");
                out.println(PublicKeyDic.get("n"));
                } catch (IOException e) {
                    //exception handling left as an exercise for the reader
            }
    }
}
