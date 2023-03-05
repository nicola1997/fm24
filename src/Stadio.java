public class Stadio {
    String nome;
    int capacita;
    int prezzoBiglietto;
    int strutture;

    public Stadio(String nome, int capacita, int prezzoBiglietto, int strutture) {
        this.nome = nome;
        this.capacita = capacita;
        this.prezzoBiglietto = prezzoBiglietto;
        this.strutture = strutture;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacita() {
        return capacita;
    }

    public void setCapacita(int capacita) {
        this.capacita = capacita;
    }

    public int getPrezzoBiglietto() {
        return prezzoBiglietto;
    }

    public void setPrezzoBiglietto(int prezzoBiglietto) {
        this.prezzoBiglietto = prezzoBiglietto;
    }

    public int getStrutture() {
        return strutture;
    }

    public void setStrutture(int strutture) {
        this.strutture = strutture;
    }

    @Override
    public String toString() {
        return "Stadio{" +
                "nome='" + nome + '\'' +
                ", capacita=" + capacita +
                ", prezzoBiglietto=" + prezzoBiglietto +
                ", strutture=" + strutture +
                '}';
    }
}
