package dao;

import avlTree.ArvoreAVL;
import avlTree.Elemento;
import infra.ConnectionFactory;
import model.Produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class ProdutosDAO implements IProdutosDAO {

    public ProdutosDAO() {
    }


    public static ArvoreAVL createTree(String categoria) {
        String sql = "SELECT * FROM produto WHERE categoria1 LIKE '"+categoria+"'" ;
        ArvoreAVL avl = new ArvoreAVL();
        try (Connection connection = ConnectionFactory.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                avl.inserir(new Elemento(id));
            }
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return avl;
    }


    @Override
    public void delete(int id) {
        try(Connection connection = ConnectionFactory.getConnection()){
            String sql = "DELETE FROM produtos WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Produtos> findByCategoria(String categoria) {
        ArvoreAVL avl = new ArvoreAVL();
        String sql = "SELECT * FROM produto WHERE categoria1 LIKE '"+categoria+"'" ;


        List<Produtos> produtos = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {

                int id = rs.getInt("id");
                String title = rs.getString("title");
                String categoria1 = rs.getString("categoria1");

                Produtos produto = new Produtos(id, title, categoria1);

                produtos.add(produto);
            }
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return produtos;
    }

    public static String retornaNome(int id){
        String sql = "SELECT * FROM produto WHERE id = "+id;

        String nome = null;
        try (Connection connection = ConnectionFactory.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                nome = rs.getString("title");
            }
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return nome;
    }

}
