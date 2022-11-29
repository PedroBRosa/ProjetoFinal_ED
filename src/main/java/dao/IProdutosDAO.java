package dao;

import model.Produtos;

import java.util.List;


public interface IProdutosDAO {


    void delete (int id);


    List<Produtos> findByCategoria(String categoria);
}


