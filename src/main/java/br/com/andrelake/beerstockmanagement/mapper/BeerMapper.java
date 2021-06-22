package br.com.andrelake.beerstockmanagement.mapper;

import br.com.andrelake.beerstockmanagement.dto.BeerDTO;
import br.com.andrelake.beerstockmanagement.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
