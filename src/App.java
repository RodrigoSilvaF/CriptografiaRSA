import java.math.BigInteger;


public class App {

    static BigInteger msg = new BigInteger("65");
   

    public static void main(String[] args) throws Exception {
        GenerateKeys.Generate();

        Encripta.encriptar("Takeo nao sabe da existencia do Protetor");
        Encripta.decodificar(Encripta.msgencriptada);
        
    }
}
