package models;

import javax.persistence.*;

@Entity
public class LieuScene {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer idscene;
    @Column
    private Integer idlieu;
    public LieuScene(){

    }

    public LieuScene(Integer id, Integer idscene, Integer idlieu) {
        this.id = id;
        this.idscene = idscene;
        this.idlieu = idlieu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdscene() {
        return idscene;
    }

    public void setIdscene(Integer idscene) {
        this.idscene = idscene;
    }

    public Integer getIdlieu() {
        return idlieu;
    }

    public void setIdlieu(Integer idlieu) {
        this.idlieu = idlieu;
    }
}
