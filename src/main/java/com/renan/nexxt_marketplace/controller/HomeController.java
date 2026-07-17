package com.renan.nexxt_marketplace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {

        return "login";
    }

    @GetMapping("/inicio")
    public String inicio() {
        return "inicio";
    }

    @GetMapping("/carrinho")
    public String carrinho() {
        return "carrinho";
    }

    @GetMapping("/produtos")
    public String produtos() {
        return "produtos";
    }

    @GetMapping("/perfil")
    public String perfil() {
        return "perfil";
    }

    @GetMapping("/notificacoes")
    public String notificacoes() {
        return "notificacoes";
    }

    @GetMapping("/suorte")
    public String suorte() {
        return "suorte";
    }
}


