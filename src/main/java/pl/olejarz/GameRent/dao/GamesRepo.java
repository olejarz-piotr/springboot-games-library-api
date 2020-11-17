package pl.olejarz.GameRent.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.olejarz.GameRent.dao.entity.Game;

@Repository
public interface  GamesRepo extends CrudRepository<Game,Integer> {

}
