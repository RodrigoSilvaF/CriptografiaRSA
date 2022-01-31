import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class App {
    
    public static void main(String[] args) throws Exception {
        PrivateKey.bitlengh = 2048;
         for (int i = 0;i<10;i++){
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

        try(FileWriter fw = new FileWriter("IntervalGen.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
                {
                out.print("" + (stopTime - startTime)/1000 + ",");   
                } catch (IOException e) {
                    //exception handling left as an exercise for the reader
                }
                try(FileWriter fw = new FileWriter("IntervalEncrip.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
                {
                out.print("" + (stopEncTime - startEncTime)/1000 + ",");   
                } catch (IOException e) {
                    //exception handling left as an exercise for the reader
                }
                try(FileWriter fw = new FileWriter("IntervalDecrip.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
                {
                out.print("" + (stopDecTime - startDecTime)/1000 + ",");   
                } catch (IOException e) {
                    //exception handling left as an exercise for the reader
                }
                
        }
        try(FileWriter fw = new FileWriter("IntervalGen.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
                {
                out.println("  ");   
                out.println(PrivateKey.bitlengh + 64);
                } catch (IOException e) {
                    //exception handling left as an exercise for the reader
                }
                try(FileWriter fw = new FileWriter("IntervalEncrip.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
                {
                out.println("  "); 
                out.println(PrivateKey.bitlengh + 64);  
                } catch (IOException e) {
                    //exception handling left as an exercise for the reader
                }
                try(FileWriter fw = new FileWriter("IntervalDecrip.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
                {
                out.println("  ");   
                out.println(PrivateKey.bitlengh + 64);
                } catch (IOException e) {
                    //exception handling left as an exercise for the reader
                }
                
        //System.out.println("Tempo decriptacao >>>> " + (stopDecription - startDecription)/1000);
    }
}
