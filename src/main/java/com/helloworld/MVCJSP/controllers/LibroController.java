package com.helloworld.MVCJSP.controllers;

import com.helloworld.MVCJSP.models.Libro;
import com.helloworld.MVCJSP.services.LibroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/libros")
public class LibroController {

    private final LibroService librosService;

    public LibroController(LibroService librosService){
        this.librosService = librosService;
    }

    @GetMapping("")
    public String listar(Model model){
        model.addAttribute("libros", librosService.listar());
        return "libros";
    }
}
