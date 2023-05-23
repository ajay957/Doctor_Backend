package com.example.Doctor.service;

import com.example.Doctor.dto.DoctorDto;
import com.example.Doctor.dto.ResponseDto;
import com.example.Doctor.entity.Doctor;

import java.util.List;

public interface DoctorService {

   public List<DoctorDto> getAllDoctor();

   public ResponseDto addDoctor(Doctor d);
}
