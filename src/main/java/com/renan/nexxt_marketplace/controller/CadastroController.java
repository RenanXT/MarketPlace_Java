package com.renan.nexxt_marketplace.controller;

import com.renan.nexxt_marketplace.entity.Usuario;
import com.renan.nexxt_marketplace.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class CadastroController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/cadastro")
    public String telaCadastro() {
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String fazerCadastro(

            @RequestParam String txtNome,
            @RequestParam String txtSobrenome,
            @RequestParam String txtGenero,
            @RequestParam String txtTelefone,
            @RequestParam String txtCPF,
            @RequestParam String txtNascimento,
            @RequestParam String txtEmail,
            @RequestParam String txtUsuario,
            @RequestParam String txtSenha
    ) {
        Usuario usuario = new Usuario();
        usuario.setNome(txtNome);
        usuario.setSobrenome(txtSobrenome);
        usuario.setGenero(txtGenero);
        usuario.setTelefone(txtTelefone);
        usuario.setCpf_cnpj(txtCPF);
        usuario.setData_nascimento(LocalDate.parse(txtNascimento));
        usuario.setEmail(txtEmail);
        usuario.setUsuario(txtUsuario);
        usuario.setSenha(txtSenha);

        usuarioRepository.save(usuario);

        return "redirect:/";
    }
}
