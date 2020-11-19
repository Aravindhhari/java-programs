package com.cg.insuranceClaim.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.cg.insuranceClaim.model.Policy;

public class PolicyRepositoryImplementation implements IPolicyRepository
{
		Connection con;
		PreparedStatement psmt;
		ResultSet rsp;
		
		public PolicyRepositoryImplementation() {
			try {
				con=ConnectionUtil.getConnection();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		@Override
		public List<Policy> getAllPolicy() throws SQLException {
			psmt=con.prepareStatement("select * from Policy");
			rsp=psmt.executeQuery();
			List<Policy> policy=new ArrayList<>();
			while(rsp.next()) {
				Policy policy1=new Policy();
				
			}
			return policy;
		}
		
		

	}