/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle;

import edu.salle.custommoodle.model.Student;
import edu.salle.custommoodle.view.StudentWindow;

/**
 *
 * @author padilla
 */
public class App {
    public static void main(String[] args) {
//        Student s1 = new Student("Francisco", "Perez");
//        Student s2 = new Student("Jorge", "Padilla");
//        Student s3 = new Student("Sofia", "Enriquez");
//        Student s4 = new Student("Diego", "DeLaVega");
//        
//        
//        
//        System.out.println(s1);
        StudentWindow window = new StudentWindow ();
        window.setVisible(true);
    }
    
}
