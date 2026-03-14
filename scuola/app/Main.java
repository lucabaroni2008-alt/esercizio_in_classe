package scuola.app;
import scuola.model.Persona;
import scuola.model.Studente;
import scuola.service.RegistroStudenti;

public class Main{
    public static void main(String[] args){
        RegistroStudenti registro = new RegistroStudenti();
        Persona p1 = new Persona("Anna", 45);
        Studente p2 = new Studente("Luca", 21, "12345");
        registro.aggiungiStudente(p2);

        registro.stampaStudenti();
    }
}