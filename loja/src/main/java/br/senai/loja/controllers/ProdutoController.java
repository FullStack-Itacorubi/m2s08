package br.senai.loja.controllers;

import br.senai.loja.models.Produto;
import br.senai.loja.services.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public void cadastra(@RequestBody Produto produtoNovo) {
        service.salva(produtoNovo);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> busca(
            @RequestParam(required = false) final String categoria) {
        List<Produto> responseBody = service.busca(categoria);
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Void> atualiza(@RequestBody Produto produtoAtualizado) {
        if (service.atualiza(produtoAtualizado)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void exclui(@PathVariable final int id) {
        service.exclui(id);
    }
}
