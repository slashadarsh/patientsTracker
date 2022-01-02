package pandemic.solutions.patientsTrackers.models;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

public class PatientIllnessRequest {
	
	private String illness;
	private String description;
	private String hospitalAdmission;
	private String isAlive;
	private Long charges;
	private String condition;
	private String dischargeDate;
	private String nationalId;
	private String isDischarged;
	
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
	public String getHospitalAdmission() {
		return hospitalAdmission;
	}
	public void setHospitalAdmission(String hospitalAdmission) {
		this.hospitalAdmission = hospitalAdmission;
	}
	public String getIsAlive() {
		return isAlive;
	}
	public void setIsAlive(String isAlive) {
		this.isAlive = isAlive;
	}
	public Long getCharges() {
		return charges;
	}
	public void setCharges(Long charges) {
		this.charges = charges;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public String getIsDischarged() {
		return isDischarged;
	}
	public void setIsDischarged(String isDischarged) {
		this.isDischarged = isDischarged;
	}
	public String getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(String dischargeDate) {
		this.dischargeDate = dischargeDate;
	}
	
}
