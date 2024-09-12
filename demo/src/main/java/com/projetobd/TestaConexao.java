package com.projetobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaConexao {

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // Atualize com sua URL de conexão
        String user = "system"; // Substitua pelo seu usuário
        String password = "1234"; // Substitua pela sua senha

        try {
            // Carregar o driver JDBC
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // Estabelecer a conexão
            Connection connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Conexão estabelecida com sucesso!");

                // Criar um Statement
                Statement statement = connection.createStatement();

                // Executar uma consulta
                String query = "SELECT * FROM CLIENT"; // Substitua pelo nome de uma tabela existente
                ResultSet resultSet = statement.executeQuery(query);

                // Processar o resultado
                while (resultSet.next()) {
                    // Usando os nomes corretos das colunas
                    int clientId = resultSet.getInt("CLIENT_ID");
                    String name = resultSet.getString("NAME");
                    String country = resultSet.getString("COUNTRY");
                    String state = resultSet.getString("STATE");
                    String city = resultSet.getString("CITY");
                    double creditLimit = resultSet.getDouble("CREDIT_LIMIT");
                    java.sql.Date registrationDate = resultSet.getDate("REGISTRATION_DATE");

                    System.out.println("ID: " + clientId + ", Nome: " + name + ", País: " + country +
                                       ", Estado: " + state + ", Cidade: " + city +
                                       ", Limite de Crédito: " + creditLimit +
                                       ", Data de Registro: " + registrationDate);
                }

                // Fechar o ResultSet e o Statement
                resultSet.close();
                statement.close();

            } else {
                System.out.println("Falha ao estabelecer conexão.");
            }

            // Fechar a conexão
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados.");
            e.printStackTrace();
        }
    }
}
