package com.shop.order.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = { "com.shop.order" })
@MapperScan("com.shop.order.dao")
public class Config {
	
	private static Logger logger = LoggerFactory.getLogger(Config.class);
	
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
//
//    @Bean
//    @Autowired
//    public UserController merchantApplicationResource(ResourceFactory resourceFactory) {
//        return resourceFactory.getResource(UserController.class);
//    }

}