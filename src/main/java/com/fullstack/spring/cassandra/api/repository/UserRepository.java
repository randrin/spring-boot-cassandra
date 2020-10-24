package com.fullstack.spring.cassandra.api.repository;

import com.fullstack.spring.cassandra.api.model.User;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;

public interface UserRepository extends CassandraRepository<User, Integer> {

    @AllowFiltering
    List<User> findByYearOldGreaterThan(int yearOld);
    //User deleteById(int id);
}
