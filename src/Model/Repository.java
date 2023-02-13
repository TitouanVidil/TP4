package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Repository
{

    Statement stmt = null;
    ResultSet resultat = null;

    public Repository() {}


    public ResultSet execRequête(Connection con,String requete)
    {
        try
        {
            this.stmt = (Statement) con.createStatement();
            this.resultat = stmt.executeQuery(requete);
        }
        catch(SQLException e)
        {
            System.out.println("Erreur lors du chargement "+e.getMessage());
        }
        return this.resultat;
    }
}
