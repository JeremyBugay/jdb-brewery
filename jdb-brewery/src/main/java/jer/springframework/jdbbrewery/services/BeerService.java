package jer.springframework.jdbbrewery.services;


import jer.springframework.jdbbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
   BeerDto getBeerById(UUID beerId);

   BeerDto saveNewBeer(BeerDto beerDto);

   void updateBeer(UUID beerId, BeerDto beerDto);
}
