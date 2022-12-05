package kg.megacom.employees.swagger;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    public static final String Auth="Авторизация";
    public static final String Empl="Сотрудники";
    public static final String Phone="Телефон сотрудников";
    public static final String Pos="Должность";
    public static final String Acc="Аккаунт";


    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors
                        .basePackage("kg.megacom.employees.controllers"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiEndPointsInfo())
                .tags(new Tag(Auth, ""))
                .tags(new Tag(Empl,""))
                .tags(new Tag(Phone,""))
                .tags(new Tag(Pos,""))
                .tags(new Tag(Acc,""));

    }

    private ApiInfo apiEndPointsInfo() {
        return new ApiInfoBuilder().title("Сервис сотрудников")
                .description("Just service")
                .version("1.0.0")
                .build();
    }


}
