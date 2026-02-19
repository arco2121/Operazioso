package com.arco2121.operazioso.Service;

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

    @Override
    public String toString() {
        return new StringBuilder().append("somma => ").append(this.somma)
                .append("\nmoltiplicazione => ").append(this.moltiplicazione)
                .append("\nsottrazione => ").append(this.sottrazione)
                .append("\ndivisione => ").append(this.divisione).toString();
    }
}