package com.helloworld.MVCJSP.controllers;

import com.helloworld.MVCJSP.models.Libro;
import com.helloworld.MVCJSP.services.LibroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/libros")
public class LibroController {

    private final LibroService librosService;

    public LibroController(LibroService librosService){
        this.librosService = librosService;
    }

    @GetMapping("/listar")
    public String listar(Model model){
        model.addAttribute("libros", librosService.listar());
        return "libros";
    }

    @GetMapping("")
    public String aniadirVistaLibro(Model model){
        return "aniadir-libros";
    }

    @PostMapping("")
    public RedirectView aniadirLibro(@ModelAttribute("libro") Libro libro, RedirectAttributes redirectAttributes){
        final RedirectView redirectView = new RedirectView("/libros/", true);
        Libro libroGuardado = librosService.anadir(libro);
        redirectAttributes.addFlashAttribute("libroGuardado", libroGuardado);
        redirectAttributes.addFlashAttribute("exito", true);
        return redirectView;
    }
}
