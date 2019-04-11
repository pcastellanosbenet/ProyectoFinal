package com.telefonica.Proyecto.config;


import javax.sql.DataSource;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.telefonica.dao.HotelDao;
import com.telefonica.dao.HotelDaoImpl;
import com.telefonica.dao.UsuarioDao;
import com.telefonica.dao.UsuarioDaoImpl;

@Configuration
@ComponentScan(basePackages="com.telefonica")
@EnableWebMvc
public class MvcConfiguration implements WebMvcConfigurer {	
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp().prefix("/WEB-INF/views/").suffix(".jsp");
	}
	
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("message");		
		return source;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		
	}
	@Bean
    public DataSource getDataSource() {		
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/reservas");
        dataSource.setUsername("root");
        dataSource.setPassword("Temp2019$$");	         
        return dataSource;
    }
 
 @Bean
    public HotelDao getVueloDao() {
        return new HotelDaoImpl(getDataSource());
    }
 
// @Bean
//    public PasajeroDao getPasajeroDao() {
//        return new PasajeroDaoImpl(getDataSource());
//    }
	
 @Bean
	public UsuarioDao getUsuarioDao() {
		return new UsuarioDaoImpl(getDataSource());
	}
	
}
