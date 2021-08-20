package com.fundamentosplatzi.springboot.fundamentos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping //aceptar todas las solicitudes dentro de este metodo a nivel Http
    @ResponseBody //Responder un cuerpo a nivel de servicio
    public ResponseEntity<String> function(){
        return new ResponseEntity<>("Hello from Controller con un cambio", HttpStatus.OK);
    }
}
