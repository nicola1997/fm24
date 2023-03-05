import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Calciatore {
    private final String nome;
    private final String cognome;
    private int eta;
    private HashMap<Integer,String> squadre;
    private HashMap<Integer,Integer> prezzo;
    private HashMap<Integer,Integer> stipendio;
    private HashMap<Integer,Integer> abilita;
    private HashMap<Integer,Integer> presenze;
    private HashMap<Integer,Integer> gol;
    private int serieA;
    Random r=new Random();

    static final String nomi[]={"Nicola","Vito","Andrea","Aldo","Luca","Alessandro","Alessio","Biagio","Carlo","Daniele","Domenico"};
    static final String cognomi[]={"Neri","Biasco","Guida","Verdi","Rossi","Toldo","Aroli","Apaci","Dipinto","Bianchi","Amato"};
    public Calciatore(int anno) {
        this.nome = nomi[r.nextInt(nomi.length)];
        this.cognome = cognomi[r.nextInt(cognomi.length)];
        this.eta = r.nextInt(18,30);
        this.squadre = new HashMap<>();
        this.abilita = new HashMap<>();
        this.prezzo = new HashMap<>();
        this.stipendio = new HashMap<>();
        this.presenze = new HashMap<>();
        this.gol = new HashMap<>();

        squadre.put(anno,"svincolato");
        abilita.put(anno,r.nextInt(60,90));
        prezzo.put(anno,(abilita.get(2023)*1000));
        stipendio.put(anno,(abilita.get(2023)*500));
        presenze.put(anno,0);
        gol.put(anno,0);
    }

    public String getNome() {
        return nome;
    }


    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public HashMap<Integer, String> getSquadre() {
        return squadre;
    }

    public void setSquadre(HashMap<Integer, String> squadre) {
        this.squadre = squadre;
    }

    public HashMap<Integer, Integer> getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(HashMap<Integer, Integer> prezzo) {
        this.prezzo = prezzo;
    }

    public HashMap<Integer, Integer> getStipendio() {
        return stipendio;
    }

    public void setStipendio(HashMap<Integer, Integer> stipendio) {
        this.stipendio = stipendio;
    }

    public HashMap<Integer, Integer> getAbilita() {
        return abilita;
    }

    public void setAbilita(int anno,int abilita) {
        this.abilita.put(anno,abilita);
    }

    public HashMap<Integer, Integer> getPresenze() {
        return presenze;
    }

    public void setPresenze(HashMap<Integer, Integer> presenze) {
        this.presenze = presenze;
    }

    public HashMap<Integer, Integer> getGol() {
        return gol;
    }

    public void setGol(HashMap<Integer, Integer> gol) {
        this.gol = gol;
    }

    public int getSerieA() {
        return serieA;
    }

    public void setSerieA(int serieA) {
        this.serieA = serieA;
    }

    @Override
    public String toString() {
        return "\nCalciatore{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", squadre=" + squadre +
                ", prezzo=" + prezzo +
                ", stipendio=" + stipendio +
                ", abilita=" + abilita +
                ", presenze=" + presenze +
                "\n, gol=" + gol +
                ", serieA=" + serieA +
                '}';
    }
}
