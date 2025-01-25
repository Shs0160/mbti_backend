package TestPage.mbti_test;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("https://ganeounghan.netlify.app/",
                        "http://localhost:8080", "https://port-0-mbti-test-m6bulo9304959452.sel4.cloudtype.app/")
                .allowedHeaders("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*");

    }

}
