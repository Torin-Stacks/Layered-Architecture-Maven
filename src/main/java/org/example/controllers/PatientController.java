package org.example.controllers;

import org.example.dto.Request;
import org.example.dto.Response;
import org.example.services.PatientInterface;
import org.example.services.PatientServiceImplementation;

public class PatientController {
    PatientInterface patientInterface = new PatientServiceImplementation();

    public Response register(Request request){
        Response response = patientInterface.Register(request);
        return response;
    }
}
