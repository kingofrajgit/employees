package com.employees.employees.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "emp_information")
public class EmployeeInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AutoIncrement
	@Column(name = "emp_id")
	private Integer empId;
	@Column(name = "emp_name")
	private String empName;
	@Column(name = "emp_email")
	private String empEmail;
	@Column(name = "mobile_number")
	private String mobileNumber;
	@Column(name = "ROLE")
	private String role;
	@Column(name = "aadhar_number")
	private long aadhar;
	@Column(name = "pan_no")
	private String pannum;
	@Column(name = "account_no")
	private long accountNo;
	@Column(name = "ifsc_code")
	private String ifscCode;
	@Column(name = "bank_name")
	private String bankName;
	@Column(name = "verification_status")
	private String status;
	@Column(name = "employee_status")
	private String employeeStatus;
	

}
