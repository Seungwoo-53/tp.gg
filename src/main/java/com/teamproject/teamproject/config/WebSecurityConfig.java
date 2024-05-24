package com.teamproject.teamproject.config;

import jakarta.servlet.DispatcherType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.csrf(cs->cs.disable());
//        http.csrf(AbstractHttpConfigurer::disable);
        try {
            http
                    .authorizeHttpRequests(request -> request
                            .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
                            //유저들이 접근할 수 있는 사이트
                            //.requestMatchers("/images/**", "/", "/css/**", "/member/signup", "/member/login","/itemSortType").permitAll()
                            .requestMatchers("/images/**", "/", "/static/css/css/images/css/**", "/**").permitAll()
                            // 관리자만 접근 할 수 있는 사이트
                            .requestMatchers("/item/register/**","/item/editRegister/**","/item/newRegister/**","/member/list/**").hasRole("ADMIN")
                            .anyRequest().authenticated()
                    )
                    .formLogin(login -> login
                            // 로그인 관련
                            .loginPage("/login")    // [A] 커스텀 로그인 페이지 지정
                            .loginProcessingUrl("/login")    // [B] submit 받을 url
                            .usernameParameter("username")    // [C] submit할 아이디
                            .passwordParameter("password")    // [D] submit할 비밀번호
                            .defaultSuccessUrl("/", true)
                            .permitAll()
                    )
                    .logout(withDefaults());
        } catch (Exception e){
            throw new RuntimeException(e);
        }


        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
