package org.apache.camel.example.csv.onetomany;

import java.util.Date;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

/**
 * 
 * @author santosh joshi
 *
 *
 *1|computers|6|first-name-6|last-name-6|2012-10-06|(991)-066-4917
 */
@CsvRecord(separator = "\\|")
public class Employee {

	@DataField(pos = 3, required = true)
	private String Id;

	@DataField(pos = 4, required = true, trim= true)
	private String firstName;

	@DataField(pos = 5, required = true, trim= true)
	private String lastName;

	@DataField(pos = 6, required = true, pattern="yyyy-MM-dd")
	private Date dateOfJoining;

	@DataField(pos = 7, trim=true, pattern="##########")
	private long contactNumber;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", dateOfJoining=" + dateOfJoining
				+ ", contactNumber=" + contactNumber + "]";
	}

	
}