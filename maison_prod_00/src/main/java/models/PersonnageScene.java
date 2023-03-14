package models;

import javax.persistence.*;

@Entity
public class PersonnageScene {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer idscene;
    @Column
    private Integer idpersonnage;
    public PersonnageScene(){

    }

    public PersonnageScene(Integer id, Integer idscene, Integer idpersonnage) {
        this.id = id;
        this.idscene = idscene;
        this.idpersonnage = idpersonnage;
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

    public Integer getIdpersonnage() {
        return idpersonnage;
    }

    public void setIdpersonnage(Integer idpersonnage) {
        this.idpersonnage = idpersonnage;
    }
}
