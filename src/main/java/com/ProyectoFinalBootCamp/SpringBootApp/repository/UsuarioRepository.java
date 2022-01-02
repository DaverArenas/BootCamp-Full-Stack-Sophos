package com.ProyectoFinalBootCamp.SpringBootApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.ProyectoFinalBootCamp.SpringBootApp.Entity.Usuario;


public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
