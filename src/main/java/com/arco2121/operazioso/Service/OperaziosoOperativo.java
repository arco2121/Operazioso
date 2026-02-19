package com.arco2121.operazioso.Service;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.arco2121.operazioso.Service.OperaziosoOperativo",
        serviceName = "Operazioni",
        portName = "OperazioniPort")
public class OperaziosoOperativo implements Operazioso {

    @Override
    public double eseguiOperazione(double n1, double n2, String tipo) {
        Operazioni tuttiIRisultati = new Operazioni(n1, n2);

        return switch (tipo.toLowerCase()) {
            case "somma" -> tuttiIRisultati.somma;
            case "sottrazione" -> tuttiIRisultati.sottrazione;
            case "moltiplicazione" -> tuttiIRisultati.moltiplicazione;
            case "divisione" -> tuttiIRisultati.divisione;
            default -> 0;
        };
    }
}