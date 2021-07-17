package com.hr.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/*
    Created with IntelliJ IDEA.
    @author: wang sir
    Date: 2021/7/17
    Time: 14:48
    To change this template use File | Settings | File Templates.
    Description: 
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()//从内存中读取认证信息
                .passwordEncoder(new BCryptPasswordEncoder())//设置密码加密器
        .withUser("admin")//自定义用户名
        .password(new BCryptPasswordEncoder().encode("admin"))          //自定义密码,密码用加密器加密
        .roles("admin");            //权限
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/")//放行的资源
                    .permitAll()//所有人都可以访问
                    .anyRequest()//其他资源
                    .authenticated();//需要认证通过才可以访问
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**","/images/**","/js/**");
    }
}