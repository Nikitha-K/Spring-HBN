package mvchbnemp;



import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "emp")
@Component

public class Employee {
	
	@Id
	private int empno;
	
	@Column(name = "ename")
	private String ename;
	
	@Column(name = "job")
	private String job;
	
	@Column(name = "mgr")
	private String mgr;
	
	@Column(name = "hiredate")
	private String hiredate;
	
	@Column(name = "salary")
	private double salary;
	
	@Column(name = "comm")
	private int comm;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMgr() {
		return mgr;
	}

	public void setMgr(String mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}
	
	
	
	
	
	

}

