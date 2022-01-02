package pandemic.solutions.patientsTrackers.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="PATIENT_MEDICAL_HISTORY")
public class PatientMedicalHistory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7491991034576104801L;

	@Id
	@Column(name="PATIENT_MEDICAL_HISTORY_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_MEDICAL_HISTORY")
	@SequenceGenerator(name="SEQ_MEDICAL_HISTORY",sequenceName="SEQ_MEDICAL_HISTORY", allocationSize=1)
	private Integer id;
	
	@Column(name = "ILLNESS")
	private String illness;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "HOSPITAL_ADMISSION")
	private boolean hospitalAdmission;
	
	@CreationTimestamp
	@Column(name = "CREATION_DATE")
	private LocalDate creationDate;
	
	@Column(name = "DISCHARGE_DATE")
	private LocalDate dischargeDate;
	
	@Column(name = "IS_ALIVE")
	private boolean isAlive;
	
	@Column(name="IS_DISCHARGED")
	private boolean isDischarged;
	
	@Column(name = "CONDITION")
	private String condition;
	
	@ManyToOne
	@JoinColumn(name="PATIENT_ID")
	private Patient patient;
	
	@Version
	@Column(name = "PATIENT_MEDICAL_HISTORY_VERSION")
	private Integer version;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isHospitalAdmission() {
		return hospitalAdmission;
	}

	public void setHospitalAdmission(boolean hospitalAdmission) {
		this.hospitalAdmission = hospitalAdmission;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDate getDischargeDate() {
		return dischargeDate;
	}

	public void setDischargeDate(LocalDate dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public boolean isDischarged() {
		return isDischarged;
	}

	public void setDischarged(boolean isDischarged) {
		this.isDischarged = isDischarged;
	}
			
}
