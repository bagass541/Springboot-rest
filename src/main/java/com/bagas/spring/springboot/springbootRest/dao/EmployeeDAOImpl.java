package com.bagas.spring.springboot.springbootRest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

//import org.hibernate.Session;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bagas.spring.springboot.springbootRest.entity.Employee;




@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Employee> getAllEmployees() {
//		Session session = entityManager.unwrap(Session.class);
//		List<Employee> allEmployees = session.createQuery("from Employee"
//				, Employee.class)
//				.getResultList();
		
		Query query = entityManager.createQuery("from Employee");
		List<Employee> allEmployees = query.getResultList();
		
		return allEmployees;
	}

	@Override
	public void saveEmployee(Employee employee) {
//		Session session =  entityManager.unwrap(Session.class);
//		
//		session.saveOrUpdate(employee);
		
		Employee newEmployee = entityManager.merge(employee);
		employee.setId(newEmployee.getId());
		
	}

	@Override
	public Employee getEmployee(int id) {
//		Session session = entityManager.unwrap(Session.class);
//		
//		Employee employee = session.get(Employee.class, id);
		
		Employee employee = entityManager.find(Employee.class, id);
		
		return employee;
	}

	@Override
	public void deleteEmployee(int id) {
//		Session session = entityManager.unwrap(Session.class);
//		Query<Employee> query = session.createQuery("delete from Employee " + "where id =:employeeId");
//		query.setParameter("employeeId", id);
//		query.executeUpdate();
		
		Query query = entityManager.createQuery("delete from Employee " + "where id =:employeeId");
		query.setParameter("employeeId", id);
		query.executeUpdate();
	}

}
