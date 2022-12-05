package kg.megacom.employees.services.impl;

import kg.megacom.employees.mapper.PhoneMapper;
import kg.megacom.employees.models.Phone;
import kg.megacom.employees.models.dtos.PhoneDto;
import kg.megacom.employees.repository.PhoneRep;
import kg.megacom.employees.services.PhoneServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServicesImpl implements PhoneServices {

    @Autowired
    private PhoneRep phoneRep;


    @Override
    public PhoneDto save(PhoneDto dto) {
        return PhoneMapper.INSTANCE.toDto(phoneRep.save(PhoneMapper.INSTANCE.toEntity(dto)));
    }

    @Override
    public PhoneDto findById(Long id) {
        return PhoneMapper.INSTANCE.toDto
                (phoneRep.findById(id).orElseThrow
                        (()->new RuntimeException("Не найден телефон с таким id")));
    }

    @Override
    public List<PhoneDto> findAll() {
        return PhoneMapper.INSTANCE.toDtos(phoneRep.findAll());
    }
}
