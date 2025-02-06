package burne.springframework.mssc_beer_service.web.mappers;

import burne.springframework.mssc_beer_service.domain.Beer;
import burne.springframework.mssc_beer_service.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class}, componentModel = "spring")
public interface BeerMapper {
    BeerDto BeertoBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto beerDto);
}
