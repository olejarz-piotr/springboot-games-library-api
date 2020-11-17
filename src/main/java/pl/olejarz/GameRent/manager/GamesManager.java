package pl.olejarz.GameRent.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.olejarz.GameRent.dao.GamesRepo;
import pl.olejarz.GameRent.dao.entity.Game;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class GamesManager {

    private GamesRepo gamesrepo;

    @Autowired
    public GamesManager(GamesRepo gamesrepo) {
        this.gamesrepo = gamesrepo;
    }


    public Optional<Game> findById(Integer id) {
        return gamesrepo.findById(id);
    }

    public Iterable<Game> findAll() {
        return gamesrepo.findAll();
    }

    public Game save(Game game) {
        return gamesrepo.save(game);

    }

    public void deleteById(Integer id) {
        gamesrepo.deleteById(id);

    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        save(new Game(1, "Need for Speed Most Wanted", LocalDate.of(2005, 6, 29), "racing"));
        save(new Game(2, "Battlefield 3", LocalDate.of(2011, 3, 22), "fps"));
    }


}
