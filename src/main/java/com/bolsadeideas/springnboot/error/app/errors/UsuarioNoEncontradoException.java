package com.bolsadeideas.springnboot.error.app.errors;

import java.io.Serial;

public class UsuarioNoEncontradoException extends RuntimeException {
	@Serial private static final long serialVersionUID = 1L;

	public UsuarioNoEncontradoException(String id) {
		super("Usuario con ID: ".concat(id).concat(" no existe en el sistema"));
	}

}
