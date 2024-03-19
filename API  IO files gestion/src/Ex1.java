import java.io.*;

public class Ex1 {
    public static void main(String[] args)   throws Exception
    {//création du dossier c:\data
        File dossier=new File("c:/data");      
        if(dossier.exists() == false)
               dossier.mkdir();
        //création du dossier c:\data
          File fichier=new File("c:/data/fichier.txt");
        if(fichier.exists() ==false)
            fichier.createNewFile();        
        /*  Hamdaoui Adil
            Salimi Hicham
            Zeroul Hasna
            Hakim Redouane
        */
        //Ajouter la liste des noms dans le fichier.txt
        //ouverture du fichier.txt en mode écriture
        FileWriter fw=new FileWriter(fichier,true);
        //le stream qui va transporter les données vers le ficher.txt
        PrintWriter pw=new PrintWriter(fw);
        //ajout des données 
        pw.println("Hamdaoui Adil");
        pw.println("Salimi Hicham");
        pw.println("Zeroul Hasna");
        pw.println("Hakim Redouane");
        //feremer le fichier.txt et libérer la mémoire tampon
        pw.close();    fw.close();
        
        
    }
}
