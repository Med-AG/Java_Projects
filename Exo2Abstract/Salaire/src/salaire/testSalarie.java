package salaire;

public class testSalarie {
    
    public static void main(String[] args) {
        
        Salaire[] salaires = {new Patron(8000, "yassine", "smayka "),
            new TravailleurCommission(6000, 200, "smail", "aploumbi "), 
            new TravailleurHoraire(80, "lmaalam", "dipani ")};
        int cmp = 0;
        for (int i = 0; i < salaires.length; i++) {
            
            System.out.println(salaires[i].toString()); 
            System.out.println(salaires[i].gains());
            if (salaires[i].getClass().getSimpleName().equals("TravailleurHoraire")) {
                ((TravailleurHoraire)salaires[i]).setHeures(4);
                System.out.println(salaires[i].toString());
                System.out.println("le salaire des heure est : "+salaires[i].gains());
            }
            cmp += salaires[i].gains();
            
        }
        System.out.println("Total = " + cmp);
        
}
}