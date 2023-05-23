package com.example.Doctor.Controller;
import com.example.Doctor.dto.DoctorDto;
import com.example.Doctor.dto.ResponseDto;
import com.example.Doctor.repository.DoctorRepository;
import com.example.Doctor.entity.Doctor;
import com.example.Doctor.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    private DoctorRepository dao;

    @Autowired
    private DoctorService doctorService;
    @GetMapping("/")
    public String HomePage(){
        return "welcome to home page of doctor";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public ResponseDto addDoctor(@RequestBody Doctor d){
        return doctorService.addDoctor(d);


    }

    @CrossOrigin("*")
    @GetMapping("/view")
        public List<DoctorDto> viewAll(){
            return doctorService.getAllDoctor();
        }


}
