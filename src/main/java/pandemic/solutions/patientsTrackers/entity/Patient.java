package pandemic.solutions.patientsTrackers.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="Patient")
public class Patient implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2466500113316788885L;

	@Id
	@Column(name = "PATIENT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PATIENT_ID")
	@SequenceGenerator(name = "SEQ_PATIENT_ID", sequenceName = "SEQ_PATIENT_ID", allocationSize = 1)
	private Integer id;

	@Column(name = "NAME")
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ADDRESS_ID")
	private Address addressId;
	
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name = "DOB")
	private String dateOfBirth;
	
	@Column(name = "NATIONAL_ID")
	private String nationalId;
	
	@Version
	@Column(name = "PATIENT_VERSION")
	private Integer version;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Address getAddressId() {
		return addressId;
	}

	public void setAddressId(Address addressId) {
		this.addressId = addressId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	
}
