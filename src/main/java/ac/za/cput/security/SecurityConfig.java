package ac.za.cput.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String USER_ROLE = "USER";
    private static final String ADMIN_ROLE = "ADMIN";

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password(encodePassword().encode("admin"))
                .roles(USER_ROLE, ADMIN_ROLE)
                .and()
                .withUser("user")
                .password(encodePassword().encode("password"))
                .roles(USER_ROLE);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.httpBasic().and()
                .authorizeRequests()
                .anyRequest().authenticated();
    }

    @Bean
    public PasswordEncoder encodePassword(){
        return new BCryptPasswordEncoder();
    }
}
