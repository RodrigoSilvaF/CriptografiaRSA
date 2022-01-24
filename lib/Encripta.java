import java.math.*;


public class Encripta {
    static String msgencriptada;
    static String msgdesencrip;
    //A = Mensagem, E = Coprime entre 1 < e < MMC(P-1,Q-1), N = PRIMO 1 * PRIMO 2, KEY = KEY ;)
    static void encriptar(String msg){
        // apply pow() method
        msgencriptada = new BigInteger(msg.getBytes()).modPow(GenerateKeys.PublicKeyDic.get("e"), GenerateKeys.PublicKeyDic.get("n")).toString();
        System.out.println("Mensagem Encriptada: "+ msgencriptada);
    }

    //A = Mensagem Codificada, D = INVERSOMULT (E, LAMB), onde lamb eh o mmc de (p-1,q-1), KEY = KEY
    static void decodificar(String msg){
        String msgdesencrip = new String(new BigInteger(msg).modPow(GenerateKeys.PrivateKeyDic.get("d"), GenerateKeys.PrivateKeyDic.get("n")).toByteArray());
        System.out.println("Mensagem Desencriptada: " +msgdesencrip);
    }
}
