package mk.ukim.finki.lab2_emt_191074.model.dto;

import lombok.Data;
import mk.ukim.finki.lab2_emt_191074.model.enumeration.Category;

@Data
public class BookDto {
    private String name;
    private Long category;
    private Long author;
    private Integer availableCopies;
    private Boolean mark=false;

    public BookDto(){

    }

    public BookDto(String name, Long category, Long author, Integer availableCopies, Boolean mark) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availableCopies;
        this.mark = mark;
    }
}
