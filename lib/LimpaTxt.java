import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LimpaTxt {

    public static void clear(){
        try(FileWriter fw = new FileWriter("TextoCriptografado.txt", false);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
                {   
                  out.print("");
                } catch (IOException e) {
                    //exception handling left as an exercise for the reader
                }
    
    try(FileWriter fw = new FileWriter("TextoDesencritografado.txt", false);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
                {   
                  out.print("");
                } catch (IOException e) {
                    //exception handling left as an exercise for the reader
                }
    }
    
}
