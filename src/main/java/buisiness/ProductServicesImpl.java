package buisiness;

import java.util.ArrayList;
import java.util.List;


public class ProductServicesImpl {

    List<String> booklist = new ArrayList<String>();
    List<String> musicList = new ArrayList<String>();

    public ProductServicesImpl()
    {
        booklist.add("book1");
        musicList.add("music1");
    }

    public List<String> getProductCategories()
    {
        List<String> categories = new ArrayList<String>();
        categories.add("books");
        categories.add("Music");
        categories.add("Movies");
        return categories;
    }

    public List<String> getProducts(String categorie)
    {
        switch (categorie.toLowerCase())
        {
            case "books" :
                return booklist;
            case "music" :
                return musicList;
        }
        return null;
    }
}
