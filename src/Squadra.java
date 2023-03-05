import java.util.ArrayList;

public class Squadra {
    private ArrayList<Calciatore> rosa;
    private final String nome;
    private int partite;
    private int punti;
    private int vittorie;
    private int pareggi;
    private int sconfitte;
    private int valore;
    private int stipendi;
    private Stadio stadio;
    private int serieA;

    public Squadra(String nome,Stadio stadio) {
        this.rosa = new ArrayList<>();
        for(int i=0;i<20;i++){
            rosa.add(new Calciatore(Main.anno));
        }
        this.nome = nome;
        this.partite = 0;
        this.punti = 0;
        this.vittorie = 0;
        this.pareggi = 0;
        this.sconfitte = 0;
        this.valore = getValore();
        this.stipendi = getStipendi();
        this.stadio = stadio;

        setSquadraGiocatore();

    }
    public void setSquadraGiocatore(){
        for(int i=0;i<rosa.size();i++){
            rosa.get(i).setSquadre(getNome());
        }
    }

    public ArrayList<Calciatore> getRosa() {
        return rosa;
    }

    public void setRosa(ArrayList<Calciatore> rosa) {
        this.rosa = rosa;
    }

    public String getNome() {
        return nome;
    }

    public int getPartite() {
        return partite;
    }

    public void setPartite(int partite) {
        this.partite = partite;
    }

    public int getPunti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti = punti;
    }

    public int getVittorie() {
        return vittorie;
    }

    public void setVittorie(int vittorie) {
        this.vittorie = vittorie;
    }

    public int getPareggi() {
        return pareggi;
    }

    public void setPareggi(int pareggi) {
        this.pareggi = pareggi;
    }

    public int getSconfitte() {
        return sconfitte;
    }

    public void setSconfitte(int sconfitte) {
        this.sconfitte = sconfitte;
    }

    public int getValore() {
        for (int i=0;i<rosa.size();i++){
            valore= valore + rosa.get(i).getPrezzo().get(Main.anno);
        }
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    public int getStipendi() {
        for (int i=0;i<rosa.size();i++){
            stipendi= stipendi + rosa.get(i).getStipendio().get(Main.anno);
        }
        return stipendi;
    }

    public void setStipendi(int stipendi) {
        this.stipendi = stipendi;
    }

    public Stadio getStadio() {
        return stadio;
    }

    public void setStadio(Stadio stadio) {
        this.stadio = stadio;
    }

    public int getSerieA() {
        return serieA;
    }

    public void setSerieA(int serieA) {
        this.serieA = serieA;
    }

    @Override
    public String toString() {
        return "\nSquadra{" +
                "rosa=" + rosa +
                ", nome='" + nome + '\'' +
                ", partite=" + partite +
                ", punti=" + punti +
                ", vittorie=" + vittorie +
                ", pareggi=" + pareggi +
                ", sconfitte=" + sconfitte +
                ", valore=" + valore +
                ", stipendi=" + stipendi +
                ", stadio=" + stadio +
                ", serieA=" + serieA +
                '}';
    }
}
