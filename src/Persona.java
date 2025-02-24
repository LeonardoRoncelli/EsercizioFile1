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
    public int getIndice() {
        return indice;
    }
    public void setIndice(int indice) {
        this.indice = indice;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getCompagnia() {
        return compagnia;
    }
    public void setCompagnia(String compagnia) {
        this.compagnia = compagnia;
    }
    public String getCitta() {
        return citta;
    }
    public void setCitta(String citta) {
        this.citta = citta;
    }
    public String getNazione() {
        return nazione;
    }
    public void setNazione(String nazione) {
        this.nazione = nazione;
    }
    public String getTelefono1() {
        return telefono1;
    }
    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }
    public String getTelefono2() {
        return telefono2;
    }
    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }
    public String getDataIscrizione() {
        return dataIscrizione;
    }
    public void setDataIscrizione(String dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSito() {
        return sito;
    }
    public void setSito(String sito) {
        this.sito = sito;
    }
}
