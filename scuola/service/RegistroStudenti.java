package scuola.service;
import scuola.model.Studente;
import java.util.ArrayList;

public class RegistroStudenti{
    private ArrayList<Studente> studenti = new ArrayList<>();

    public void aggiungiStudente(Studente s) {
        studenti.add(s);
    }

    public void stampaStudenti(){
        for (Studente s : studenti) {
            System.out.println("Studente: " + s.getNome() + ", Matricola: " + s.getMatricola());
        }
    }
}