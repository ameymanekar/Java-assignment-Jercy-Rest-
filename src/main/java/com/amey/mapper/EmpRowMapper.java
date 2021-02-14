package com.amey.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.amey.beans.Emp;
import com.amey.extractor.EmpExtractor;

public class EmpRowMapper implements RowMapper<Emp>{

	public Emp mapRow(ResultSet resultSet, int line) throws SQLException {
		EmpExtractor empExtractor = new EmpExtractor();
		return empExtractor.extractData(resultSet);
	}

}
