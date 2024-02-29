package repositories;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.categories;
public class CategoriesRepository extends Database {

        private final  String SQL_SELECT_ALL="select * from categories" ;
        private final  String SQL_INSERT="INSERT INTO categories (nom_cat) VALUES (?)";
        
       public void insertcategories(categories categories){
            openConnexion();
            try {
                initPreparedStatement(SQL_INSERT);
                statement.setString(1, categories.getNomCat());
                int nbreLigne=executeUpdate();
            closeConnexion();
            } catch (SQLException e) {
            e.printStackTrace();
            }
       }
       public static List<categories> getAllCategories(){
            List<categories> categories=new ArrayList<>();
       try {
           openConnexion();
           initPreparedStatement(SQL_SELECT_ALL);
           ResultSet rs= executeSelect();
             while (rs.next()) {
                  categories Categories=new categories();
                   categories.setId(rs.getInt("id_cat"));
                   categories.setNomCat(rs.getString("nom_cat"));
                   categories.add(categories);
             }
             rs.close();
           closeConnexion();
        }
         catch (SQLException e) {
              System.out.println("Erreur de Connexion a la BD");
        }
        return  categories;
       }
}

