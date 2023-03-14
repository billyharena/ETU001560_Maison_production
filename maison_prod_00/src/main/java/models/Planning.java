package models;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
public class Planning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer idscene;
    @Column
    private Timestamp debtournage;
    @Column
    private Timestamp fintournage;
    @Column
    private Integer etat;
    @Column
    private Integer reporte;
    public Planning(){

    }

    public Planning(Integer id, Integer idscene, Timestamp debtournage, Timestamp fintournage, Integer etat, Integer reporte) {
        this.id = id;
        this.idscene = idscene;
        this.debtournage = debtournage;
        this.fintournage = fintournage;
        this.etat = etat;
        this.reporte = reporte;
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

    public Timestamp getDebtournage() {
        return debtournage;
    }

    public void setDebtournage(Timestamp debtournage) {
        this.debtournage = debtournage;
    }

    public Timestamp getFintournage() {
        return fintournage;
    }

    public void setFintournage(Timestamp fintournage) {
        this.fintournage = fintournage;
    }

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    public Integer getReporte() {
        return reporte;
    }

    public void setReporte(Integer reporte) {
        this.reporte = reporte;
    }
}
