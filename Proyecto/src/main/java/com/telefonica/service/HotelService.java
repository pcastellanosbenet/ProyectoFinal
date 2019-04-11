package com.telefonica.service;

import java.util.List;

import com.telefonica.modelo.Hotel;

public interface HotelService {	

	public List<Hotel> list();
	public Hotel hab(int idHotel);		

}
