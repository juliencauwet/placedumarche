package com.greenwin.placedumarche.entities;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Integer>{

    public Category findCategoryById(Integer id);
}
