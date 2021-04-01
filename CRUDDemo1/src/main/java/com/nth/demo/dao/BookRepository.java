package com.nth.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nth.demo.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

}
