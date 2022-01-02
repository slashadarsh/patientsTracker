package pandemic.solutions.patientsTrackers.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pandemic.solutions.patientsTrackers.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{

	/*
	@Query("SELECT i FROM Inventory i WHERE i.id IN (:ids)")
	List<Inventory> findByIds(@Param("ids") List<Integer> ids);
	
		@Modifying
	void deleteByEmail(String email);
	*/
	Optional<Patient> findByNationalId(String nationalId);
}
