/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.FoodsHealth;

/**
 *
 * @author Valdecir
 */
public class FoodDao {

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
     */
    public FoodDao() {

    }

    public boolean inserir(FoodsHealth foodsHealth) {
        String sql = "INSERT INTO usuario(xx,xxx,xxx,xxx) VALUES(?,?,?,?)";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
//            pst.setString( );
//            pst.setString(4, usuario.getEmail());

            if (pst.executeUpdate() > 0) {
                retorno = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(FoodsHealth.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }

        return retorno;

    }

    public boolean atualizar(FoodsHealth foodsHealth) {
        String sql = "UPDATE usuario set senha=?,perfil=?,email=? where login=?";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {

//            pst.setString(1, usuario.getSenha());
//            pst.setString(2, usuario.getPerfil());
//            pst.setString(3, usuario.getEmail());
//            pst.setString(4, usuario.getLogin());
            if (pst.executeUpdate() > 0) {
                retorno = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }

        return retorno;

    }

    public boolean excluir(FoodsHealth foodsHealth) {
        //TODO
        String sql = "DELETE FROM xxx where yyyy=?";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {

//           TODO   
//           pst.setString();
            if (pst.executeUpdate() > 0) {
                retorno = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }

        return retorno;

    }

    public void insertTableRandomDataToBD() {

        String sql = "INSERT INTO foodshealth(typefood, protein, carbohydrates, transfat, dish) VALUES(?,?,?,?,?)";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
//          
            int protein;
            int carbo;
            int trans;
            int dinner;
            int dish;
            for (int i = 0; i < 10; i++) {
                protein = (int) (Math.random() * 100);
                carbo = (int) (Math.random() * 100);
                trans = (int) (Math.random() * 100);
                dish = (int) (Math.random() * 100);
                dinner = i % 2;
                if (dinner == 0) {
                    pst.setString(1, "dinner" + i);
                    pst.setFloat(2, protein);
                    pst.setFloat(3, carbo);
                    pst.setFloat(4, trans);
                    pst.setFloat(5, dish);
                    if (pst.executeUpdate() > 0) {
                        System.out.println(" ok insertTableRandomDataToBD()");
                    }
                } else {
                    pst.setString(1, "breakfast" + i);
                    pst.setFloat(2, protein);
                    pst.setFloat(3, carbo);
                    pst.setFloat(4, trans);
                    pst.setFloat(5, dish);
                    if (pst.executeUpdate() > 0) {
                        System.out.println(" ok insertTableRandomDataToBD()");
                    }
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(FoodsHealth.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }

    }

    public List<FoodsHealth> listTypesFoods() {
        String sql = "SELECT * FROM foodshealth";
        List<FoodsHealth> retorno = new ArrayList<>();

        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {

            ResultSet res = pst.executeQuery();
            while (res.next()) {
                FoodsHealth item = new FoodsHealth();
                item.setLevel_carbohydrates(res.getFloat("carbohydrates"));
                item.setTypeFood(res.getString("typeFood"));
                item.setLevel_protein(res.getFloat("protein"));
                item.setLevel_trans_fat(res.getFloat("transfat"));
                item.setDish(res.getInt("dish"));
                retorno.add(item);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
//        int protein;
//        int carbo;
//        int trans;
//        int dinner;
//        for (int i = 0; i < 10; i++) {
//            protein = (int) (Math.random() * 100);
//            carbo = (int) (Math.random() * 100);
//            trans = (int) (Math.random() * 100);
//            dinner = i % 2;
//            if (dinner == 0) {
//                FoodsHealth item = new FoodsHealth("Dinner", protein, carbo, trans);
//                retorno.add(item);
//            } else {
//                FoodsHealth item = new FoodsHealth("BreackFast", protein, carbo, trans);
//                retorno.add(item);
//            }
//
//        }

        return retorno;
    }

    public FoodsHealth searchFoodshealth(FoodsHealth foodsHealth) {
        String sql = "SELECT * FROM foodshealth";
        FoodsHealth retorno = null;

        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {

            ResultSet res = pst.executeQuery();

            if (res.next()) {

            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

        return retorno;

    }

    public FoodsHealth getLessCarbohydrates() {
        String sql = "SELECT * FROM foodshealth where ";
        FoodsHealth retorno = null;

        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {

            ResultSet res = pst.executeQuery();

            if (res.next()) {

            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

        return retorno;
    }

}
