package com.citt.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

// Comentario para github actions

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Despacho {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDespacho;
    //@NotNull(message = "Fecha de despacho es obligatoria")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)  // Especifica el formato de fecha
    private LocalDate fechaDespacho;
    private String patenteCamion;
    private int intento;
    private Long idCompra;
    //@NotBlank(message = "La dirección es obligatoria")
    private String direccionCompra;
    private Long valorCompra;
    private boolean despachado = false;

    public Despacho() {
    }

    public Despacho(Long idDespacho, LocalDate fechaDespacho, String patenteCamion, int intento, Long idCompra, String direccionCompra, Long valorCompra, boolean despachado) {
        this.idDespacho = idDespacho;
        this.fechaDespacho = fechaDespacho;
        this.patenteCamion = patenteCamion;
        this.intento = intento;
        this.idCompra = idCompra;
        this.direccionCompra = direccionCompra;
        this.valorCompra = valorCompra;
        this.despachado = despachado;
    }

    public Long getIdDespacho() {
        return idDespacho;
    }

    public void setIdDespacho(Long idDespacho) {
        this.idDespacho = idDespacho;
    }

    public LocalDate getFechaDespacho() {
        return fechaDespacho;
    }

    public void setFechaDespacho(LocalDate fechaDespacho) {
        this.fechaDespacho = fechaDespacho;
    }

    public String getPatenteCamion() {
        return patenteCamion;
    }

    public void setPatenteCamion(String patenteCamion) {
        this.patenteCamion = patenteCamion;
    }

    public int getIntento() {
        return intento;
    }

    public void setIntento(int intento) {
        this.intento = intento;
    }

    public Long getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Long idCompra) {
        this.idCompra = idCompra;
    }

    public String getDireccionCompra() {
        return direccionCompra;
    }

    public void setDireccionCompra(String direccionCompra) {
        this.direccionCompra = direccionCompra;
    }

    public Long getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Long valorCompra) {
        this.valorCompra = valorCompra;
    }

    public boolean isDespachado() {
        return despachado;
    }

    public void setDespachado(boolean despachado) {
        this.despachado = despachado;
    }

    @Override
    public String toString() {
        return "Despacho{" +
                "idDespacho=" + idDespacho +
                ", fechaDespacho=" + fechaDespacho +
                ", patenteCamion='" + patenteCamion + '\'' +
                ", intento=" + intento +
                ", idCompra=" + idCompra +
                ", direccionCompra='" + direccionCompra + '\'' +
                ", valorCompra=" + valorCompra +
                ", despachado=" + despachado +
                '}';
    }
}