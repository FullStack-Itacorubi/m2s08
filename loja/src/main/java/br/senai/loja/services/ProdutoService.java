package br.senai.loja.services;

import br.senai.loja.models.Produto;
import br.senai.loja.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

  @Autowired private ProdutoRepository produtoRepository;

  public void salva(Produto produto) {
    produtoRepository.salva(produto);
  }

  public List<Produto> busca(String categoria) {
    if (categoria != null && categoria.length() > 0) {
      return produtoRepository.busca(categoria);
    } else {
      return produtoRepository.busca();
    }
  }

  public boolean atualiza(Produto produtoAtualizado) {
    Produto oldProduto = produtoRepository.busca(produtoAtualizado.getId());
    if (oldProduto == null) return false;

    produtoRepository.atualiza(produtoAtualizado);
    return true;
  }

  public void exclui(int id) {
    produtoRepository.exclui(id);
  }
}
