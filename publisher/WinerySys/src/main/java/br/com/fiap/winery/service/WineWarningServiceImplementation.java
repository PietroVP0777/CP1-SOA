package br.com.fiap.winery.service;


import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.service.WineWarningService")
public class WineWarningServiceImplementation implements WineWarningService{

    @Override
    public String sendWarn() {
        return "Estoque insuficiente!";
    }
}
