package kg.megacom.employees.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import kg.megacom.employees.models.Position;
import kg.megacom.employees.models.dtos.PositionDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-05T10:46:20+0600",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.16 (Oracle Corporation)"
)
public class PositionMapperImpl implements PositionMapper {

    @Override
    public Position toEntity(PositionDto d) {
        if ( d == null ) {
            return null;
        }

        Position position = new Position();

        position.setId( d.getId() );
        position.setDef( d.getDef() );

        return position;
    }

    @Override
    public PositionDto toDto(Position e) {
        if ( e == null ) {
            return null;
        }

        PositionDto positionDto = new PositionDto();

        positionDto.setId( e.getId() );
        positionDto.setDef( e.getDef() );

        return positionDto;
    }

    @Override
    public List<Position> toEntities(List<PositionDto> d) {
        if ( d == null ) {
            return null;
        }

        List<Position> list = new ArrayList<Position>( d.size() );
        for ( PositionDto positionDto : d ) {
            list.add( toEntity( positionDto ) );
        }

        return list;
    }

    @Override
    public List<PositionDto> toDtos(List<Position> e) {
        if ( e == null ) {
            return null;
        }

        List<PositionDto> list = new ArrayList<PositionDto>( e.size() );
        for ( Position position : e ) {
            list.add( toDto( position ) );
        }

        return list;
    }
}
