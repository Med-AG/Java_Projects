package str_test;
import java.io.*;

public class Tp6_exo1 {
    
    public static void main(String[] args) throws IOException {
        
        File data = new File("C:\\data");
        if (!data.exists()) {
            data.mkdir();
        }
        File file = new File("C:\\data\\fichier.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write("Hamdaoui Adil\n" + "Salimi Hicham\n" + "Zeroul Hasna\n" + "Hakim Redouane");
        bw.flush();
        bw.close();
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();
        while (line != null) {            
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
        
        
    }
}
