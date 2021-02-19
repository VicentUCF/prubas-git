/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor;

/**
 *
 * @author VicentUCF
 */
public class Profesor extends Becari{
   
    private  final Curs[] cursos= new Curs[100];

    public Profesor(String dni, String nom) {
        super(dni, nom);
        
    }
    
      @Override
    public boolean equals(Object prof){
    return dni.equals(((Profesor)prof).getDni());
    }
    
    public Examen possarExamen(Curs curs,int trimestre){
        
        Examen ex = new Examen(curs,trimestre);
        curs.addExamen(ex, trimestre);
        System.out.println(nom + " Ha posat un examen de "+ curs.getNom() + " del " + trimestre + "r trimestre" );
        
        return ex;
    }
    public double getPercentageSuspesos(Curs curs){
        int cant_alumnes = 0;
        int cant_aprovats=0;
        
        for (int i = 0; i < curs.getAlumnes().length; i++) {
            if (curs.getAlumnes()[i]!=null) {
                cant_alumnes++;
            }
        }
        
        
        for (int i = 0; i < curs.getAprovats().length; i++) {
            if (curs.getAprovats()[i]!=null) {
                cant_aprovats++;
            }
        }
        
        return (100 * cant_aprovats)/cant_alumnes;
       
    }
    public double getPercentageAprovats(Curs curs){
        int cant_alumnes = 0;
        int cant_suspesos=0;
        
         for (int i = 0; i < curs.getAlumnes().length; i++) {
            if (curs.getAlumnes()[i]!=null) {
                cant_alumnes++;
            }
        }
        
        for (int i = 0; i < curs.getSuspesos().length; i++) {
            if (curs.getSuspesos()[i]!=null) {
                cant_suspesos++;
            }
        }
        
        return (100 * cant_suspesos)/cant_alumnes;
    }

    public Curs[] getCursos() {
        return cursos;
    }

  

    
    
}
