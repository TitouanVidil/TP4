package View;

import java.sql.*;

public class Vue
{
    public Vue(){}

    public void showView(ResultSet resultat) throws SQLException {
        while(resultat.next())
        {
            System.out.println("Specialite: "+resultat.getString("libelle") + " " + "candidat: "+resultat.getString("nom") + " " );
        }
    }

}
