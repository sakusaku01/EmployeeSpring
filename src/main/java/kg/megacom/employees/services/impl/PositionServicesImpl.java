package kg.megacom.employees.services.impl;

import kg.megacom.employees.mapper.PositionMapper;
import kg.megacom.employees.models.Position;
import kg.megacom.employees.models.dtos.PositionDto;
import kg.megacom.employees.repository.PositionRep;
import kg.megacom.employees.services.PositionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServicesImpl implements PositionServices {
    @Autowired
    private PositionRep positionRep;

    @Override
    public PositionDto save(PositionDto position) {
        return PositionMapper.INSTANCE.toDto(positionRep.save(PositionMapper.INSTANCE.toEntity(position)));
    }

    @Override
    public PositionDto findById(Long id) {
        return PositionMapper.INSTANCE.toDto
                (positionRep.findById(id).orElseThrow
                        (()->new RuntimeException("Не найдена позиция с таким id")));
    }

    @Override
    public List<PositionDto> findAll() {
        return PositionMapper.INSTANCE.toDtos(positionRep.findAll());
    }
}
