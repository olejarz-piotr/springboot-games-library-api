package pl.olejarz.GameRent.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Game {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private String title;
    private LocalDate productionYear;
    private String genre;

    public Game(int id, String title, LocalDate productionYear, String genre) {
        this.id = id;
        this.title = title;
        this.productionYear = productionYear;
        this.genre = genre;
    }

    public Game() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(LocalDate productionYear) {
        this.productionYear = productionYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
