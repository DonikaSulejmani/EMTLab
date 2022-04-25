package mk.ukim.finki.lab2_emt_191074.repository;


import mk.ukim.finki.lab2_emt_191074.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    void deleteByName(String name);

    List<Category> findAllByNameLike(String searchText);
}
