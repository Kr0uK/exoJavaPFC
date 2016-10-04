package Exo;

public class Principal {

    public static void main(String[] args) {

    }

    public void jouer(int choix) {


    }
    public enum PFC {
        PIERRE(1, "P", "Pierre"),
        FEUILLE(2, "F", "Feuille"),
        CISEAUX(3, "C", "Ciseaux");
        int id;
        String choix;
        String libelle;


        public int getId() {
            return id;
        }

        public String getChoix() {
            return choix;
        }

        public String getLibelle() {
            return libelle;
        }

        PFC(int id, String choix, String libelle) {
            this.id = id;
            this.choix = choix;
            this.libelle = libelle;
        }



    }

}
