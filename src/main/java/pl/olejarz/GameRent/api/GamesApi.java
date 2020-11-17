package pl.olejarz.GameRent.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.olejarz.GameRent.dao.entity.Game;
import pl.olejarz.GameRent.manager.GamesManager;

import java.util.Optional;

@RestController
@RequestMapping("/api/games")
public class GamesApi {

    private GamesManager games;

    @Autowired
    public GamesApi(GamesManager games) {
        this.games = games;
    }

    @GetMapping("/all")
    public Iterable<Game> getAll() {
        return games.findAll();

    }

    @GetMapping("/find")
    public Optional<Game> getById(@RequestParam int index) {
        return games.findById(index);
    }

    @PostMapping
    public Game save(@RequestBody Game game){

        return games.save(game);
    }

    @PutMapping
    public Game update(@RequestBody Game game){

        return games.save(game);
    }

    @DeleteMapping
    public void delete(@RequestParam int id){
         games.deleteById(id);
    }


}
