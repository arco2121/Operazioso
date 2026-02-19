package com.arco2121.operazioso.Service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface Operazioso {
    @WebMethod
    double eseguiOperazione(
            @WebParam(name = "n1") double n1,
            @WebParam(name = "n2") double n2,
            @WebParam(name = "tipo") String tipo
    );
}