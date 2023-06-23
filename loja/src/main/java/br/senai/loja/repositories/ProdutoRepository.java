package br.senai.loja.repositories;

import br.senai.loja.models.Produto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProdutoRepository {

    private static final List<Produto> produtos = new ArrayList<>();
    private static int idSequence = 0;

    public void salva(Produto produto) {
        produto.setId(ProdutoRepository.incrementaIdSequence());
        produtos.add(produto);
    }

    private static int incrementaIdSequence() {
        return ++idSequence;
    }

    public List<Produto> busca() {
        return produtos;
    }

    public List<Produto> busca(String categoria) {
        List<Produto> produtosFiltrados = new ArrayList<>();

        for (Produto produto : produtos) {
            if (produto.getCategoria().equals(categoria)) {
                produtosFiltrados.add(produto);
            }
        }

        return produtosFiltrados;
    }

    public Produto busca(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }

        return null;
    }

    public void atualiza(Produto produtoAtualizado) {
        for (Produto produto : produtos) {
            if (produto.getId() == produtoAtualizado.getId()) {
                produto.setNome(produtoAtualizado.getNome());
                produto.setCategoria(produtoAtualizado.getCategoria());
                produto.setPreco(produtoAtualizado.getPreco());
                break;
            }
        }
    }

    public void exclui(int id) {
        Produto produtoParaExcluir = null;
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtoParaExcluir = produto;
                break;
            }
        }

        produtos.remove(produtoParaExcluir);
    }
}
