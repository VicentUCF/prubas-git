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
public class Menu {

    public Menu() {
    }

 
    
      public  void MostrarMenuPrincipal(){
        System.out.println(" _________________________________");
        System.out.println("|Bienvenido Al Gestor de Academias|");
        System.out.println("|*********************************|");
        System.out.println("|   1.Gestio Alumnes              |");
        System.out.println("|   2.Gestio Profesor             |");
        System.out.println("|   3.Gestio Becaris              |");
        System.out.println("|   4.Eixir                       |");
        System.out.println("|_________________________________|");
    }
    
    
    public  void MostrarMenuAlumnes(){
    
        System.out.println(" _________________________________");
        System.out.println("|       Gestio  Alumnes           |");
        System.out.println("|*********************************|");
        System.out.println("|   1.Llistar Alumnes             |");
        System.out.println("|   2.Llistar Cursos              |");
        System.out.println("|   3.Matricular  Alumne          |");
        System.out.println("|   4.Fer Examen                  |");
        System.out.println("|   5.Arrere                      |");
        System.out.println("|_________________________________|");
    
    }
    
    public  void MostrarSubMenuAlumnesLlistar(){
    
        System.out.println(" _________________________________");
        System.out.println("|         Llistar Alumnes         |");
        System.out.println("|*********************************|");
        System.out.println("|   1.Llistar tots els Alumnes    |");
        System.out.println("|   2.Llistar Alumnes per Curs    |");
        System.out.println("|   3.Llistar Cursos del Alumne   |");
        System.out.println("|   4.Arrere                      |");
        System.out.println("|_________________________________|");
    
   }
    
    
        public  void MostrarSubMenuMatricular(){
    
        System.out.println(" _________________________________");
        System.out.println("|         Matricular Alumnes         |");
        System.out.println("|*********************************|");
        System.out.println("|   1.Alumne nou               |");
        System.out.println("|   2.Alumne estudiant al centre    |");
        System.out.println("|_________________________________|");
    
   }
    
    public  void MostrarMenuProfesor(){
        
        System.out.println(" _________________________________");
        System.out.println("|       Gestio  Professor         |");
        System.out.println("|*********************************|");
        System.out.println("|   1.Llistar Professors          |");
        System.out.println("|   2.Asignar Professor           |");
        System.out.println("|   3.Posar Examen                |");
        System.out.println("|   4.Notes Examen                |");
        System.out.println("|   5.Arrere                      |");
        System.out.println("|_________________________________|");
    
    }
    
    public  void MostrarSubMenuProfesor(){
        
        System.out.println(" _________________________________");
        System.out.println("|      Llistar Professors         |");
        System.out.println("|*********************************|");
        System.out.println("|   1.Ll. tots els Professors     |");
        System.out.println("|   2.Ll. Professors per Curs     |");
        System.out.println("|   3.Ll. Cursos del Professor    |");
        System.out.println("|   4.Arrere                      |");
        System.out.println("|_________________________________|");
    
    
    }
    
     public  void MostrarNotesExamens(){
        
        System.out.println(" _________________________________");
        System.out.println("|      Notes Examens              |");
        System.out.println("|*********************************|");
        System.out.println("|   1.Ll.  els Alumnes Aprovats   |");
        System.out.println("|   2.Ll. tots  Alumnes Suspesos  |");
        System.out.println("|   3.Ll. NotaMitja Examen        |");
        System.out.println("|   4.Percentatge Suspesos        |");
        System.out.println("|   5.Percentatge Aprobats        |");
        System.out.println("|   6.Nota Maxima Curs            |");
        System.out.println("|   7.Nota Minima Curs            |");
        System.out.println("|   8.Nota Mitja Curs             |");
        System.out.println("|   9.Arrere                      |");
        System.out.println("|_________________________________|");
    
    
    }
    
    public  void MostrarMenuBecaris(){
    
        System.out.println(" _________________________________");
        System.out.println("|         Gestio  Becaris         |");
        System.out.println("|*********************************|");
        System.out.println("|   1.Llistar Becaris             |");
        System.out.println("|   2.Asignar Becari              |");
        System.out.println("|   3.Corregir Examen             |");
        System.out.println("|   4.Arrere                      |");
        System.out.println("|_________________________________|");
    }
    
    public  void MostrarSubMenuBecaris(){
        System.out.println(" _________________________________");
        System.out.println("|        Llistar Becaris          |");
        System.out.println("|*********************************|");
        System.out.println("|   1.Ll. Tots els Becaris        |");
        System.out.println("|   2.Ll. Becaris per Curs        |");
        System.out.println("|   3.Ll. Cursos del Becari       |");
        System.out.println("|   4.Arrere                      |");
        System.out.println("|_________________________________|");        
    
    }
    
}
