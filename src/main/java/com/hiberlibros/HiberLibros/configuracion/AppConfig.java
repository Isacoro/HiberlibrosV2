package com.hiberlibros.HiberLibros.configuracion;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Isabel
 */

@Configuration
public class AppConfig {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}


}
