package com.helloworld.MVCJSP.repositories;

import com.helloworld.MVCJSP.models.Libro;

import java.util.*;

public class RepositorioEnMemoria implements LibrosRepository{

    private final Map<String, Libro> librosEnMemoria;

    public RepositorioEnMemoria(Map<String, Libro> librosEnMemoria) {
        this.librosEnMemoria = new HashMap<>();
        this.librosEnMemoria.putAll(librosEnMemoria);
    }

    @Override
    public Collection<Libro> listar() {
        if(librosEnMemoria.isEmpty()){
            return Collections.emptyList();
        }
        return librosEnMemoria.values();
    }

    @Override
    public Optional<Libro> getLibro(String isbn) {
        return Optional.ofNullable(librosEnMemoria.get(isbn));
    }

    @Override
    public Libro anadir(Libro libro) {
        librosEnMemoria.put(libro.getIsbn(), libro);
        return libro;
    }
}
