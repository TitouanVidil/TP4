import Controller.Controleur;
import Model.Connexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        String url = "jdbc:mysql://localhost:3306/concours1";
        Properties props = new Properties();
        props.setProperty("user","root");
        props.setProperty("password","");
        Controleur c1 = new Controleur();
        Connection c = Connexion.getConnexion(url,props);
        System.out.println(c);
        //c1.traiterRequete(c);
    }
}