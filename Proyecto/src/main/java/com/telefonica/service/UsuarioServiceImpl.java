package com.telefonica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.telefonica.dao.UsuarioDao;
import com.telefonica.modelo.Usuario;


@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	@Qualifier("usuarioDaoImplC")
	private UsuarioDao usuarioDao;


	@Override
	public List<Usuario> getUsuarios() {
		return this.usuarioDao.getUsuarios();
	}

}
