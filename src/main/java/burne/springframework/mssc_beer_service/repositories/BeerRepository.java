package burne.springframework.mssc_beer_service.repositories;

import burne.springframework.mssc_beer_service.domain.Beer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BeerRepository extends CrudRepository<Beer, UUID> {
}
