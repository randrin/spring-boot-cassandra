package com.fullstack.spring.cassandra.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class User {

    @PrimaryKey
    private int id;
    private String name;
    private String profession;
    private double salary;
    private String gender;
    private int yearOld;
}
