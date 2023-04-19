package br.com.alura.mvc.mudi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	
	// Segurança feita através de filtros
	// Irá interceptar a requisição e verificar se ela é autenticada ou não para nem mandar para o controller e executar a regra de negócio
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http
				.authorizeHttpRequests(
						authorizeConfig -> {
							authorizeConfig.requestMatchers("/home").permitAll();
							authorizeConfig.anyRequest().authenticated(); // Qualquer requisição precisa ser feita pro alguém autenticado
						})
				.formLogin(Customizer.withDefaults())
				.build();
	}
}
