public class Persona {
    private int indice;
    private String id, nome, cognome, compagnia, citta, nazione, telefono1, telefono2, email, dataIscrizione, sito;
    public Persona(String id, String nome,String cognome, String compagnia,String citta,String nazione,String telefono1,String telefono2,String email,String dataIscrizione,String sito){
        this.id=id;
        this.nome=nome;
        this.cognome=cognome;
        this.compagnia=compagnia;
        this.citta=citta;
        this.nazione=nazione;
        this.telefono1=telefono1;
        this.telefono2=telefono2;
        this.email=email;
        this.dataIscrizione=dataIscrizione;
        this.sito=sito;
    }
}
