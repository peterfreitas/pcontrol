package com.peterfreitas.pcontrol.controller;

import com.peterfreitas.pcontrol.model.JornadaTrabalho;
import com.peterfreitas.pcontrol.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornadas")
public class JornadaTrabalhoController {

    JornadaTrabalhoService jornadaTrabalhoService;

    @Autowired
    public JornadaTrabalhoController(JornadaTrabalhoService jornadaTrabalhoService) {
        this.jornadaTrabalhoService = jornadaTrabalhoService;
    }

    @PostMapping
    public JornadaTrabalho criaJornadaTrabalho(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoService.salvarJornadaTrabalho(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> buscarJornadaTrabalho() {
        return jornadaTrabalhoService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> buscarJornadaTrabalhoPorId(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaTrabalhoService.findById(idJornada).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public JornadaTrabalho alteraJornadaTrabalho(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoService.alteraJornadaTrabalho(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> deletaPorId(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            jornadaTrabalhoService.deletaJornadaTrabalho(idJornada);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
        return ResponseEntity.ok().build();

    }

}