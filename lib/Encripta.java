import java.math.*;


public class Encripta {
    static int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    static int mmc(int a, int b){
        return (a * (b / mdc(a, b)));
    }

    static int inversomult(int a, int m){
        for (int x = 1; x < m; x++)
            if (((a%m) * (x%m)) % m == 1){
                return x;
            }
        return 0;
    }

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
