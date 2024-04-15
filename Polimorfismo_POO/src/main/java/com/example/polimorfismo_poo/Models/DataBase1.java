package com.example.polimorfismo_poo.Models;

import java.util.ArrayList;

public class DataBase1 implements StudenManagment {
    private ArrayList<Students> students = new ArrayList<>();

    @Override
    public void guardar(Students student) {
        students.add(student);
        System.out.println("Registro guardado en DataBase1");
    }

    @Override
    public void actualizar(Students student) {
        for (Students e : students) {
            if (e.getNombre().equals(student.getNombre())) {
                e.setEdad(student.getEdad());
                System.out.println("Registro actualizado en DataBase1");
                return;
            }
        }
        System.out.println("Registro no encontrado en DataBase1");
    }

    @Override
    public ArrayList<Students> getStudents() {
        return students;
    }

}
