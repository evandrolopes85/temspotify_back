package com.github.evandrolopes85.temspotify.services;

import com.github.evandrolopes85.temspotify.model.Usuario;

public interface IUsuarioService {
	
	public Usuario recuperaUsuario(Usuario usuario);
	public Usuario insereUsuario(Usuario usuario);
}
