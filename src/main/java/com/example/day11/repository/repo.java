package com.example.day11.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day11.model.Student;

public interface repo extends JpaRepository<Student,Integer> {

}
