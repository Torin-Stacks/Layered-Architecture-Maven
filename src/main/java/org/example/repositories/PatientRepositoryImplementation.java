package org.example.repositories;

import org.example.models.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientRepositoryImplementation implements PatientRepositoryInterface {
    List<Patient> patients = new ArrayList<>();
    @Override
    public void save(Patient patient) {
        patients.add(patient);
    }
}
