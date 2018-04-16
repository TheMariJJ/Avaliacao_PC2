package view;

import java.sql.Connection;

import controller.ComissionadoJdbcDAO;

import controller.JdbUtil;
import model.Comissionado;

public class ComissionadoExec {
	public static void main(String args[]) {
		Comissionado comissionado = new Comissionado();
		try {
			
			comissionado.setTotalVenda(05);
			comissionado.setTaxaComissao(3);
			
			
			Connection connection = JdbUtil.getConnection();
			ComissionadoJdbcDAO comissionadoJdbcDAO = new ComissionadoJdbcDAO(connection);
			
			comissionadoJdbcDAO.salvar(comissionado);
			//empregadosJdbcDAO.listar();			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
