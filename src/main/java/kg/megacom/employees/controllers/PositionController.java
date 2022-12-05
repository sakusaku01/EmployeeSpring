package kg.megacom.employees.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.employees.models.Position;
import kg.megacom.employees.models.dtos.PositionDto;
import kg.megacom.employees.services.PositionServices;
import kg.megacom.employees.swagger.Swagger2Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pos")
@Api(tags = Swagger2Config.Pos)
public class PositionController {
    @Autowired
    private PositionServices positionServices;


    @PostMapping("/save")
    @ApiOperation("Сохранить должность")
    public ResponseEntity<?> save(@RequestBody PositionDto position) {
        try {
            return ResponseEntity.ok(positionServices.save(position));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }

    }

    @GetMapping("/get")
    @ApiOperation("Поиск по id")
    public ResponseEntity<?> findById(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(positionServices.findById(id));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
        }
    }

    @GetMapping("/get/all")
    @ApiOperation("Вывести всех")
    public ResponseEntity<?> findAll() {
        try {
            return ResponseEntity.ok(positionServices.findAll());
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
        }
    }

}
