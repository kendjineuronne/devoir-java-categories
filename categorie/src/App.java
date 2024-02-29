import java.util.List;
import java.util.Scanner;

import entities.Article;
import entities.categories;
import services.AricleService;
import services.CategoriesService;

public class App {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc=new Scanner(System.in);
       AricleService articleService=new ArticleService();
        CategoriesService categoriesService=new CategoriesService();
       
        do {
            System.out.println("1-Ajouter une Categorie");
            System.out.println("2-Lister Toutes les categories"); 
            System.out.println("3-Creer un article"); 
            System.out.println("4-Lister les  Articles");
            System.out.println("5-Quitter"); 
             choix=sc.nextInt();
             sc.nextLine();
            switch (choix) {
                case 1:
                     System.out.println("Entrer le nom de la categorie");
                     String nomCat=sc.nextLine(); 
                     categories categories=new categories();
                     categories.setNomCat(nomCat);
                     CategoriesService.ajouterCategories(categories);
                    break;
                case 2:
                    List<categories> categories2= CategoriesService.listercategories();
                    for (categories ct : categories) {
                        System.out.println("ID : "+ct.getId() ); 
                        System.out.println("NOM : "+ct.getNomZone() );     
                    }
                  
                    break; 
                    
              case 3:
                     System.out.println("Entrer le titre de l'article");
                     String titre=sc.nextLine(); 
                     System.out.println("Entrer le contenu de l'article");
                     String contenu=sc.nextLine();
                     System.out.println("Entrer le titre de l'etat");
                     String etat=sc.nextLine(); 
                     categories= CategoriesService.listercategories(); 
                        for (Article ct : categories) {
                            System.out.println(ct.getId()+"-"+ct.getNomCat());   
                        }
                       System.out.println("Entrer Id d'une categories");
                       int idZone=sc.nextInt();
                       categories=new categories();
                       categories.setId(idCat);
                       Article article=new Article();
                       article.setTitre(titre);
                       article.setContenu(contenu);
                       article.setEtat(choix);
                       ArticleService.ajouterArticle(article);
                   break;

                   case 4:
                   List<Article> articles= ArticleService.listerArticles();
                   for (Article b : article) {
                       System.out.println("ID : "+b.getId() ); 
                       System.out.println("Titre : "+b.getTitre() ); 
                       System.out.println("Contenu : "+b.getContenu() ); 
                       System.out.println("Date Creation : "+b.getDateCreation());   
                       System.out.println("Etat : "+b.getEtat() ); 
                       System.out.println("------------------------------------");      
                   }
                 
                   break; 
                    
            }
          } while (choix!=5);
    }
}



