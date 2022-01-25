

public class App {
    public static void main(String[] args) throws Exception {
        
        GenerateKeys.Generate();
        //Encripta.encriptar();
        //Encripta.decodificar();
        Decripta.DecriptarChavePublica(GenerateKeys.PublicKeyDic.get("n"), GenerateKeys.PublicKeyDic.get("e"));
        
    }
}
