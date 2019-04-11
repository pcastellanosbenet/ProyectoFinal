package com.telefonica.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.telefonica.modelo.Hotel;


@Component("hotelDaoImpl")
@Repository
public class HotelDaoImpl implements HotelDao {
	
	private JdbcTemplate jdbcTemplate; 	

	public HotelDaoImpl(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

	@Override
	public List<Hotel> list() {
		
			 String sql = "SELECT * FROM reservas.hotel";
			    List<Hotel> hoteles = jdbcTemplate.query(sql, new RowMapper<Hotel>() {
			 
					@Override
					public Hotel mapRow(ResultSet rs, int rowNum) throws SQLException {
						 Hotel hotel = new Hotel();
				            
						 hotel.setIdHotel(rs.getInt("idHotel"));
						 hotel.setNombre(rs.getString("nombre"));
						 hotel.setHabdisponibles(rs.getInt("habdisponibles"));				 
				            
				        return hotel;
					}		 
			    });
			    
			 return hoteles;
		
	}

	@Override
	public Hotel hab(int idHotel) {
		// TODO Auto-generated method stub
		return null;
	}

}
