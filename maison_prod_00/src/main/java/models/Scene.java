package models;

import javax.persistence.*;
import java.sql.Time;

@Entity
public class Scene {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String titre;
    @Column
    private String description;
    @Column
    private Double duree;
    @Column
    private Time interval1;
    @Column
    private Time interval2;
    @Column
    private Integer priorite;
    public Scene(){

    }
    public Scene(Integer id, String titre, String description, Double duree, Time interval1, Time interval2, Integer priorite) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.duree = duree;
        this.interval1 = interval1;
        this.interval2 = interval2;
        this.priorite = priorite;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDuree() {
        return duree;
    }

    public void setDuree(Double duree) {
        this.duree = duree;
    }

    public Time getInterval1() {
        return interval1;
    }

    public void setInterval1(Time interval1) {
        this.interval1 = interval1;
    }

    public Time getInterval2() {
        return interval2;
    }

    public void setInterval2(Time interval2) {
        this.interval2 = interval2;
    }

    public Integer getPriorite() {
        return priorite;
    }

    public void setPriorite(Integer priorite) {
        this.priorite = priorite;
    }
}
