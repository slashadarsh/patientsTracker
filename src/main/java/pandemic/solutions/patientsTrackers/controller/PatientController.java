package pandemic.solutions.patientsTrackers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pandemic.solutions.patientsTrackers.entity.Patient;
import pandemic.solutions.patientsTrackers.entity.PatientMedicalHistory;
import pandemic.solutions.patientsTrackers.models.PatientIllnessRequest;
import pandemic.solutions.patientsTrackers.models.PatientRequest;
import pandemic.solutions.patientsTrackers.service.PatientService;

@RestController
public class PatientController {
	
@Autowired
private PatientService patientService;

@PostMapping(value="/patient")
public Patient postPatient(@RequestBody(required=true) PatientRequest patientRequest) {
	
	return patientService.postPatient(patientRequest);
}

@PostMapping(value="/patientIllness")
public PatientMedicalHistory postPatientIllness(@RequestBody(required=true) PatientIllnessRequest patientIllnessRequest) {
	
	return patientService.postPatientIllness(patientIllnessRequest);
}
	
}
