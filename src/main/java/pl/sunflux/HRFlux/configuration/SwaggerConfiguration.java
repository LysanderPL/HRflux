package pl.sunflux.HRFlux.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket hrfluxApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("pl.sunflux.HRFlux.rest.endpoints"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaData());
    }

    private ApiInfo metaData() {
        return new ApiInfo(
                "HRFlux Application REST API",
                "API description for HRFlux Application",
                "1.0",
                "Terms of service",
                new Contact("Maciej Kruszewski", "", "m.kruszewski@sunflux.pl"),
                "MIT License",
                "https://opensource.org/licenses/MIT");
    }


}
