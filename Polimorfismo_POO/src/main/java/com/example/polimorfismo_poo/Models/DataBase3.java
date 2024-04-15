package com.example.polimorfismo_poo.Models;

import java.util.ArrayList;

public class DataBase3 implements  StudenManagment {
    private ArrayList<Students> students = new ArrayList<>();

    @Override
    public void guardar(Students student) {
        students.add(student);
        System.out.println("Registro guardado en DataBase3");
    }

    @Override
    public void actualizar(Students student) {
        for (Students e : students) {
            if (e.getNombre().equals(student.getNombre())) {
                e.setEdad(student.getEdad());
                System.out.println("Registro actualizado en DataBase3");
                return;
            }
        }
        System.out.println("Registro no encontrado en DataBase3");
    }

    @Override
    public ArrayList<Students> getStudents() {
        return students;
    }

}

