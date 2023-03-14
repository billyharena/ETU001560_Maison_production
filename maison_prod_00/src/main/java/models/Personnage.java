package models;

import javax.persistence.*;

@Entity
public class Personnage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String genre;
    @Column
    private String personnage;
    public Personnage(){

    }

    public Personnage(Integer id, String genre, String personnage) {
        this.id = id;
        this.genre = genre;
        this.personnage = personnage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPersonnage() {
        return personnage;
    }

    public void setPersonnage(String personnage) {
        this.personnage = personnage;
    }
}
