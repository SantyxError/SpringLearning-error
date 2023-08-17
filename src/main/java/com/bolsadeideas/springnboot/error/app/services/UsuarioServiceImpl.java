package com.bolsadeideas.springnboot.error.app.services;

import com.bolsadeideas.springnboot.error.app.models.domain.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	private List<Usuario> lista;

	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "Andrés", "Guzmán"));
		this.lista.add(new Usuario(2, "Alex", "Torres"));
		this.lista.add(new Usuario(3, "Toni", "Mena"));
		this.lista.add(new Usuario(4, "Joan", "Castro"));
		this.lista.add(new Usuario(5, "Pau", "Sánchez"));
		this.lista.add(new Usuario(6, "Ana", "Pérez"));
	}

	@Override public List<Usuario> listar() {
		return this.lista;
	}

	@Override public Usuario obtenerPorId(Integer id) {
		Usuario resultado = null;
		for (Usuario u : this.lista) {
			if (u.getId().equals(id)) {
				resultado = u;
				break;
			}
		}
		return resultado;
	}
}
