package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Alumne alumne=new Alumne("Marta",14,788,new double []{5,7,3,8});
        Alumne alumne1=new Alumne("David",14,778,new double []{6,7,7,8});
        Alumne alumne2=new Alumne("Pedro",14,893,new double []{5,5,3,4});
        Alumne alumne3=new Alumne("Maria",14,988,new double []{5,7,6,5});
        Alumne alumne4=new Alumne("Carolina",14,124,new double []{8,8,9,10});

        ArrayList<Alumne> llistaAlumnes =new ArrayList<Alumne>();

        llistaAlumnes.add(alumne);
        llistaAlumnes.add(alumne1);
        llistaAlumnes.add(alumne2);
        llistaAlumnes.add(alumne3);
        llistaAlumnes.add(alumne4);

        Assignatura assignatura=new Assignatura("Matematicas",llistaAlumnes);

        assignatura.printAssignatura();
        //assignatura.printAlumne();
        Alumne alumne5=new Alumne("Jaon",13,568,new double []{9,8,9,9});
        Alumne alumne6=new Alumne("Esperança",14,238,new double []{5,6,6,5});

        assignatura.nouMatriculat(alumne5);
        assignatura.nouMatriculat(alumne6);
        //assignatura.printAlumne();
        assignatura.baixaAlumne(alumne6);
        assignatura.printAlumne();

    }
}
