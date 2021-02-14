package com.amey.dao;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.amey.beans.Emp;
import com.amey.mapper.EmpRowMapper;

@Repository("empDao")
public class EmpDaoJDBCTemplateImpl implements EmpDao {
	
	@Autowired
	DataSource dataSource;
	
	
	 
	public void save(Emp emp) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "insert into STUDENT(STUNO, STUDENT_NAME, STUDENT_DOB, STUDENT_DOJ) values (?,?,?,?)";
		Object [] objs = new Object[]{emp.getSTUNO(), emp.getSTUDENT_NAME(), emp.getSTUDENT_DOB(), emp.getSTUDENT_DOJ()};
		int output = jdbcTemplate.update(sql, objs);
		if(output != 0) {
			System.out.println("Employee saved with id "+emp.getSTUNO());
		}else {
			System.out.println("Employee save failed with id "+emp.getSTUNO());
		}
	}

	public Emp getById(int id) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "select * from STUDENT where STUNO = ?";
		Emp emp = jdbcTemplate.queryForObject(sql, new Object[]{id}, new EmpRowMapper());
		
		return emp;
	}

	public void update(Emp emp) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "UPDATE STUDENT SET firstname=?, lastname=? where STUNO=?";
		Object [] objs = new Object[]{emp.getSTUNO(), emp.getSTUDENT_NAME(), emp.getSTUDENT_DOB(), emp.getSTUDENT_DOJ()};
		int output = jdbcTemplate.update(sql, objs);
		if(output != 0) {
			System.out.println("Employee updated with id "+emp.getSTUNO());
		}else {
			System.out.println("Employee update failed with id "+emp.getSTUNO());
		}
	}

	public void deleteById(int id) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "DELETE FROM STUDENT WHERE STUNO=?";
		int output = jdbcTemplate.update(sql, id);
		if(output != 0) {
			System.out.println("Employee deleted with id "+id);
		}else {
			System.out.println("Employee deletion failed with id "+id);
		}
	}

	public List<Emp> getAll() {
		List<Emp> emps = new ArrayList<Emp>();
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "select * from STUDENT";
		emps = jdbcTemplate.query(sql, new EmpRowMapper());
		return emps;
	}

}
