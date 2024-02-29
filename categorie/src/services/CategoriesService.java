package services;
import java.util.List;

import entities.categories;
import repositories.CategoriesRepository;
public class CategoriesService {
    private CategoriesRepository CategoriesRepository=new CategoriesRepository();
    public void ajouterCategories(categories categories){
        CategoriesRepository.insertCategories(categories);
    }
    public List<categories> listerCategories(){
          return CategoriesRepository.getAllCategories();
    }
    
}




   
