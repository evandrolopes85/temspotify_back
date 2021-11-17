package com.github.evandrolopes85.temspotify.dao;

import org.springframework.data.repository.CrudRepository;

import com.github.evandrolopes85.temspotify.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{

	public Usuario findByEmail(Usuario usuario);
}
