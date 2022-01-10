import java.math.BigInteger;

public class App {
    static Chave generate = new Chave();
    static BigInteger teste;
    static BigInteger dec;
    static BigInteger msg = new BigInteger("2");

    public static void main(String[] args) throws Exception {
        generate.getKey();  
        System.out.println(Chave.key);
        teste = Encripta.encriptar(msg);
        System.out.printf("Mensagem codificada> %d\n", teste);
        dec = Encripta.decodificar(teste);
        System.out.printf("Mensagem decodificada> %d\n", dec);
    }
}
