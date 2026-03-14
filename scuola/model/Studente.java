package scuola.model;
public class Studente extends Persona{
    private String matricola;

    public Studente(String nome, int eta, String matricola){
        super(nome, eta);
        this.matricola = matricola;
    }
    public String getMatricola(){
        return matricola;
    }

    @Override
    public void presentati(){
        System.out.println("Ciao, sono " + nome + ", ho " + eta + " anni e la mia matricola è " + matricola);
    }
}