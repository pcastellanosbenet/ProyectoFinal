package com.telefonica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.telefonica.dao.HotelDao;
import com.telefonica.modelo.Hotel;

@Service("hotelService")
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	@Qualifier("hotelDaoImpl")
	private HotelDao hotelDao;

	@Override
	public List<Hotel> list() {
		
		return hotelDao.list();
	}

	@Override
	public Hotel hab(int idHotel) {
		
		return hotelDao.hab(idHotel);
	}


}
