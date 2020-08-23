package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {

	// Injetando a dependência usando o padrão factory
	private DepartmentDao dao = DaoFactory.createDepartmentDao();

	public List<Department> findAll() {
		return dao.findAll();
	}

}
