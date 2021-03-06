package edu.mum.swe.msched.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import edu.mum.swe.msched.enumeration.GENDER;
import edu.mum.swe.msched.enumeration.STUDENT_TYPE;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;
	private String firstName;
	private String lastName;
	@Enumerated(EnumType.ORDINAL)
	private GENDER gender;
	private String snn;
	private String email;
	private String phoneNo;
	@ManyToOne
	private Entry entry;
	@Enumerated(EnumType.ORDINAL)
	private STUDENT_TYPE studentType;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_SECTION", joinColumns = {
			@JoinColumn(name = "STUDENT_ID", nullable = false, updatable = false) },
			inverseJoinColumns = { @JoinColumn(name = "SECTION_ID",nullable = false, updatable = false) })
	private List<Section> sections;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
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

	public GENDER getGender() {
		return gender;
	}

	public void setGender(GENDER gender) {
		this.gender = gender;
	}

	public String getSnn() {
		return snn;
	}

	public void setSnn(String snn) {
		this.snn = snn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Entry getEntry() {
		return entry;
	}

	public void setEntry(Entry entry) {
		this.entry = entry;
	}

	public STUDENT_TYPE getStudentType() {
		return studentType;
	}

	public void setStudentType(STUDENT_TYPE studentType) {
		this.studentType = studentType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	@Transient
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

}
