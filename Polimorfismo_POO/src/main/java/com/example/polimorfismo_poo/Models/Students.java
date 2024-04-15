package com.example.polimorfismo_poo.Models;

public class Students {
    private String nombre;
    private Integer edad;

    public Students(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Students{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
