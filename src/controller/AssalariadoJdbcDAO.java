package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import model.Assalariado;


public class AssalariadoJdbcDAO {
private Connection conn;	
	
	public AssalariadoJdbcDAO(Connection conn) {
		this.conn = conn;
	}
	public void salvar(Assalariado c) throws SQLException {
		String sql = "insert into tbassalariado (salario) values ('"+c.getSalario()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
        prepareStatement.close();
	}
	
	/*public List<Assalariado> listar() {
		String sql = "select * from empregado";
        System.out.println(sql);		
        List<Assalariado> assalariados = new ArrayList<Assalariado>();
		try {
			PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery();
			while(rs.next()) {				
				float salario = rs.getSalario("salario");				
				Assalariado assalariado = new Assalariado();				
				assalariado.setSalario(salario);				
			}
			prepareStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return assalariados;
	}*/
	
}