package org.example.services;

import org.example.dto.Request;
import org.example.dto.Response;
import org.example.models.Patient;
import org.example.repositories.PatientRepositoryImplementation;
import org.example.repositories.PatientRepositoryInterface;

public class PatientServiceImplementation implements PatientInterface{
    PatientRepositoryInterface patientRepositoryInterface = new PatientRepositoryImplementation();
    @Override
    public Response Register(Request request) {
        Patient patient = new Patient();

        patient.setEmail(request.getEmail());
        patient.setPhoneNumber(request.getPhoneNumber());
        patient.setUserName(request.getUserName());

        patientRepositoryInterface.save(patient);

        Response response = new Response();

        response.setEmail(request.getEmail());
        response.setPhoneNumber(request.getPhoneNumber());
        response.setUserName(request.getUserName());
        response.setMessage("successfully registered");
        return response;
    }
}
