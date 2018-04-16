package view;

import java.sql.Connection;

import controller.HoristaJdbcDAO;
import controller.JdbUtil;
import model.Horista;


public class HoristaExec {
	public static void main(String args[]) {
		Horista empregado = new Horista();
		try {
			
			empregado.setPrecoHora(06);
			empregado.setHorasTrabalhadas(200);
			
			
			Connection connection = JdbUtil.getConnection();
			HoristaJdbcDAO horistasJdbcDAO = new HoristaJdbcDAO(connection);
			
			horistasJdbcDAO.salvar(empregado);
			//horistasJdbcDAO.listar();			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
