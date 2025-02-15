package br.edu.univille.poo2.login.controller.web;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/configuracoes")
public class ConfiguracoesController {


    @GetMapping
    public ModelAndView index(){
        Object principal = SecurityContextHolder. getContext(). getAuthentication(). getPrincipal();
        System.out.println(principal);
        return new ModelAndView("/configuracoes/index.html");
    }

}
