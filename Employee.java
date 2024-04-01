package com.example.Employee.Entiy;

import java.sql.Date;

import org.springframework.format.datetime.standard.DateTimeContext;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
@Data
@Slf4j
@Entity
@Table(name = "Employee")
public class Employee {

	private Integer Id;
	private String PhoneNumber;
    private String email;
    private Integer linkedId ;
    private Integer linkPrecedence;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
   
}

