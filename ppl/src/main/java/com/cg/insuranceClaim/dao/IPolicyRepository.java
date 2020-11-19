package com.cg.insuranceClaim.dao;
import java.sql.SQLException;
import java.util.List;
import com.cg.insuranceClaim.model.Policy;
public interface IPolicyRepository {

	public List<Policy> getAllPolicy() throws SQLException;
		
		
		
		
	}
