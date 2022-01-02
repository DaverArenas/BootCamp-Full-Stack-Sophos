package com.ProyectoFinalBootCamp.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.ProyectoFinalBootCamp.SpringBootApp.Entity.Rol;
import com.ProyectoFinalBootCamp.SpringBootApp.repository.RolRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	RolRepository repo;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		repo.save(new Rol("Cuenta de Ahorros"));
		repo.save(new Rol("Cuenta Corriente"));
	}

}


