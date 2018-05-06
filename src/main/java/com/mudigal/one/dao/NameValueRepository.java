package com.mudigal.one.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.mudigal.one.domain.NameValue;

/**
 * 
 * @author Vijayendra Mudigal
 *
 */
public interface NameValueRepository extends ReactiveMongoRepository<NameValue, String> {

}
