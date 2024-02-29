package entities;

import java.util.ArrayList;
import java.util.List;
 
public class categories {

    private int id;
    private String nomCat;

    list<categories> categories=new ArrayList<>();

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomCat() {
        return nomCat;
    }
    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }
    public list<categories> getCategories() {
        return categories;
    }
    public void setCategories(list<categories> categories) {
        this.categories = categories;
    }
}