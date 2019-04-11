package com.telefonica.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.telefonica.modelo.Usuario;

@Component("usuarioDaoImplC")
@Repository
public class UsuarioDaoImpl implements UsuarioDao {
	List<Usuario> usuarios;
	
	private JdbcTemplate jdbcTemplate;
	
	public UsuarioDaoImpl(DataSource dataSource) {
	    jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Usuario> getUsuarios() {
	    String sql = "SELECT * FROM reservas.usuario";    
	    List<Usuario> usuarios = jdbcTemplate.query(sql, new RowMapper<Usuario>() {
	        @Override
	        public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
	        	Usuario usuario = new Usuario();
	        	usuario.setIdusuario(rs.getInt("idusuario"));
	        	usuario.setUsuario(rs.getString("usuario"));
	        	usuario.setClave(rs.getString("clave"));
	            return usuario;
	        }
	    });
		return usuarios;
	}

}
