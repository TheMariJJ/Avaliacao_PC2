package view;

import java.sql.Connection;

import controller.EmpregadoJdbcDAO;
import controller.JdbUtil;
import model.Empregado;

public class EmpregadoExec {
	public static void main(String args[]) {
		Empregado empregado = new Empregado();
		try {
			
			empregado.setNome("xxx");
			empregado.setSobrenome("de lima");
			empregado.setCPF("555555-55");
			
			Connection connection = JdbUtil.getConnection();
			EmpregadoJdbcDAO empregadosJdbcDAO = new EmpregadoJdbcDAO(connection);
			
			empregadosJdbcDAO.salvar(empregado);
			empregadosJdbcDAO.listar();			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
