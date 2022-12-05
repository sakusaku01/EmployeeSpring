package kg.megacom.employees.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.employees.models.dtos.PhoneDto;
import kg.megacom.employees.services.PhoneServices;
import kg.megacom.employees.swagger.Swagger2Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/ph")
@Api(tags = Swagger2Config.Phone)
public class PhoneController {
    @Autowired
    private PhoneServices phoneServices;


    @PostMapping("/save")
    @ApiOperation("Сохранить телефон")
    public ResponseEntity<?> save(@RequestBody PhoneDto phone) {
        try {
            return ResponseEntity.ok(phoneServices.save(phone));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @GetMapping("/get")
    @ApiOperation("Поиск по id")
    public ResponseEntity<?> findById(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(phoneServices.findById(id));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
        }
    }
    @GetMapping("/get/all")
    @ApiOperation("Вывести всех")
    public ResponseEntity<?> findAll() {
        try {
            return ResponseEntity.ok(phoneServices.findAll());
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
        }
    }

}
