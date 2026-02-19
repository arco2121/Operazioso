package com.arco2121.operazioso;

import com.arco2121.operazioso.Service.Operazioso;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        URL wsdlUrl = new URL("http://localhost:8080/calcolatrice?wsdl");

        QName serviceName = new QName("http://operazioso.arco2121.com/", "Operazioni");
        QName portName    = new QName("http://operazioso.arco2121.com/", "OperazioniPort");

        Service service = Service.create(wsdlUrl, serviceName);
        Operazioso port = service.getPort(portName, Operazioso.class);

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci due numeri nella calcolatrice: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Inserisci tipo operazione: ");
        String num3 = sc.nextLine();
        double risposta = port.eseguiOperazione(num1, num2, num3);
        System.out.println(risposta);
    }
}
