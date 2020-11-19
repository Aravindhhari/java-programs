package com.cg.insuranceClaim.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class PolicyController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	static Logger logger=LogManager.getLogger(PolicyController.class);
	
	public PolicyController() {
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("Policy Created");

  }
	
}