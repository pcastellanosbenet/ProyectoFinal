package com.telefonica.dao;

import java.util.List;

import com.telefonica.modelo.Hotel;

public interface HotelDao {

		public List<Hotel> list();
		public Hotel hab(int idHotel);		

	}


