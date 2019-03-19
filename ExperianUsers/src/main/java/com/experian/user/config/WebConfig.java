package com.experian.user.config;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jndi.JndiTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Clase encargada de implementar la configuracion inicial del proyecto,
 * obtener datasources y asignar paquete base de las clases.
 * 
 * @author Diana Rojas
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.experian.user")
public class WebConfig {

	
	/**
	 * Objeto de acceso a base de datos
	 */
	@Autowired
	DataSource dataSource;
	
	
	@Bean 
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return new NamedParameterJdbcTemplate(dataSource);
	}
	
	/**
	 * Metodo encargado de obtener la conexion a base de datos.
	 * 
	 * @return
	 * @throws NamingException
	 */
	@Bean
	public DataSource getDataSource() throws NamingException {
		JndiTemplate jndiTemplate = new JndiTemplate();
		DataSource dataSource = (DataSource) jndiTemplate.lookup("java:comp/env/jdbc/UsersJNDI");
		return dataSource;
	}
}
