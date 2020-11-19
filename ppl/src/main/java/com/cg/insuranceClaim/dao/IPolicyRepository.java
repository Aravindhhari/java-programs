package com.cg.insuranceClaim.dao;
import java.sql.SQLException;
import java.util.List;

import com.cg.insuranceClaim.exception.PolicyNotFoundException;
import com.cg.insuranceClaim.model.Policy;
import java.util.List;

import com.cg.insuranceClaim.model.Policy;
@SuppressWarnings("unused")
public interface IPolicyRepository {

		Policy addPolicy(Policy Policy) throws SQLException;
		List<Policy> getAllPolicy() throws SQLException;
		Policy getPolicyByPolicyNumber(Long PolicyNumber) throws SQLException;
		Policy updatePolicy(Policy Policy) throws SQLException;
		boolean deletePolicy(Long PolicyNumber) throws SQLException;
		
		
		
		
	}
