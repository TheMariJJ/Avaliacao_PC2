package view;

import java.sql.Connection;

import controller.AssalariadoJdbcDAO;

import controller.JdbUtil;
import model.Assalariado;

public class AssalariadoExec {
	public static void main(String args[]) {
		Assalariado assalariado = new Assalariado();
		try {
			
			assalariado.setSalario(1000);		
			
			Connection connection = JdbUtil.getConnection();
			AssalariadoJdbcDAO assalariadoJdbcDAO = new AssalariadoJdbcDAO(connection);
			
			assalariadoJdbcDAO.salvar(assalariado);
			//assalariadoJdbcDAO.listar();			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
