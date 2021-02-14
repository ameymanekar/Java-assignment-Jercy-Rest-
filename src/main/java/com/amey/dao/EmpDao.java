package com.amey.dao;

import java.util.List;

import com.amey.beans.Emp;

public interface EmpDao {
	//Create
	public void save(Emp emp);
	//Read
	public Emp getById(int id);
	//Update
	public void update(Emp employee);
	//Delete
	public void deleteById(int id);
	//Get All
	public List<Emp> getAll();
}
