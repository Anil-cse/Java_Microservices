package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.Dao.StudentDao;
import com.spring.jdbc.Dao.StudentDaoImp;

@Configuration
@ComponentScan(basePackages = "com.spring.jdbc.dao")
public class jdbcConfig {
  @Bean(name = "ds")
  public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    //MySQL database we are using
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://localhost:3306/springJDBC");//change url
    dataSource.setUsername("root");//change userid
    dataSource.setPassword("Ag3484e@");//change pwd
    
    //H2 database
    /*
    dataSource.setDriverClassName("org.h2.Driver");
    dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
    dataSource.setUsername("sa");
    dataSource.setPassword("");*/
    return dataSource;
  }

  @Bean(name = "jdbcTemplate")
  public JdbcTemplate jdbcTemplate() {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    jdbcTemplate.setDataSource(dataSource());
    return jdbcTemplate;
  }

  @Bean(name = "studentDao")
  public StudentDao studentDao(){
    StudentDaoImp studentDao = new StudentDaoImp();
    studentDao.setJdbcTemplate(jdbcTemplate());
    return studentDao;
  }

}

