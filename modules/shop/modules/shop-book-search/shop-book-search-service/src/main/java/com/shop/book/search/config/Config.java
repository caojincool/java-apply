package com.shop.book.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@MapperScan("com.shop.book.search.dao")
public class Config implements EnvironmentAware {

	private static Logger logger = LoggerFactory.getLogger(Config.class);

	private static String [] activeProfiles= null;

	@Override
	public void setEnvironment(Environment environment) {
		activeProfiles = environment.getActiveProfiles();
		logger.info("----------------------Application profile={}--------------------", activeProfiles);
	}

	public static String [] getActiveProfiles() {
		return activeProfiles;
	}

	@Bean
    public BeanPostProcessor beanPostProcessor() {
	    return new BeanPostProcessor() {
	        @Override
	        public Object postProcessBeforeInitialization(Object o, String s) {
	            logger.info("BeanPostProcessor object:" + o.getClass().getSimpleName());
	            return o;
	        }
	
	        @Override
	        public Object postProcessAfterInitialization(Object o, String s) {
	            return o;
	        }
	    };
	}
	
}
