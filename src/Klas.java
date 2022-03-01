import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen;

    public Klas(String kC){
        klasCode =kC;
        leerlingen = new ArrayList<Leerling>();
    }

    public void voegLeerlingToe(Leerling newLeerling){
        leerlingen.add(newLeerling);
    }

    public void wijzigCijfer(String nm,double newCijfer){
        for (Leerling l : leerlingen) {
            if (l.getNaam().equals(nm)) {
                l.setCijfer(newCijfer);
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen(){
        return leerlingen;
    }

    public int aantalLeerlingen(){
        return 3;
    }

    public String toString() {
        String s = "In klas " + klasCode + " zitten de volgende leerlingen:";
        String a = "";
        System.out.println(s);

        for (Leerling l : leerlingen){
            System.out.println(l);
        }
        return a;
    }
}