package br.com.fiap.winery.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
@WebService
public interface WineWarningService {

    @WebMethod
    String sendWarn();
}
