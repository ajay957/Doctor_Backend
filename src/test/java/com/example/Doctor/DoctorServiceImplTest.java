package com.example.Doctor;

import com.example.Doctor.dto.DoctorDto;
import com.example.Doctor.dto.ResponseDto;
import com.example.Doctor.entity.Doctor;
import com.example.Doctor.repository.DoctorRepository;
import com.example.Doctor.service.DoctorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class DoctorServiceImplTest {
    @Mock
    private DoctorRepository doctorRepository;

    @InjectMocks
    private DoctorServiceImpl doctorService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllDoctor() {
        // Arrange
        List<DoctorDto> expectedDoctors = new ArrayList<>();
        // Add expected doctors to the list

        when(doctorRepository.getAllDoctor()).thenReturn(expectedDoctors);

        // Act
        List<DoctorDto> actualDoctors = doctorService.getAllDoctor();

        // Assert
        assertEquals(expectedDoctors, actualDoctors);
        verify(doctorRepository, times(1)).getAllDoctor();
    }

    @Test
    void testAddDoctor() {
        // Arrange
        Doctor doctor = new Doctor();
        // Set doctor properties

        when(doctorRepository.save(doctor)).thenReturn(doctor);

        // Act
        ResponseDto response = doctorService.addDoctor(doctor);

        // Assert
        assertEquals("success", response.getStatus());
        verify(doctorRepository, times(1)).save(doctor);
    }
}
