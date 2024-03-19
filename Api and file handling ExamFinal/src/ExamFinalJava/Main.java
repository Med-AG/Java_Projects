package ExamFinalJava;

import java.util.*;
import java.io.*;

public class Main {
    
    public static void ajouter(String matricule, String marque, 
            String carburant, List<Voiture> liste){
    
        liste.add(new Voiture(matricule, marque, carburant));
    }
    public static void afficherTous(List<Voiture> liste){
    
        Iterator it = liste.iterator();
        while (it.hasNext()) {            
            Voiture v = (Voiture) it.next();
            System.out.println(v.getMatricule()+" "+v.getMarque()+" "
            +v.getCarburant());
        }
    }
    
    public static void main(String[] args) throws IOException {
        
        FileWriter fw = new FileWriter("Gestion_voiture.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        
        
        List<Voiture> lst = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        
        int stop = 0;
        int cmp = 1;
        String matricule;
        String marque;
        String carburant;
        while (stop == 0){
            System.out.println("Ajout de voiture:");
            System.out.println("entrer 0 pour continuer ou 1 pour arreter!");
            stop = in.nextInt();
            String remaining_newline = in.nextLine();
            if (stop != 0) {
                afficherTous(lst);
            }
            
            System.out.println("Voiture " + cmp);
            System.out.println("entrer le matricule: ");
            matricule = in.nextLine();
            System.out.println("entrer la marque: ");
            marque = in.nextLine();
            System.out.println("entrer le carburant: ");
            carburant = in.nextLine();

            // ajouter voiture
            ajouter(matricule, marque, carburant, lst);
            
            bw.write("Voiture " +cmp+": ");
            bw.newLine();
            bw.write("Matricule: "+matricule+"\nMarque: "+marque+
                    "\nCarburant: "+carburant);
            bw.newLine();
            bw.write("------------------------------");
            bw.newLine();
            cmp++;
        }
        
        bw.flush();
        bw.close();
        
        
    }
}
