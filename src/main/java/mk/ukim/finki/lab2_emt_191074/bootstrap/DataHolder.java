package mk.ukim.finki.lab2_emt_191074.bootstrap;

import lombok.Getter;
import mk.ukim.finki.lab2_emt_191074.service.AuthorService;
import mk.ukim.finki.lab2_emt_191074.service.BookService;
import mk.ukim.finki.lab2_emt_191074.service.CategoryService;
import mk.ukim.finki.lab2_emt_191074.service.CountryService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Getter
public class DataHolder {
    //    private List<Country> countries=new ArrayList<>();
    private final AuthorService authorService;
    private final BookService bookService;
    private final CountryService countryService;
    private final CategoryService categoryService;

    public DataHolder(AuthorService authorService, BookService bookService, CountryService countryService, CategoryService categoryService) {
        this.authorService = authorService;
        this.bookService = bookService;
        this.countryService = countryService;
        this.categoryService = categoryService;
    }

    @PostConstruct
    void initData(){
//        this.countries.add(new Country("b1","europe"));

        this.countryService.save("England", "Europe");
        this.countryService.save("USA", "America");
        this.countryService.save("United Kingdom", "Europe");


        this.authorService.save("Charles", "Dickens", 1l);
        this.authorService.save("Ernest", "Hemingway", 2l);
        this.authorService.save("Agatha", "Christie", 3l);




        this.categoryService.create("NOVEL","NOVEL");
        this.categoryService.create("THRILER","THRILER");
        this.categoryService.create("HISTORY","HISTORY");
        this.categoryService.create("FANTASY","FANTASY");
        this.categoryService.create("BIOGRAPHY","BIOGRAPHY");
        this.categoryService.create("CLASSICS","CLASSICS");
        this.categoryService.create("DRAMA","DRAMA");

        this.bookService.save("A christamas carol ", 1l, 1l, 10);
        this.bookService.save("Oliver Twist", 1l, 2l, 18);
        this.bookService.save("The old man and the see", 6l, 2l, 5);
        this.bookService.save("The sun also rises", 1l, 2l, 22);
        this.bookService.save("The snows of Kilimanjaro", 1l, 2l, 32);
        this.bookService.save("Murder on the orient express", 4l, 3l, 23);
        this.bookService.save("Death on the Nile", 4l, 3l, 23);
        this.bookService.save("Crooked house", 4l, 3l, 23);
        this.bookService.save("The pale horse", 4l, 3l, 23);
        this.bookService.save("Five little pigs", 4l, 3l, 23);






    }
}