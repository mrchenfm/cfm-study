package com.cfm.study.cache;

import com.cfm.study.cache.listener.InitListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @version v1.0
 * @ProjectName: cfm-study
 * @ClassName: Application
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2021/03/14 15:19
 */
@SpringBootApplication
@MapperScan("com.cfm.study.cache.mapper")
public class Application {

	public static void main(String[] args ){

		SpringApplication.run(Application.class,args);
	}

	@Bean
	public ServletListenerRegistrationBean servletListenerRegistrationBean(){
		ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
		servletListenerRegistrationBean.setListener(new InitListener());

		return servletListenerRegistrationBean;
	}
}
