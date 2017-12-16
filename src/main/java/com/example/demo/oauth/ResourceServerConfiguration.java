package com.example.demo.oauth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

import com.example.demo.entity.Role;


@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    /**
     * {@inheritDoc}
     */
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.resourceId(AuthorizationServerConfiguration.RESOURCE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.OPTIONS).permitAll()
                .antMatchers("/").permitAll()
                .antMatchers("/auth/**").authenticated()
                .antMatchers("/css/**").permitAll()
                .antMatchers("/js/**").permitAll()
                .antMatchers("/img/**").permitAll()
               .antMatchers("/oauth/token").permitAll()
               .antMatchers("/user/login").permitAll()
               .antMatchers("/user/save").permitAll()
               .antMatchers("/user/delete").hasRole("ADMIN")
               .antMatchers("/add").permitAll()
                .anyRequest().permitAll();
    }

}