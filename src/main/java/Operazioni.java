public class Operazioni {
    public double somma;
    public double sottrazione;
    public double moltiplicazione;
    public double divisione;

    public Operazioni(double a, double b) {
        this.somma = a + b;
        this.sottrazione = a - b;
        this.moltiplicazione = a * b;
        this.divisione = (b != 0) ? a / b : 0;
    }
}