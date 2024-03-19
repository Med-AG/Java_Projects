package str_test;
import java.io.*;

public class Tp6_exo2 {
    
    public static void main(String[] args) throws IOException{
        
        File inFile = new File("C:\\data\\somIn.txt");
        if (!inFile.exists()) {
            inFile.createNewFile();
        }
        File outFile = new File("C:\\data\\somOut.txt");
        if (!outFile.exists()) {
            outFile.createNewFile();
        }
        
        BufferedReader br = new BufferedReader(new FileReader(inFile));
        String line = br.readLine();
        //int sum = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
        
        
        while (line != null) {            
            //System.out.println(line);
            String[] splited = line.split(" ");
            for (int i = 1; i < splited.length; i++) {
                int sum = Integer.parseInt(splited[0]) + Integer.parseInt(splited[i]);
                System.out.println(sum);
                String str = String.valueOf(sum);
                bw.write(str);
                bw.newLine();
            }
            line = br.readLine();
            
        }
        
        br.close();
        bw.close();
        
        
        //File outFile = new File("C:\\data\\som.out");
        
        
        
        
    }
}
