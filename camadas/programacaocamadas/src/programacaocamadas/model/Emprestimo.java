package programacaocamadas.model;

public class Emprestimo {
    private double capital;
    private double taxa;
    private int tempo;
    private boolean simples; // true = simples, false = composto

    public Emprestimo(double capital, double taxa, int tempo, boolean simples) {
        this.capital = capital;
        this.taxa = taxa;
        this.tempo = tempo;
        this.simples = simples;
    }

    public double calcularValorPagar() {
        if (simples) {
            return capital + (capital * (taxa / 100) * tempo);
        } else {
            return capital * Math.pow((1 + taxa / 100), tempo);
        }
    }

    public String getTipo() {
        return simples ? "Simples" : "Composto";
    }

    public double getCapital() { return capital; }
    public double getTaxa() { return taxa; }
    public int getTempo() { return tempo; }
}
