package com.renan.nexxt_marketplace.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String telaLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String fazerLogin(
            @RequestParam String txtUsuario,
            @RequestParam String txtSenha,
            Model model
    ) {
        if (txtUsuario.equals("RyukXT") && txtSenha.equals("123")) {
            System.out.println("funcionando login");
            return "redirect:/inicio";
        }
        model.addText("erro" + "Usuario ou Senha invalidos.");
        return "login";

    }

}
