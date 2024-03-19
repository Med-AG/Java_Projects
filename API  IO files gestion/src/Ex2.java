import java.io.*;
public class Ex2 {
    public static void main(String[] args) throws Exception
    {
        File temperature=new File("c:/data/temperature.txt");
        double somme=0;
        temperature.createNewFile();
        if(temperature.exists() == true)
        {
            
          FileReader fr=new FileReader(temperature);
          FileWriter fw=new FileWriter("c:/data/moyenne_temperature.txt");
          BufferedReader br=new BufferedReader(fr);
          PrintWriter pw=new PrintWriter(fw);
          String ligne=br.readLine();
          while(ligne != null)
          {
              somme=0;
              String[] temp=ligne.split("\\s");
              for(String x : temp)
              {
                  if(x.isEmpty() ==false)
                       somme += Integer.parseInt(x);                  
              }
              pw.println(somme/temp.length);
              
              ligne=br.readLine();
          }
            
            br.close(); pw.close(); fr.close(); fw.close();
                       
        }
        else
            System.out.println(temperature.getName() + " not found please create it!!!");
        
        
    }
    
}
