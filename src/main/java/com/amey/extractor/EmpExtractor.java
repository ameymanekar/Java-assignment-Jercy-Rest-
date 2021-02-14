package com.amey.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.amey.beans.Emp;

public class EmpExtractor implements ResultSetExtractor<Emp>{

	public Emp extractData(ResultSet resultSet) throws SQLException, DataAccessException {
		Emp emp = new Emp();
		int STUNO = resultSet.getInt("STUNO");
		String STUDENT_NAME = resultSet.getString("STUDENT_NAME");
		String STUDENT_DOB = resultSet.getString("STUDENT_DOB");
		String STUDENT_DOJ = resultSet.getString("STUDENT_DOJ");
		
		emp.setSTUNO(STUNO);
		emp.setSTUDENT_NAME(STUDENT_NAME);
		emp.setSTUDENT_DOB(STUDENT_DOB);
		emp.setSTUDENT_DOJ(STUDENT_DOJ);
		
		return emp;
	}

}
