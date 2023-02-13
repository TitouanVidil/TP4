package View;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Vue2
{
    public Vue2(){}

    public void showView(ResultSet resultat) throws SQLException {
        while(resultat.next())
        {
            System.out.println("Candidat: "+resultat.getString("nom") + " " + "matiere: "+resultat.getString("designation") + " " + "note: "+resultat.getDouble("note") + " ");
        }
    }
}
