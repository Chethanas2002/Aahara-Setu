package com.spring.aaharaSetu.service.base;

import java.util.List;

/***
 *
 * @param <T>
 * @param <ID>
 *
 *    Introduces a generic BaseService interface with methods for
 *    adding, retrieving, and deleting entities by ID.
 *    This provides a reusable contract for service layer implementations.
 */

public interface BaseService <T, ID> {

    // To add a single entity
    T addEntity(T entity);

    // To add many entities
    String addAllEntities(List<T> entities);

    // To get all the entity in the table
    List<T> getAllEntity();

    // To get the entity by id
    T getById(ID id);

    // To delete by ID
    String deleteById(ID id);
}
