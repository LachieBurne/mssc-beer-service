package burne.springframework.mssc_beer_service.web.controller;

import burne.springframework.mssc_beer_service.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeeryById(@PathVariable("beerId") UUID beerId) {
        //todo impl
        return new ResponseEntity<BeerDto>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity saveNewBeer(@Validated @RequestBody BeerDto beerDto) {
        //todo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @Validated @RequestBody BeerDto beerDto) {
        //todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
