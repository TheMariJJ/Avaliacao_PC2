package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Horista;


public class HoristaJdbcDAO {
private Connection conn;	
	
	public HoristaJdbcDAO(Connection conn) {
		this.conn = conn;
	}
	public void salvar(Horista c) throws SQLException {
		String sql = "insert into tbHorista (precoHora, horasTrabalhadas) values ('"+c.getPrecoHora()+"','"+c.getHorasTrabalhadas()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
        prepareStatement.close();
	}

}
