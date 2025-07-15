package com.spring.aaharaSetu.controller.base;

import com.spring.aaharaSetu.service.base.BaseServiceImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BaseController<T, ID> {

    BaseServiceImp<T, ID> service;
    protected BaseController(BaseServiceImp<T, ID> service){
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<T>> getAllEntities(){
       return ResponseEntity.ok(service.getAllEntity());
    }

    @PostMapping("/add")
    public ResponseEntity<T> addEntity(@RequestBody T entity){
        return ResponseEntity.ok(service.addEntity(entity));
    }

    @PostMapping("/add/all")
    public ResponseEntity<String> addAllEntities(@RequestBody List<T> entities){
        return ResponseEntity.ok(service.addAllEntities(entities));
    }

    @GetMapping(value = "/get", params = {"id"})
    public ResponseEntity<T> getById(@RequestParam ID id){
        return ResponseEntity.ok(service.getById(id));
    }

    @DeleteMapping("/id")
    public ResponseEntity<String> deleteById(ID id){
        return ResponseEntity.ok(service.deleteById(id));
    }

}
