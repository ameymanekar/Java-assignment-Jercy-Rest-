package com.amey.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.amey.beans.Emp;
import com.amey.dao.EmpDao;

@Path("/emp")
public class EmpService {

	@Autowired
	private EmpDao empDao;
	
	@Path("/getAll")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		List<Emp> emps = empDao.getAll();
		return Response.status(200).entity(emps).build();
	}
	
	@Path("/get/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getById(@PathParam("id") int id) {
		Emp emp = empDao.getById(id); 
		return Response.status(200).entity(emp).build();
	}
	
	@Path("/save")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response save(Emp emp) {
		empDao.save(emp);
		return Response.status(200).build();
	}
	
	@Path("/update")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(Emp emp) {
		empDao.update(emp);
		return Response.status(200).build();
	}
	
	@Path("/delete/{id}")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteById(@PathParam("id") int id) {
		empDao.deleteById(id);
		return Response.status(200).build();
	}
}
