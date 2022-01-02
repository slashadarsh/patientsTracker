package pandemic.solutions.patientsTrackers.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="ADDRESS")
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 139920061082008471L;
	
	@Id
	@Column(name = "ADDRESS_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ADDRESS_ID")
	@SequenceGenerator(name = "SEQ_ADDRESS_ID", sequenceName = "SEQ_ADDRESS_ID", allocationSize = 1)
	private Integer id;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="LANDMARK")
	private String landmark;
	
	@Column(name="PINCODE")
	private String pincode;
	
	@Column(name="STREET")
	private String street;
	
	@Version
	@Column(name = "ADDRESS_VERSION")
	private Integer version;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
