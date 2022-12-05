package kg.megacom.employees.controllers;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import kg.megacom.employees.models.requests.AuthRequest;
import kg.megacom.employees.services.AccountServices;
import kg.megacom.employees.swagger.Swagger2Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sig")
@Api(tags = Swagger2Config.Auth)
public class SignInController {
    @Autowired
    private AccountServices accountServices;

    @PostMapping("/signIn")
    @ApiOperation("Авторизация")
    public ResponseEntity<?> auth(@RequestBody AuthRequest authRequest) {
        try {
            System.out.println("test");
            return ResponseEntity.ok(accountServices.auth(authRequest));
        }catch (Exception e){
            e.printStackTrace();
           return new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
        }
    }
}
