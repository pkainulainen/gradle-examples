package net.petrikainulainen.gradle.webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @author Petri Kainulainen
 */
@Configuration
@ComponentScan("net.petrikainulainen.gradle.webapp.controller")
@EnableWebMvc
public class WebAppContext extends WebMvcConfigurerAdapter {

    private static final String JSP_FILE_PATH = "/WEB-INF/jsp/";
    private static final String JSP_FILE_SUFFIX = ".jsp";

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix(JSP_FILE_PATH);
        viewResolver.setSuffix(JSP_FILE_SUFFIX);
        return viewResolver;
    }
}
