package View;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Vue3
{
    public Vue3(){}

    public void showView(ResultSet resultat) throws SQLException {
        while(resultat.next())
        {
            System.out.println("candidat: "+resultat.getString("nom") + " " + "moyenne: "+resultat.getDouble("moyenne") + " " );
        }
    }
}
