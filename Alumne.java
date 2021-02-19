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
public class Alumne {
    
    private String dni;
    private String nom;
    private Curs[] cursos;

    public Alumne(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
         this.cursos = new Curs[10];
    }

    
    
    public boolean equals(Object alumne){
    return dni.equals(((Alumne)alumne).getDni());
    }
    
    public ProvaEscrita ferExamen(Curs c , int trimestre){
        
        if (trimestre<3&&trimestre>=0&&c.getExamens()[trimestre]!=null) {
        ProvaEscrita prov = new ProvaEscrita(c.getExamens()[trimestre],this);
        c.getExamens()[trimestre].addProvaEscrita(prov);
        
        System.out.println(nom + " Ha fet un examen de "+ c.getExamens()[trimestre].getCurs().getNom() + " del " + (trimestre+1) + "r trimestre" );
        return prov;
        }else{
            System.out.println("Aquest Examen no existix encara");
        return null;
        }
        
       
        
      
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Curs[] getCursos() {
        return cursos;
    }

    public void setCursos(Curs[] cursos) {
        this.cursos = cursos;
    }
    
    
    
}
