import java.util.ArrayList;

public class Lega {
    static final String[] nomiSquadre={"Juventus","Inter","Milan","Napoli","Atalanta","Lazio","Roma","Torino","Bologna","Verona",
            "Lecce","Sampdoria","Monza","Cremonese","Fiorentina","Spezia","Udinese","Empoli","Sassuolo","Salerninata"};

    String nome;
    int anno;
    ArrayList<Squadra> squadre;
    ArrayList<Stadio> stadi;

    public Lega(String nome, int anno) {
        this.nome = nome;
        this.anno = anno;

        squadre=new ArrayList<>();
        stadi= new ArrayList<>();
        stadi.add(new Stadio("Allianz Stadium",41000,30,5));
        stadi.add(new Stadio("SanSiro",85000,30,5));
        stadi.add(new Stadio("Arechi",55000,30,3));
        stadi.add(new Stadio("Diego Armando Maradona",54000,10,5));
        stadi.add(new Stadio("Giuseppe Meazza",75000,10,5));
        stadi.add(new Stadio("Olimpico",73000,20,4));
        stadi.add(new Stadio("Artemio Franchi",47000,30,3));
        stadi.add(new Stadio("Marassi",36000,30,3));
        stadi.add(new Stadio("Renato Dall'Ara",25000,20,3));
        stadi.add(new Stadio("Grande Torino",25000,20,3));
        stadi.add(new Stadio("Dacia Arena",25000,30,3));
        stadi.add(new Stadio("Mapel",21000,20,2));
        stadi.add(new Stadio("Gewiss",22000,30,2));
        stadi.add(new Stadio("Castellani",19000,30,2));
        stadi.add(new Stadio("Moler",16000,20,2));
        stadi.add(new Stadio("Alberto Picco",10000,30,1));
        stadi.add(new Stadio("Pierluigi Penzo",7000,30,1));
        stadi.add(new Stadio("Marik",10000,20,1));
        stadi.add(new Stadio("Aolo",10000,20,1));
        stadi.add(new Stadio("Verdi",11000,20,1));

        for (int i=0;i<nomiSquadre.length;i++){
            squadre.add(new Squadra(nomiSquadre[i],stadi.get(i)));
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public ArrayList<Squadra> getSquadre() {
        return squadre;
    }

    public void setSquadre(ArrayList<Squadra> squadre) {
        this.squadre = squadre;
    }

    @Override
    public String toString() {
        return "Lega{" +
                "nome='" + nome + '\'' +
                ", anno=" + anno +
                ", squadre=" + squadre +
                '}';
    }
}
