package com.helloworld.MVCJSP.services.impl;

import com.helloworld.MVCJSP.models.Libro;
import com.helloworld.MVCJSP.repositories.LibrosRepository;
import com.helloworld.MVCJSP.services.LibroService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class LibroServiceImpl implements LibroService {

    LibrosRepository librosRepository;

    public LibroServiceImpl(LibrosRepository librosRepository) {
        this.librosRepository = librosRepository;
    }

    @Override
    public List<Libro> listar() {
        return librosRepository.listar().stream().collect(Collectors.toList());
    }

    @Override
    public Optional<Libro> getLibro(String isbn) {
        return librosRepository.getLibro(isbn);
    }

    @Override
    public Libro anadir(Libro libro) {
        return librosRepository.anadir(libro);
    }
}
