package kg.megacom.employees.mapper;

import kg.megacom.employees.models.Phone;
import kg.megacom.employees.models.dtos.PhoneDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface PhoneMapper extends BaseMapper<Phone, PhoneDto>{

    PhoneMapper INSTANCE = Mappers.getMapper(PhoneMapper.class);

}
