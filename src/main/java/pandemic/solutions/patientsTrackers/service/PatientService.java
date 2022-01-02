package pandemic.solutions.patientsTrackers.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import pandemic.solutions.patientsTrackers.entity.Address;
import pandemic.solutions.patientsTrackers.entity.Patient;
import pandemic.solutions.patientsTrackers.entity.PatientMedicalHistory;
import pandemic.solutions.patientsTrackers.models.PatientIllnessRequest;
import pandemic.solutions.patientsTrackers.models.PatientRequest;
import pandemic.solutions.patientsTrackers.repository.PatientMedicalHistoryRepository;
import pandemic.solutions.patientsTrackers.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private PatientMedicalHistoryRepository patientMedicalHistoryRepository;
	
	public Patient postPatient(PatientRequest patientRequest) {
		
		Patient patient=new Patient();
		patient.setDateOfBirth(patientRequest.getDob());
		patient.setName(patientRequest.getName());
		patient.setNationalId(patientRequest.getNationalId());
		patient.setPhoneNumber(patientRequest.getPhoneNumber());
		Address address=new Address();
		address.setCity(patientRequest.getAddress().getCity());
		address.setState(patientRequest.getAddress().getState());
		address.setLandmark(patientRequest.getAddress().getLandmark());
		address.setPincode(patientRequest.getAddress().getPincode());
		address.setStreet(patientRequest.getAddress().getStreet());
		patient.setAddressId(address);
		
		return patientRepository.save(patient);
		
	}
	
	public PatientMedicalHistory postPatientIllness(PatientIllnessRequest patientIllnessRequest) {
		
		Optional<Patient> patientOp=patientRepository.findByNationalId(patientIllnessRequest.getNationalId());
		PatientMedicalHistory patientIllness=new PatientMedicalHistory();
		if(patientOp.isPresent()) {
			patientIllness.setPatient(patientOp.get());
		}
		patientIllness.setAlive(new Boolean(patientIllnessRequest.getIsAlive()));
		patientIllness.setCondition(patientIllnessRequest.getCondition());
		patientIllness.setDescription(patientIllnessRequest.getDescription());
		patientIllness.setIllness(patientIllnessRequest.getIllness());
		patientIllness.setDischarged(new Boolean(patientIllnessRequest.getIsDischarged()));
		patientIllness.setHospitalAdmission(new Boolean(patientIllnessRequest.getHospitalAdmission()));
		if(!StringUtils.isEmpty(patientIllnessRequest.getDischargeDate())) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
	    LocalDate dischargeDate = LocalDate.parse(patientIllnessRequest.getDischargeDate(), formatter);
		patientIllness.setDischargeDate(dischargeDate);
		}
		return patientMedicalHistoryRepository.save(patientIllness);
	}
	
}
