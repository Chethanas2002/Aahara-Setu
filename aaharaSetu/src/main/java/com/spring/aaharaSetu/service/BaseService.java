package com.spring.aaharaSetu.service;

import java.util.List;

public interface BaseService <T, ID> {

    // To add single entity
    T addEntity(T entity);

    // To add many entity
    T addAllEntities(List<T> entities);

    // To get all the entity in the table
    List<T> getAllEntity();

    // To get the entity by id
    T getById(ID id);

    // To delete by ID
    T deleteById(ID id);




}
