// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.PrintWriter;


public class App {
    
    public static void main(String[] args) throws Exception {
        //Alterar o tamanho da chave 
        PrivateKey.bitlengh = 256;
        //^^^^^^^^^^^^^^^^^^^^^^^
            LimpaTxt.clear();  
            double startTime = System.currentTimeMillis(); 
        GenerateKeys.Generate();      
            double stopTime = System.currentTimeMillis();
            double startEncTime = System.currentTimeMillis();
        Encripta.encriptar();        
            double stopEncTime = System.currentTimeMillis();
            double startDecTime = System.currentTimeMillis();
        Encripta.decodificar();      
            double stopDecTime = System.currentTimeMillis();
        //double startDecription = System.currentTimeMillis();
        //Decripta.DecriptarChavePublica(GenerateKeys.PublicKeyDic.get("n"), GenerateKeys.PublicKeyDic.get("e"));
        //double stopDecription = System.currentTimeMillis();
        System.out.println(" Tempo de geracao de chave >>>> " + (stopTime - startTime)/1000);
        System.out.println(" Tempo de encriptacao >>>> " + (stopEncTime - startEncTime)/1000);
        System.out.println(" Tempo de desencriptacao >>>> " + (stopDecTime - startDecTime)/1000);
        //System.out.println(" Tempo de Quebra de Chave >>>> " + (stopDecription - startDecription)/1000);

    }
}
