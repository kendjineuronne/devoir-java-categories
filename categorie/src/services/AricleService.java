package services;
import java.util.List;
import entities.Article;
import repositories.ArticleRepository;

public class AricleService {
    private ArticleRepository articleRepository=new ArticleRepository();
    public void ajouterArticle(Article article){
        ArticleRepository.insertarticle(article);
    }
    public List<Article> listerArticles(){
          return   ArticleRepository.getAllArticle();
    }
}



