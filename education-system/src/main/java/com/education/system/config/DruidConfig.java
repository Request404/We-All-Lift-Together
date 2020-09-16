package com.education.system.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druid(){
        return new DruidDataSource();
    }

    //druid配置监控
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String,String> initParamentes = new HashMap<>();
        initParamentes.put("loginUsername","admin");
        initParamentes.put("loginPassword","123456");
        initParamentes.put("allow","");
        bean.setInitParameters(initParamentes);
        return bean;
    }

    //配置filter
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        Map<String,String> initParamentes = new HashMap<>();
        initParamentes.put("exclusions","*.js,*.css,*html,/druid/*");
        bean.setInitParameters(initParamentes);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }

}