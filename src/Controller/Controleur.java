package Controller;

import Model.Repository;
import View.Vue;

import java.sql.Connection;
import java.sql.SQLException;

public class Controleur
{

    public void traiterRequete(Connection con) throws SQLException
    {
        Vue v1 = new Vue();

        Repository rep1 = new Repository();

        String requete = "Select libelle,nom From specialite INNER JOIN candidat ON specialite.idSpec = candidat.idSpec GROUP BY libelle";

        v1.showView(rep1.execRequête(con,requete));
    }


}
