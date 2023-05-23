package com.example.Doctor.service;

import com.example.Doctor.dto.DoctorDto;
import com.example.Doctor.dto.ResponseDto;
import com.example.Doctor.entity.Doctor;
import com.example.Doctor.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public List<DoctorDto> getAllDoctor(){
        return doctorRepository.getAllDoctor();
    }

    @Override
    public ResponseDto addDoctor(Doctor d){
        System.out.println(d.getDoctorName());
        System.out.println(d.getAge());
        System.out.println(d.getSpecialization());
        System.out.println(d.getQualification());
        System.out.println(d.getDepartment());
        doctorRepository.save(d);
        ResponseDto repos=new ResponseDto();
        repos.setStatus("success");
        return repos;
    }
}
