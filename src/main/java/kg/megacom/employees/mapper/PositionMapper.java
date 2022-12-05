package kg.megacom.employees.mapper;

import kg.megacom.employees.models.Position;
import kg.megacom.employees.models.dtos.PositionDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PositionMapper extends BaseMapper<Position, PositionDto>{

    PositionMapper INSTANCE = Mappers.getMapper(PositionMapper.class);
}
