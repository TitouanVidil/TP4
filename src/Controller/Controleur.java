package Controller;

import Model.Repository;
import View.Vue1;
import View.Vue2;
import View.Vue3;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;

public class Controleur
{

    public void traiterRequete(Connection con) throws SQLException
    {
        Vue1 v1 = new Vue1();
        Vue2 v2 = new Vue2();
        Vue3 v3 = new Vue3();

        Repository repo1 = new Repository();

        String req1 = "Select libelle,nom From specialite INNER JOIN candidat ON specialite.idSpec = candidat.idSpec order by libelle";
        String req2 = "Select nom,designation,note From candidat INNER JOIN resultat ON candidat.idCand = resultat.idCand INNER JOIN epreuve On resultat.idEpr = epreuve.idEpr  ";
        String cie = JOptionPane.showInputDialog(null, "Rentrez id etudiant: ");
        String req3 = "Select nom,AVG(note) as moyenne From candidat INNER JOIN resultat ON candidat.idCand = resultat.idCand Where candidat.idCand = "+cie;

        v1.showView(repo1.execRequête(con,req1));
        v2.showView(repo1.execRequête(con,req2));
        v3.showView(repo1.execRequête(con,req3));
    }


}
