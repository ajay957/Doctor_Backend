package com.example.Doctor.repository;

import com.example.Doctor.dto.DoctorDto;
import com.example.Doctor.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface DoctorRepository extends CrudRepository<Doctor,Integer> {
    @Query(value = "SELECT d FROM Doctor d")
     List<DoctorDto>getAllDoctor();
}
