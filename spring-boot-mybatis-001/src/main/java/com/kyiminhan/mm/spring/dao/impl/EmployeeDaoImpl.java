package com.kyiminhan.mm.spring.dao.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kyiminhan.mm.spring.dao.EmployeeDao;
import com.kyiminhan.mm.spring.dao.mapper.EmployeeMapper;
import com.kyiminhan.mm.spring.entity.Employee;

/**
 * The Class EmployeeDaoImpl.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since 2019/06/06 </BR>
 * spring-boot-mybatis-001 system </BR>
 * com.kyiminhan.mm.spring.dao.impl </BR>
 * EmployeeDaoImpl.java </BR>
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	/** The mapper. */
	private EmployeeMapper mapper;

	/**
	 * Sets the mapper.
	 *
	 * @param mapper the new mapper
	 */
	@Autowired
	public void setMapper(final EmployeeMapper mapper) {
		this.mapper = mapper;
	}

	/**
	 * Update.
	 *
	 * @param employee the employee
	 * @return int
	 */
	@Override
	public int update(final Employee employee) {
		return this.mapper.update(employee);
	}

	/**
	 * Delete.
	 *
	 * @param employee the employee
	 */
	@Override
	public void delete(final Employee employee) {
		this.mapper.delete(employee);
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return Employee
	 */
	@Override
	public Employee findById(final Integer id) {
		return this.mapper.findById(id);
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Override
	public Collection<Employee> getAll() {
		return this.mapper.getAll();
	}

	/**
	 * Save.
	 *
	 * @param employee the employee
	 * @return int
	 */
	@Override
	public int save(final Employee employee) {
		return this.mapper.save(employee);
	}
}