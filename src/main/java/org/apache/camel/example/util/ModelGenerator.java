package org.apache.camel.example.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.example.csv.onetomany.Department;
import org.apache.camel.example.csv.onetomany.Employee;
import org.apache.camel.example.fixedlength.Player;

public class ModelGenerator {
	
	public Department generateEmployeeDepartmentModel(){
		
		Department department = new Department();
		List<Employee> employees = new ArrayList<Employee>();
		Calendar c = Calendar.getInstance();
		
		department.setDepartmentId(1l);
		department.setDepartmentName("Coumpters");
		
		Employee emp1 = new Employee();
		emp1.setFirstName("first-name-1");
		emp1.setLastName("last-name-1");
		emp1.setId("1");
		c.set(2012,10,10) ; 
		emp1.setDateOfJoining(c.getTime());
		emp1.setContactNumber(9876543210l);
		
		Employee emp2 = new Employee();
		emp2.setFirstName("first-name-2");
		emp2.setLastName("last-name-2");
		emp2.setId("2");
		c.set(2012,9,10) ; 
		emp2.setDateOfJoining(c.getTime());
		emp2.setContactNumber(8765432190l);
		
		Employee emp3 = new Employee();
		emp3.setFirstName("first-name-3");
		emp3.setLastName("last-name-3");
		emp3.setId("3");
		c.set(2012,8,10) ; 
		emp3.setDateOfJoining(c.getTime());
		emp3.setContactNumber(7654321980l);
		
		Employee emp4 = new Employee();
		emp4.setFirstName("first-name-4");
		emp4.setLastName("last-name-4");
		emp4.setId("4");
		c.set(2012,07,10) ; 
		emp4.setDateOfJoining(c.getTime());
		emp4.setContactNumber(6543219870l);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		department.setEmployees(employees);
		return department;
	}
	
	/**
	 *  Rahul Dravid      1996-09-10INDIA       00160  9,30060.5480.54 42012-09-01
	 *	Sachin Tendulkar  1989-09-10INDIA       00140 49,60064.5440.54 42012-09-01
	 * @return
	 */
	 public List<Map<String, Object>> generatePlayerModel(){
		List<Map<String, Object>> modelMap = new ArrayList<Map<String, Object>>();
		
		Calendar c = Calendar.getInstance();
		Map<String, Object> player1Map = new HashMap<String, Object>();
		Map<String, Object> player2Map = new HashMap<String, Object>();
		Map<String, Object> player3Map = new HashMap<String, Object>();
		
		c.set(1996,07,10);
		Player player1 = new Player();
		player1.setName("Rahul Dravid");
		player1.setDebutDate(c.getTime());
		player1.setCountry("India");
		player1.setMatchesPlayed(00160);
		player1.setRunsScored(9300);
		player1.setStrikeRate(new BigDecimal("70.54"));
		player1.setBatingPosition(5);
		c.set(2012,07,10);
		player1.setRetirementDate(c.getTime());
		
		
		c.set(1989,9,10);
		Player player2 = new Player();
		player2.setName("Sachin Tendulkar");
		player2.setDebutDate(c.getTime());
		player2.setCountry("India");
		player2.setMatchesPlayed(00140);
		player2.setRunsScored(19300);
		player2.setStrikeRate(new BigDecimal("85.54"));
		player2.setBatingPosition(2);
		c.set(2012,07,10);
		player2.setRetirementDate(c.getTime());
		
		
		c.set(1992,11,10);
		Player player3 = new Player();
		player3.setName("Cris Gayle");
		player3.setDebutDate(c.getTime());
		player3.setCountry("West Indies");
		player3.setMatchesPlayed(00102);
		player3.setRunsScored(21340);
		player3.setStrikeRate(new BigDecimal("99.21"));
		player3.setBatingPosition(10);
		c.set(2012,8,10);
		player3.setRetirementDate(c.getTime());
		
		player1Map.put(player1.getClass().getName(), player1);
		player2Map.put(player2.getClass().getName(), player2);
		player3Map.put(player3.getClass().getName(), player3);
		
		modelMap.add(player1Map);
		modelMap.add(player2Map);
		modelMap.add(player3Map);
		
		return modelMap;
	}
}
