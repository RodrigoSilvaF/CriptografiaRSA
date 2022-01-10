import java.math.*;


public class Encripta {

    //A = Mensagem, E = Coprime entre 1 < e < MMC(P-1,Q-1), N = PRIMO 1 * PRIMO 2, KEY = KEY ;)
    static BigInteger encriptar(BigInteger a){
        // apply pow() method
        BigInteger aux = a.pow(Chave.coprime);
        BigInteger valor = aux.mod(Chave.key);
        return valor;
    }
    //A = Mensagem Codificada, D = INVERSOMULT (E, LAMB), onde lamb eh o mmc de (p-1,q-1), KEY = KEY
    static BigInteger decodificar(BigInteger a){
        BigInteger dec = a.pow(Chave.d);
        BigInteger decodificado = dec.mod(Chave.key);
        return decodificado;
    }
}
