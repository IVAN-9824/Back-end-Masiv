package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Storage;

public interface StorageRepository extends MongoRepository<Storage, String> {

}
