
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.*;


public class Encripta {
    static String msgencriptada;
    static String msgdesencrip;
    

    //A = Mensagem, E = Coprime entre 1 < e < MMC(P-1,Q-1), N = PRIMO 1 * PRIMO 2, KEY = KEY ;)
    static void encriptar(){
        try {
            FileReader arq = new FileReader("C:/Users/Rodrigo/Documents/UDESC/Backup/UDESC 2021-2/CAL/Trabalho 1/CriptografiaRSA/RSA/src/texto.txt");
            BufferedReader lerArq = new BufferedReader(arq);
      
            String msg = lerArq.readLine(); 
            while (msg != null) {
              msgencriptada = new BigInteger(msg.getBytes()).modPow(GenerateKeys.PublicKeyDic.get("e"), GenerateKeys.PublicKeyDic.get("n")).toString();
              try(FileWriter fw = new FileWriter("TextoCriptografado.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
                {   
                out.println(msgencriptada);   
                } catch (IOException e) {
                    //exception handling left as an exercise for the reader
                }
                msg = lerArq.readLine();            
           }
            arq.close();
          } catch (IOException e) {
              System.err.printf("Erro na abertura do arquivo: %s.\n",
                e.getMessage());
          }
    }

    //A = Mensagem Codificada, D = INVERSOMULT (E, LAMB), onde lamb eh o mmc de (p-1,q-1), KEY = KEY
    static void decodificar() throws IOException{
        FileReader arq = new FileReader("C:/Users/Rodrigo/Documents/UDESC/Backup/UDESC 2021-2/CAL/Trabalho 1/CriptografiaRSA/RSA/TextoCriptografado.txt");
        BufferedReader lerArq = new BufferedReader(arq);
        String msg = lerArq.readLine(); 
        while (msg != null) {
          String msgdesencrip = new String(new BigInteger(msg).modPow(GenerateKeys.PrivateKeyDic.get("d"), GenerateKeys.PrivateKeyDic.get("n")).toByteArray());
          try(FileWriter fw = new FileWriter("TextoDesencritografado.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
            {   
            out.println(msgdesencrip);   
            } catch (IOException e) {
                //exception handling left as an exercise for the reader
         }
          msg = lerArq.readLine();            
       }
        arq.close();
      } 
    }

