package com.spring.aaharaSetu.service;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 *
 * @param <T>
 * @param <ID>
 *
 *     Base implementation of the service
 *     this contains all the services that will be used by all other services
 *      just inherit them and use them
 *
 *
 *     TODO:
 *      Exception handling !
 */

@Service
public class BaseServiceImp<T, ID> implements BaseService<T, ID> {

    JpaRepository<T, ID> repo;
    BaseServiceImp(JpaRepository<T, ID> repo){
        this.repo = repo;
    }


    @Override
    public T addEntity(T entity) {
        return repo.save(entity);
    }

    @Override
    public String addAllEntities(List<T> entities) {
        repo.saveAll(entities);
        return "All Data Added";
    }

    @Override
    public List<T> getAllEntity() {
        return repo.findAll();
    }

    @Override
    public T getById(ID id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public String deleteById(ID id) {
        repo.deleteById(id);
        return "Deleted !";
    }
}
