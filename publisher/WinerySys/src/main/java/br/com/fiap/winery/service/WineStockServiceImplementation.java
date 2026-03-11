package br.com.fiap.winery.service;


import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.service.WineStockService")
public class WineStockServiceImplementation implements WineStockService{
    @Override
    public String getMenu() {
        return "OLÁ";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "pedido confirmado!";
    }
}
