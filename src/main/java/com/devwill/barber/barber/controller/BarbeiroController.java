package com.devwill.barber.barber.controller;

import com.devwill.barber.barber.model.Barbeiro;
import com.devwill.barber.barber.repository.BarbeiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/barbeiros")
public class BarbeiroController {

    @Autowired
    private BarbeiroRepository barbeiroRepository;

    @PostMapping
    public Barbeiro criarBarbeiro(@RequestBody Barbeiro barbeiro) {
        return barbeiroRepository.save(barbeiro);
    }

    @GetMapping
    public List<Barbeiro> listarBarbeiros() {
        return barbeiroRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Barbeiro> obterBarbeiro(@PathVariable Long id) {
        Optional<Barbeiro> barbeiro = barbeiroRepository.findById(id);
        if (barbeiro.isPresent()) {
            return ResponseEntity.ok(barbeiro.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Barbeiro> atualizarBarbeiro(@PathVariable Long id, @RequestBody Barbeiro barbeiroAtualizado) {
        Optional<Barbeiro> barbeiro = barbeiroRepository.findById(id);
        if (barbeiro.isPresent()) {
            Barbeiro barbeiroExistente = barbeiro.get();
            barbeiroExistente.setNome(barbeiroAtualizado.getNome());
            // Atualize outros campos conforme necessário
            barbeiroRepository.save(barbeiroExistente);
            return ResponseEntity.ok(barbeiroExistente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarBarbeiro(@PathVariable Long id) {
        if (barbeiroRepository.existsById(id)) {
            barbeiroRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}