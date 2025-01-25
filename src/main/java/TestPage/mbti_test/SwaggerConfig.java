package TestPage.mbti_test;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@OpenAPIDefinition(
        info = @Info(title = "MBTI_test",
                description = "썽봉의 가능한 MBTI Test api명세서",
                version = "v1"))
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("MBTI-public")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new io.swagger.v3.oas.models.info.Info()
                        .title("MBTI Test API")
                        .version("v1")
                        .description("썽봉의 가능한 MBTI Test api명세서")
                        .contact(new Contact()
                                .name("songheesu")
                                //.url("http://localhost:8080")
                                .url("https://port-0-mbti-test-m6bulo9304959452.sel4.cloudtype.app")
                                .email("bsthss0160@gmail.com"))
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }


}