package br.com.fiap.winery;

import br.com.fiap.winery.stubclasses.WineStockService;
import br.com.fiap.winery.stubclasses.WineWarningService;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient2 {
    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://localhost:8085/WineStockService?wsdl");
        QName qName = new QName("http://service.winery.fiap.com.br/", "WineStockServiceImplementationService");
        Service service = Service.create(url, qName);

        URL url2 = new URL("http://localhost:8086/WineWarningService?wsdl");
        QName qName2 = new QName("http://service.winery.fiap.com.br/", "WineWarningServiceImplementationService");
        Service service2 = Service.create(url2, qName2);

        WineStockService wineStockService = service.getPort(WineStockService.class);
        WineWarningService wineWarningService = service2.getPort(WineWarningService.class);

        String order = wineStockService.placeOrder("Pietro",2);
        String warn = wineWarningService.sendWarn();

        System.out.println(order);
        System.out.println(warn);

    }
}
