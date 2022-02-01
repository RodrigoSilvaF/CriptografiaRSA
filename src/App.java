import java.math.BigInteger;

public class App {
    public static BigInteger a,b,c,d;

    public static void main(String[] args) throws Exception {
        
        
        GenerateKeys.Generate();
        Encripta.encriptar();
        Encripta.decodificar();
        EuclidianoExt.EExt(a, b);
        Decripta.DecriptarChavePublica(GenerateKeys.PublicKeyDic.get("n"), GenerateKeys.PublicKeyDic.get("e"));
        
    }
}
