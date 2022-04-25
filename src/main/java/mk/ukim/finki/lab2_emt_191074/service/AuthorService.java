package mk.ukim.finki.lab2_emt_191074.service;

import mk.ukim.finki.lab2_emt_191074.model.Author;
import mk.ukim.finki.lab2_emt_191074.model.Country;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> findAll();
    Optional<Author> findById(Long id);
    Optional<Author> save(String name, String surname, Long countryId);
    Optional<Author> edit(Long id,String name, String surname, Long countryId);
    void deleteById(Long id);

}
