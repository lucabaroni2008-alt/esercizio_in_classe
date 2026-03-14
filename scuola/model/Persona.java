package scuola.model;
interface Stampabile{
    void stampa();
}

public class Persona implements Stampabile{
    protected String nome;
    protected int eta;

    public Persona(String nome, int eta){
        this.nome = nome;
        this.eta = eta;
    }

    public void presentati(){
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni");
    }

    @Override
    public void stampa(){
        presentati();
    }
    public String getNome(){
        return nome; 
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getEta(){
        return eta;
    }
    public void setEta(int eta){
        this.eta = eta; 

    }
}
