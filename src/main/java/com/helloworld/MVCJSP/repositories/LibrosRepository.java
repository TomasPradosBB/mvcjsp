package com.helloworld.MVCJSP.repositories;

import com.helloworld.MVCJSP.models.Libro;

import java.util.*;

public interface LibrosRepository {

    Collection<Libro> listar();

    Optional<Libro> getLibro(String isbn);

    Libro anadir(Libro libro);

}
