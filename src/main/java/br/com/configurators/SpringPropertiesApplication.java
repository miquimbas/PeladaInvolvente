package br.com.configurators;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@EnableJpaRepositories("br.com.repository")
@EntityScan("br.com.entities")
@ComponentScan("br.com.controllers")
@ComponentScan("br.com.services")
@SpringBootApplication
public class SpringPropertiesApplication extends SpringBootServletInitializer{

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringPropertiesApplication.class, args);
    }
    
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
            	/*
            	 * TODO REVER O QUE LIBERAR E SE DEVE ESTAR NESSA CLASSE
            	 */
                registry.addMapping("/**");
            }
        };
    }
}