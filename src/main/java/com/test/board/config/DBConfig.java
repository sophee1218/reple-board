package com.test.board.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DBConfig {

	@Bean
	public DataSource dataSource() {
		HikariConfig hc = new HikariConfig();
		hc.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		hc.setJdbcUrl("jdbc:log4jdbc:oracle:thin:@localhost:1521:xe");
		hc.setUsername("test");
		hc.setPassword("test");
		return new HikariDataSource(hc);
	}
}
