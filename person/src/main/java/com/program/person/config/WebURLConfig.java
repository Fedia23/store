package com.program.person.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static com.program.person.config.PageConstants.*;

@Configuration
public class WebURLConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController(LOGIN_PAGE).setViewName("login.html");
        registry.addViewController(REGISTRATION_PAGE).setViewName("registration.html");
        registry.addViewController(GREETING).setViewName("greetingpage.html");
    }
}
