package org.example;

import static springfox.documentation.builders.PathSelectors.regex;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket raupeApi() {
        return docket().groupName("mygroup");
    }

    private Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).genericModelSubstitutes(DeferredResult.class)
            .useDefaultResponseMessages(false)
            .apiInfo(apiInfo())
            .forCodeGeneration(false);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("My service")
            .build();
    }

}
