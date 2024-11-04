package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Drogaria;
import com.example.demo.entities.Medicamento;

public interface DrogariaRepository extends JpaRepository<Drogaria, Long> {

}
