package br.com.fiap.winery;


import br.com.fiap.winery.service.WineStockServiceImplementation;
import br.com.fiap.winery.service.WineWarningServiceImplementation;
import jakarta.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {
        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();

        Endpoint.publish("http://localhost:8085/WineStockService",wineStock);
        Endpoint.publish("http://localhost:8086/WineWarningService", wineWarning);

        System.out.println("Serviço publicado");
    }
}