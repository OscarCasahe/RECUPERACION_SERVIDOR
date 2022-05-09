package org.iesalixar.dao;

import org.iesalixar.model.Usuario;

public interface DAOUsuario {

	public Usuario getUsuario(String nombre);
	public Usuario getUsuarioByEmail(String email);
	public boolean registerUsuario(Usuario usuario);	
}
