import java.io.*;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Ex1_bis {
    
    
    public static  void ajouter_facture(File f) throws Exception
    {
        int numfact=0;
        double montant;
        Scanner clavier=new Scanner(System.in);
        FileWriter fw=new FileWriter(f,true);
        PrintWriter pw=new PrintWriter(fw);
        if (f.exists() == false)
            f.createNewFile();
        
            do
            {
                System.out.print("Entrer le N° facture Taper 0 pour arrêter : "); 
                numfact=clavier.nextInt();
                if(numfact == 0)
                    break;
               System.out.print("Entrer le Montant de la facture : "); 
                montant=clavier.nextDouble();  
                pw.println("N° Facture : "+numfact);
                pw.println("Montant Facture : "+montant);
                pw.println("Date Facture : "+new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
                pw.println("------------------------------------------");
            }while(numfact !=0);
            pw.close(); fw.close();
            
              
    }
    
    public static void main(String[] args)  throws Exception
    {
        File factures=new File("c:/data/factures.doc");
        ajouter_facture(factures);
        Date d = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMMMMM yyyy");
        String dd = sdf2.format(d);
        System.out.println(dd);
        
    }
 
}
