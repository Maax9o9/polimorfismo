package com.example.polimorfismo_poo.Models;

import java.util.ArrayList;

public class DataBase2 implements  StudenManagment {
    private ArrayList<Students> students = new ArrayList<>();

    @Override
    public void guardar(Students student) {
        students.add(student);
        System.out.println("Registro guardado en DataBase2");
    }

    @Override
    public void actualizar(Students student) {
        for (Students e : students) {
            if (e.getNombre().equals(student.getNombre())) {
                e.setEdad(student.getEdad());
                System.out.println("Registro actualizado en DataBase2");
                return;
            }
        }
        System.out.println("Registro no encontrado en DataBase2");
    }

    @Override
    public ArrayList<Students> getStudents() {
        return students;
    }

}

