package com.helloworld.MVCJSP.services;

import com.helloworld.MVCJSP.models.Libro;

import java.util.*;

public interface LibroService {

    List<Libro> listar();

    Optional<Libro> getLibro(String isbn);

    Libro anadir(Libro libro);
}
