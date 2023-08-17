package com.bolsadeideas.springnboot.error.app.services;

import com.bolsadeideas.springnboot.error.app.models.domain.Usuario;

import java.util.List;

public interface UsuarioService {
	public List<Usuario> listar();

	public Usuario obtenerPorId(Integer id);
}
