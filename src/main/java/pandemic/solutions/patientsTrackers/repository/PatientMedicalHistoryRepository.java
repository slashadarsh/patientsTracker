package pandemic.solutions.patientsTrackers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pandemic.solutions.patientsTrackers.entity.PatientMedicalHistory;

public interface PatientMedicalHistoryRepository extends JpaRepository<PatientMedicalHistory, Integer>{

}
