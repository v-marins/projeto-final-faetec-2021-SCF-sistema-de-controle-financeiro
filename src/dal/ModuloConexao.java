/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.*;

/**
 *
 * @author vmari
 */
public class ModuloConexao {

    //Conecta com o BD
    public static Connection conector() {

        Connection conexao = null;

        // Chama o DRIVER da Biblioteca
        String driver = "com.mysql.cj.jdbc.Driver";
        // Variaveis recebem informações referentes ao BD
        String url = "jdbc:mysql://localhost:3306/scf_controlefinanceiro";
        String user = "root";
        String pass = "rRedp5PDb3fDiY4";

        //Estabelece conexao com BD
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, pass);
            return conexao;
        } catch (Exception e) {
            //System.out.println(e);

            return null;
        }

    }

}
