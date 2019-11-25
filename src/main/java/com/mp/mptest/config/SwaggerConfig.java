package com.mp.mptest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    //配置了Swagger的Docket的Bean实例
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mp.mptest.controller"))
                .build();
    }

    //配置Swagger信息=apiInfo
    private ApiInfo apiInfo() {

        //作者信息
        Contact contact = new Contact("Czbo", "https://baidu.com", "987021291@qq.com");

        return new ApiInfo(
                "Czbo的SwaggerApi文档",
                "Swagger上手",
                "1.0",
                "https://baidu.com",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
