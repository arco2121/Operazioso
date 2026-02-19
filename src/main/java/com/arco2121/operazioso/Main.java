package com.arco2121.operazioso;

import com.arco2121.operazioso.Service.OperaziosoOperativo;
import jakarta.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        String url = "http://localhost:8080/calcolatrice";
        System.out.println("Servizio in esecuzione su: " + url + "?wsdl");
        Endpoint.publish(url, new OperaziosoOperativo());
    }
}