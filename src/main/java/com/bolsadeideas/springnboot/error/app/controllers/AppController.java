package com.bolsadeideas.springnboot.error.app.controllers;

import com.bolsadeideas.springnboot.error.app.models.domain.Usuario;
import com.bolsadeideas.springnboot.error.app.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AppController {

	@Autowired
	private UsuarioService usuarioService;

	@SuppressWarnings("unused")
	@GetMapping("/index")
	public String index() {
		Integer valor = 100 / 0;
		// Integer valor = Integer.parseInt("10xaaaa");
		return "index";
	}

	@GetMapping("/ver/{id}")
	public String ver(@PathVariable Integer id, Model model) {
		Usuario usuario = usuarioService.obtenerPorId(id);
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Detalle usuario: ".concat(usuario.getNombre()));
		return "error/ver";
	}

}
