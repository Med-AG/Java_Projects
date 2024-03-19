package employe.simolator;
import employe.Employe;
import employe.Technicien;

public class Main {
    
    public static void main(String[] args) {
        
        Employe employe1 = new Employe("zeghloul", 42, 6500);
        employe1.afficher();
        employe1.augmentation(500);
        employe1.afficher();
        
        Employe tech1 = new Technicien(3, "said ftah", 37, 9700);
        tech1.afficher();
        ((Technicien)tech1).prime();
        tech1.afficher();
        
        
        
    }
}
