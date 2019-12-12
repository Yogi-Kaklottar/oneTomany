package com.main.java;
import javax.persistence.*;

@Entity
public class Emp {

		@Id
		@GeneratedValue(strategy =GenerationType.AUTO)
		private int eid;
		
		@Column
		private double salary;
		
		@Column
		private String deg;
		
		@Column
		private String ename;

		
		
		public Emp() {
			super();
			
		}

		public Emp(int eid, double salary, String deg, String ename) {
			super();
			this.eid = eid;
			this.salary = salary;
			this.deg = deg;
			this.ename = ename;
		}

		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public String getDeg() {
			return deg;
		}

		public void setDeg(String deg) {
			this.deg = deg;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		@Override
		public String toString() {
			return "Emp [getEid()=" + getEid() + ", getSalary()=" + getSalary() + ", getDeg()=" + getDeg()
					+ ", getEname()=" + getEname() + "]";
		}
		
		
		
		
		
}
