package com.example.polimorfismo_poo.Models;

import java.util.ArrayList;

public interface  StudenManagment {
 void guardar(Students student);

 void actualizar(Students student);
 ArrayList<Students> getStudents();
}
