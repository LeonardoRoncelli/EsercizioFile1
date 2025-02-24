import java.util.ArrayList;
public class Record {
    private ArrayList<Persona>lista;
    public Record(){
        this.lista=new ArrayList<Persona>();
    }
    public void aggiungi(Persona persona){
        this.lista.add(persona);
    }
    public boolean rimuovi(Persona persona){
        return this.lista.remove(persona);
    }
    public Persona cercaIndice(int indice){
        return this.lista.get(indice);
    }
    public String toString() {
        return "DanishCustomer{" +
                "lista=" + lista +
                '}';
    }
}