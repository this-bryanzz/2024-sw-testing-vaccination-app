package edu.softwaretesting2.dummymavenapp.vaccination_app.model;

import java.time.LocalDate;

public class Persona {

    private String nombre;
    private LocalDate fechaDeNacimiento;

    public Persona(String nombre, LocalDate fechaDeNacimiento) {
        this.setNombre(nombre);
        this.setFechaDeNacimiento(fechaDeNacimiento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
