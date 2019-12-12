package com.main.java;
import java.util.List;
import javax.persistence.*;



@Entity
public class Dept {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	
	@Column
	private String name;
	
	@OneToMany(targetEntity = Emp.class,cascade = CascadeType.ALL)	
	private List empList;
	
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(int did, String name, List empList) {
		super();
		this.did = did;
		this.name = name;
		this.empList = empList;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List getEmpList() {
		return empList;
	}

	public void setEmpList(List empList) {
		this.empList = empList;
	}
	
}
