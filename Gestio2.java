/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor;

import java.util.Scanner;

/**
 *
 * @author VicentUCF
 */
public class Gestio2 {
    
    static Scanner t = new Scanner(System.in);
    
    static Menu m = new Menu();
    static Tools h = new Tools();
    
       
        static boolean f_cons=false;
        static boolean f_sub_cons=false;
        
       
        static int op_cons;
        static int op_subcons;
    
       static Academia academia = new Academia(100,100,100,100);
         //Creacio Alumnes//
       static Alumne Paco = new Alumne("72560767A","Paco");
       static Alumne Alberto = new Alumne("13960010R","Alberto");
       static Alumne Pablo = new Alumne("69562050V","Pablo");
       static Alumne Esteban = new Alumne("23192692J","Esteban");
       static Alumne Belinda = new Alumne("23195692J","Belinda");
       static Alumne Roberto = new Alumne("81710953F","Roberto");
       static Alumne Marc = new Alumne("94642889H","Marc");
        //Final Alumnes
        
        //Creacio Professors
       static Profesor Sebas = new Profesor("74934697Q","Sebas");
       static Profesor Antonio = new Profesor("87500725G","Antonio");
       static Profesor Plamen = new Profesor("29705217L","Plamen");
       static Profesor Pekas = new Profesor("90258023T","Pekas");
       static Profesor Vicent = new Profesor("52325361V","Vicent");
        //Final Professors 
        
        //Creacio Cursos
       static Curs informatica = new Curs("informatica",2021,25,1,20);
       static Curs SI = new Curs("SI",2021,25,1,20);
       static Curs BDD = new Curs("BDD",2021,25,1,20);
       static Curs FOL  = new Curs("FOL",2021,25,1,20);
        //Final Cursos
        
        //Creacio Becaris
       static Becari Pepe = new Becari("74276294A","Pepe",informatica,2020);
       static Becari Juan = new Becari("44573915B","Juan",informatica,2020);
       static Becari Lorena = new Becari("70274005R","Lorena",informatica,2020);
       static Becari Domingo = new Becari("55821885B","Domingo",informatica,2020);
       static Becari Aitor = new Becari("35679183S","Aitor",informatica,2020);
        //Final becaris
       
    public static void main(String[] args) {
        
         //Matricular Alumnes
       academia.MatricularAlumne(informatica, Paco);
       academia.MatricularAlumne(informatica, Alberto);
       academia.MatricularAlumne(informatica, Pablo);
       academia.MatricularAlumne(informatica, Esteban);
       academia.MatricularAlumne(informatica, Belinda);
       academia.MatricularAlumne(informatica, Roberto);
       academia.MatricularAlumne(informatica, Marc);
       
       academia.MatricularAlumne(SI, Paco);
       academia.MatricularAlumne(SI, Alberto);
       academia.MatricularAlumne(SI, Pablo);
       academia.MatricularAlumne(SI, Esteban);       
       academia.MatricularAlumne(SI, Belinda);
       academia.MatricularAlumne(SI, Roberto);
       academia.MatricularAlumne(SI, Marc);
       
       academia.MatricularAlumne(FOL, Esteban);       
       academia.MatricularAlumne(FOL, Belinda);
       academia.MatricularAlumne(FOL, Roberto);
       academia.MatricularAlumne(FOL, Marc);
       
       
         academia.MatricularAlumne(BDD, Paco);
       academia.MatricularAlumne(BDD, Alberto);
       academia.MatricularAlumne(BDD, Pablo);
       academia.MatricularAlumne(BDD, Esteban);
       academia.MatricularAlumne(BDD, Belinda);
     

       //Final Matricular Alumnes
       
       //Asiganar Profesor a un curs
       academia.asignarProfesor(informatica,Vicent);
        academia.asignarProfesor(FOL,Sebas);
        academia.asignarProfesor(SI,Pekas);
         academia.asignarProfesor(BDD,Plamen);
        //Final asignar
        
        //Asignar Becaris
        academia.asignarBecari(informatica,Pepe);
        academia.asignarBecari(FOL,Juan);
        academia.asignarBecari(FOL,Lorena);
        academia.asignarBecari(informatica,Aitor);
        academia.asignarBecari(SI,Domingo);
         academia.asignarBecari(SI,Pepe);
        //Final Asignar Becaris
        
        //Anyadir Cursos a la academia
        academia.anyadirCurs(informatica);
         academia.anyadirCurs(SI);
         academia.anyadirCurs(FOL);
         academia.anyadirCurs(BDD);
        //Finalitzar curs
        
        //POSAR EXAMENS 1
        Examen ex = Sebas.possarExamen(informatica,0);
        Examen ex1 = Sebas.possarExamen(informatica,1);
        Examen ex2 = Sebas.possarExamen(informatica,2);
        
        Examen ex3 = Pekas.possarExamen(SI,0);
        Examen ex4= Pekas.possarExamen(SI,1);
        Examen ex5 = Pekas.possarExamen(SI,2);
       //Final Posar Examens
       
       
       //Fer EXAMENS 1
       Paco.ferExamen(informatica, 0);
       Paco.ferExamen(informatica, 1);
       Paco.ferExamen(informatica, 2);
       
       Paco.ferExamen(SI, 0);
       Paco.ferExamen(SI, 1);
       Paco.ferExamen(SI, 2);
       
       Alberto.ferExamen(informatica, 0);
       Alberto.ferExamen(informatica, 1);
       Alberto.ferExamen(informatica, 2);
       
       Alberto.ferExamen(SI, 0);
       Alberto.ferExamen(SI, 1);
       Alberto.ferExamen(SI, 2);
       
       
       Pablo.ferExamen(informatica, 0);
       Pablo.ferExamen(informatica, 1);
       Pablo.ferExamen(informatica, 2);
       
       Pablo.ferExamen(SI, 0);
       Pablo.ferExamen(SI, 1);
       Pablo.ferExamen(SI, 2);
       
       Esteban.ferExamen(informatica, 0);
       Esteban.ferExamen(informatica, 1);
       Esteban.ferExamen(informatica, 2);
       
       Esteban.ferExamen(SI, 0);
       Esteban.ferExamen(SI, 1);
       Esteban.ferExamen(SI, 2);
       
       Belinda.ferExamen(informatica, 0);
       Belinda.ferExamen(informatica, 1);
       Belinda.ferExamen(informatica, 2);
       
       Belinda.ferExamen(SI, 0);
       Belinda.ferExamen(SI, 1);
       Belinda.ferExamen(SI, 2);
       //FINAL FER EXAMENS 1
       
       
       //CorregirExamens
        for (int i = 0; i < ex.getProva().length; i++) {
            if (ex.getProva()[i]!=null) {
                Pepe.CorregirProva(ex.getProva()[i]);
            }
        }
        
        for (int i = 0; i < ex1.getProva().length; i++) {
            if (ex1.getProva()[i]!=null) {
                Pepe.CorregirProva(ex1.getProva()[i]);
            }
        }
        
            for (int i = 0; i < ex2.getProva().length; i++) {
                  if (ex2.getProva()[i]!=null) {
                Pepe.CorregirProva(ex2.getProva()[i]);
                }
            }
        
       
       //FInal corregir Examens
       
       MenuPrincipal();
       
     
        
        
        
        
    }
    
    
    public static void MenuPrincipal(){
     boolean f_prg=false;
     int op_pr;
    do{
        
        do{
        m.MostrarMenuPrincipal();
        op_pr = t.nextInt();
        }while(op_pr<1||op_pr>4);
        
            switch (op_pr){
            
                case 1:{
                    GestioAlumnes();
                    break;
                }
            
                case 2:{
                    GestioProfesors();
                    break;
                }
                
                case 3:{
                    GestioBecaris();
                    break;
                }
                
                case 4:{
                    f_prg =true;
                    break;
                }
                
            }
    
    }while(f_prg==false);
    
    }
    
    public static void GestioAlumnes(){
        boolean f_prg=false;
     int op_pr;
    do{
        
        do{
        m.MostrarMenuAlumnes();
        op_pr = t.nextInt();
        }while(op_pr<1||op_pr>5);
        
            switch (op_pr){
            
                case 1:{
                    LlistarAlumnes();
                    break;
                }
            
                case 2:{
                    academia.LlistarCursos();
                    break;
                }
                
                case 3:{
                    MatricularAlumne();
                    break;
                }
                
                case 4:{
                    FerExamen();
                    break;
                }
                
                case 5:{
                    f_prg =true;
                    break;
                }
                
            }
    
    }while(f_prg==false);
    
    }
    
    public static void FerExamen(){
        
                    
                    academia.LlistarAlumnes();
                    
                    System.out.println("DNI | Alumne: ");
                    String dni = t.next();
                    Alumne p = new Alumne(dni,"NULL");
                    
                    academia.LlistarCursos();
                    System.out.println("Curs: ");
                    String nom_curs = t.next();
                    System.out.println("AnyCurs: ");
                    int any_curs = t.nextInt();
                    Curs c = new Curs(nom_curs,any_curs);
    
                    for (int i = 0; i < academia.getAlumnes().length; i++) {
                        if (academia.getAlumnes()[i]!=null&&academia.getAlumnes()[i].equals(p)) {
                            for (int j = 0; j < academia.getCursos().length; j++) {
                                if (academia.getCursos()[j]!=null&&academia.getCursos()[j].equals(c)) {
                                    System.out.println("Trimestre: ");
                                    int trimestre = t.nextInt();
                                   academia.getAlumnes()[i].ferExamen(academia.getCursos()[j],trimestre-1);
                                }
                            }
                        }
  
                    }
                    
        
    }
    
    public static void MatricularAlumne(){
     int alumne=0;
     int mal;
     Alumne nou = new Alumne("null","null");
     boolean verificat=false;
     boolean f_prg=false;
     int op_pr;
    do{
        
        do{
        m.MostrarSubMenuMatricular();
        op_pr = t.nextInt();
        }while(op_pr<1||op_pr>2);
     
            switch (op_pr){
            
                case 1:{
                     System.out.println("Introudint nou Alumne Al sistema");
                     System.out.println("Nom: ");
                     String nomal = t.next();
                     System.out.println("DNI:");
                     String dni = t.next();
                                           
                     nou  = new Alumne (dni,nomal);
                     verificat =true;
                break;
                }
                
                
                case 2:{
                    System.out.println("Buscant Alumne");
                    System.out.println("DNI:");
                    String dni = t.next();
                        for (int i = 0; i < academia.getAlumnes().length; i++) {
                                    if (academia.getAlumnes()[i]!=null) {
                                                if (academia.getAlumnes()[i].equals(dni)) {
                                                     alumne = i;
                                                     verificat =true;
                                                }
                                    }
                        }
                
                break;
                }
            
                
            }
     
     
    }while(verificat==false); 
    
     verificat=false;
            do{
                academia.LlistarCursos();
                System.out.println("Nom del curs al que vols  matricular el alumne?");
                String mcurs = t.next();
                System.out.println("De quin any?");
                int many = t.nextInt();
                Curs c = new Curs(mcurs,many);
                        for (int i = 0; i < academia.getCursos().length; i++) {
                                     if (academia.getCursos()[i]!=null) {
                                                if (academia.getCursos()[i].equals(c)) {
                                                            if (op_pr==1) {
                                                 
                                                                academia.MatricularAlumne(academia.getCursos()[i], nou);
                                                                    verificat=true;
                                                            }else if (op_pr ==2) {
                                                 
                                                                academia.MatricularAlumne(academia.getCursos()[i], academia.getAlumnes()[alumne]);
                                                 
                                                                verificat=true;
                                                            }
                                             
                                                }
                                     }
                         }
            }while(verificat == false);
    
    }
    
    public static void LlistarAlumnes(){
        
        boolean f_prg=false;
     int op_pr;
    do{
        
        do{
        m.MostrarSubMenuAlumnesLlistar();
        op_pr = t.nextInt();
        }while(op_pr<1||op_pr>4);
        
            switch (op_pr){
            
                case 1:{
                    academia.LlistarAlumnes();
                    break;
                }
            
                case 2:{
                    for (int i = 0; i < academia.getCursos().length; i++) {
                        if (academia.getCursos()[i]!=null) {
                            System.out.println("----------------------------------");
                            System.out.println(academia.getCursos()[i].getNom());
                            System.out.println("----------------------------------");
                            academia.getCursos()[i].LlistarAlumnesCurs();
                        }
                    }
                    break;
                }
                
                case 3:{
                    boolean trobat = false;
                    System.out.println("Alumne | DNI:");
                    String dni =  t.next();
                    Alumne ser = new Alumne(dni,"null");
                        for (int i = 0; i < academia.getAlumnes().length; i++) {
                            if (academia.getAlumnes()[i]!=null && academia.getAlumnes()[i].equals(ser)) {
                                trobat =true;
                                for (int j = 0; j < academia.getAlumnes()[i].getCursos().length; j++) {
                                    if (academia.getAlumnes()[i].getCursos()[j]!=null) {
                                        System.out.println(academia.getAlumnes()[i].getCursos()[j].getNom());
                                    }
                                }
                                
                            }
                        
                    }
                        
                        if (!trobat) {
                            System.out.println("No s'ha trobat el alumne introduit");
                        }
                        
                    break;
                }
                
                case 4:{
                    f_prg =true;
                    break;
                }
                
            }
    
    }while(f_prg==false);
    
    }
    
    public static void GestioProfesors(){
        boolean f_prg=false;
     int op_pr;
    do{
        
        do{
        m.MostrarMenuProfesor();
        op_pr = t.nextInt();
        }while(op_pr<1||op_pr>5);
        
            switch (op_pr){
            
                case 1:{
                    LlistarProfesors();
                    break;
                }
            
                case 2:{
                    boolean introduit=false;
                    academia.LlistarCursos();
                    
                    System.out.println("DNI | Professor: ");
                    String dni = t.next();
                    Profesor p = new Profesor(dni,"NULL");
                    
                    System.out.println("Curs: ");
                    String nom_curs = t.next();
                    System.out.println("AnyCurs: ");
                    int any_curs = t.nextInt();
                    Curs c = new Curs(nom_curs,any_curs);
                    
                        for (int i = 0; i < academia.getCursos().length&&!introduit; i++) {
                            if ( academia.getCursos()[i]!=null && academia.getCursos()[i].equals(c)) {
                                if (academia.getCursos()[i].getProfesors()[0]==null) {
                                    for (int j = 0; j < academia.getProfes().length&&!introduit; j++) {
                                        if (academia.getProfes()[j]!=null&&academia.getProfes()[j].equals(p)) {
                                             academia.getCursos()[i].getProfesors()[0]=academia.getProfes()[j];
                                             introduit =true;
                                        }
                                    }
                                }
                            }
                    }
                        
                    break;
                }
                
                case 3:{
                     boolean introduit=false;
                    academia.LlistarCursos();
                    
                    System.out.println("DNI | Professor: ");
                    String dni = t.next();
                    Profesor p = new Profesor(dni,"NULL");
                    
                    System.out.println("Curs: ");
                    String nom_curs = t.next();
                    System.out.println("AnyCurs: ");
                    int any_curs = t.nextInt();
                    Curs c = new Curs(nom_curs,any_curs);
                    
                    System.out.println("Trimestre: ");
                    int trimestre = t.nextInt();
                    
                    for (int i = 0; i < academia.getCursos().length; i++) {
                        if (academia.getCursos()[i]!=null&&academia.getCursos()[i].equals(c)) {
                            if (academia.getCursos()[i].getProfesors()[0]!=null&&academia.getCursos()[i].getProfesors()[0].equals(p)) {
                                academia.getCursos()[i].getProfesors()[0].possarExamen(c, trimestre);
                            }
                        }
                    }
                   
                    break;
                }
                
                 case 4:{
                    NotesExamens();
                    break;
                }
                                 
                 case 5:{
                    f_prg =true;
                    break;
                }
                 
                 
                
                
            }
    
    }while(f_prg==false);
    
    }
    
   public static void LlistarProfesors(){
        boolean f_prg=false;
     int op_pr;
    do{
        
        do{
        m.MostrarSubMenuProfesor();
        op_pr = t.nextInt();
        }while(op_pr<1||op_pr>4);
        
            switch (op_pr){
            
                case 1:{
                    academia.LlistarProfesors();
                    break;
                }
            
                case 2:{
                    for (int i = 0; i < academia.getCursos().length; i++) {
                        if (academia.getCursos()[i]!=null) {
                            System.out.println("----------------------------------");
                            System.out.println(academia.getCursos()[i].getNom());
                            System.out.println("----------------------------------");
                            academia.getCursos()[i].LlistarProfesorsCurs();
                        }
                    }
                    break;
                }
                
                case 3:{
                     boolean trobat = false;
                    System.out.println("Profesor | DNI:");
                    String dni =  t.next();
                    Profesor ser = new Profesor(dni,"null");
                        for (int i = 0; i < academia.getProfes().length; i++) {
                            if (academia.getProfes()[i]!=null && academia.getProfes()[i].equals(ser)) {
                                trobat =true;
                                for (int j = 0; j < academia.getProfes()[i].getCursos().length; j++) {
                                    if (academia.getProfes()[i].getCursos()[j]!=null) {
                                        System.out.println(academia.getProfes()[i].getCursos()[j].getNom());
                                    }
                                }
                                
                            }
                        
                    }
                        
                        if (!trobat) {
                            System.out.println("No s'ha trobat el Professor introduit");
                        }
                    break;
                }
                
                case 4:{
                    f_prg =true;
                    break;
                }
                
            }
    
    }while(f_prg==false);
    
    }
    
    public static void NotesExamens(){
        boolean f_prg=false;
     int op_pr;
    do{
        
        do{
        m.MostrarNotesExamens();
        op_pr = t.nextInt();
        }while(op_pr<1||op_pr>9);
        
            switch (op_pr){
            
                case 1:{
                   academia.LlistarCursos();
                    
                    System.out.println("Curs: ");
                    String nom_curs = t.next();
                    System.out.println("AnyCurs: ");
                    int any_curs = t.nextInt();
                    Curs c = new Curs(nom_curs,any_curs);
                    
                    System.out.println("Trimestre: ");
                    int trimestre = t.nextInt();
                    trimestre--;
                    
                    System.out.println("----------------------------------");
                    System.out.println("Aprobats");
                    System.out.println("----------------------------------");
                     for (int i = 0; i < academia.getCursos().length; i++) {
                        if (academia.getCursos()[i]!=null&&academia.getCursos()[i].equals(c)) {
                            if (academia.getCursos()[i].getExamens()[trimestre]!=null) {
                                for (int j = 0; j < academia.getCursos()[i].getExamens()[trimestre].getAprobats().length; j++) {
                                    if (academia.getCursos()[i].getExamens()[trimestre].getAprobats()[j]!=null) {
                                        System.out.println(academia.getCursos()[i].getExamens()[trimestre].getAprobats()[j].getNom());
                                    }
                                }
                                 
                            }
                        }
                    }
                    
                    
                    break;
                }
            
                case 2:{
                    academia.LlistarCursos();
                    
                    System.out.println("Curs: ");
                    String nom_curs = t.next();
                    System.out.println("AnyCurs: ");
                    int any_curs = t.nextInt();
                    Curs c = new Curs(nom_curs,any_curs);
                    
                    System.out.println("Trimestre: ");
                    int trimestre = t.nextInt();
                    trimestre--;
                    
                    System.out.println("----------------------------------");
                    System.out.println("Suspesos");
                    System.out.println("----------------------------------");
                     for (int i = 0; i < academia.getCursos().length; i++) {
                        if (academia.getCursos()[i]!=null&&academia.getCursos()[i].equals(c)) {
                            if (academia.getCursos()[i].getExamens()[trimestre]!=null) {
                                for (int j = 0; j < academia.getCursos()[i].getExamens()[trimestre].getAprobats().length; j++) {
                                    if (academia.getCursos()[i].getExamens()[trimestre].getAprobats()[j]!=null) {
                                        System.out.println(academia.getCursos()[i].getExamens()[trimestre].getSuspensos()[j].getNom());
                                    }
                                }
                                 
                            }
                        }
                    }
                    
                    break;
                }
                
                case 3:{
                    
                    academia.LlistarCursos();
                    
                    System.out.println("Curs: ");
                    String nom_curs = t.next();
                    System.out.println("AnyCurs: ");
                    int any_curs = t.nextInt();
                    Curs c = new Curs(nom_curs,any_curs);
                    
                    System.out.println("Trimestre: ");
                    int trimestre = t.nextInt();
                    trimestre--;
                    
                    System.out.println("----------------------------------");
                    System.out.println("Nota Mitja");
                    System.out.println("----------------------------------");
                     for (int i = 0; i < academia.getCursos().length; i++) {
                        if (academia.getCursos()[i]!=null&&academia.getCursos()[i].equals(c)) {
                            if (academia.getCursos()[i].getExamens()[trimestre]!=null) {
                                System.out.println(academia.getCursos()[i].getExamens()[trimestre].getNotaMitja());
                                 
                            }
                        }
                    }
                    
                    break;
                }
                
                case 5:{
                    academia.LlistarCursos();
                    
                    System.out.println("Curs: ");
                    String nom_curs = t.next();
                    System.out.println("AnyCurs: ");
                    int any_curs = t.nextInt();
                    Curs c = new Curs(nom_curs,any_curs);
                    
                 
                    
                    System.out.println("----------------------------------");
                    System.out.println("Percentage Aprovats  de "+c.getNom());
                    System.out.println("----------------------------------");
                     for (int i = 0; i < academia.getCursos().length; i++) {
                        if (academia.getCursos()[i]!=null&&academia.getCursos()[i].equals(c)) {
                            if ( academia.getCursos()[i].getProfesors()[0]!=null) {
                                System.out.println( academia.getCursos()[i].getProfesors()[0].getPercentageAprovats(academia.getCursos()[i])+"%");
                            }
                              
                        }
                    }
                    
                    break;
                }
                
                case 4:{
                    
                      academia.LlistarCursos();
                    
                    System.out.println("Curs: ");
                    String nom_curs = t.next();
                    System.out.println("AnyCurs: ");
                    int any_curs = t.nextInt();
                    Curs c = new Curs(nom_curs,any_curs);
                    
                 
                    
                    System.out.println("----------------------------------");
                    System.out.println("Percentage Suspesos de "+c.getNom());
                    System.out.println("----------------------------------");
                     for (int i = 0; i < academia.getCursos().length; i++) {
                        if (academia.getCursos()[i]!=null&&academia.getCursos()[i].equals(c)) {
                            if ( academia.getCursos()[i].getProfesors()[0]!=null) {
                                System.out.println( academia.getCursos()[i].getProfesors()[0].getPercentageSuspesos(academia.getCursos()[i])+"%");  
                            }
                              
                        }
                    }
                    
                    break;
                }
                
                case 6:{
                     academia.LlistarCursos();
                    
                    System.out.println("Curs: ");
                    String nom_curs = t.next();
                    System.out.println("AnyCurs: ");
                    int any_curs = t.nextInt();
                    Curs c = new Curs(nom_curs,any_curs);
                    
                 
                    
                    System.out.println("----------------------------------");
                    System.out.println("Nota Maxima "+c.getNom());
                    System.out.println("----------------------------------");
                    
                      for (int i = 0; i < academia.getCursos().length; i++) {
                        if (academia.getCursos()[i]!=null&&academia.getCursos()[i].equals(c)) {
                                System.out.println(academia.getCursos()[i].getNotaMax());
                        }
                      }
              
                    break;
                }
                
                 case 7:{
                   academia.LlistarCursos();
                    
                    System.out.println("Curs: ");
                    String nom_curs = t.next();
                    System.out.println("AnyCurs: ");
                    int any_curs = t.nextInt();
                    Curs c = new Curs(nom_curs,any_curs);
                    
                 
                    
                    System.out.println("----------------------------------");
                    System.out.println("Nota mIn "+c.getNom());
                    System.out.println("----------------------------------");
                    
                      for (int i = 0; i < academia.getCursos().length; i++) {
                        if (academia.getCursos()[i]!=null&&academia.getCursos()[i].equals(c)) {             
                               System.out.println(academia.getCursos()[i].getNotaMin());
                        }
                      }
                    break;
                }
                 
                  case 8:{
                   academia.LlistarCursos();
                    
                    System.out.println("Curs: ");
                    String nom_curs = t.next();
                    System.out.println("AnyCurs: ");
                    int any_curs = t.nextInt();
                    Curs c = new Curs(nom_curs,any_curs);
                    
                 
                    
                    System.out.println("----------------------------------");
                    System.out.println("Nota Mitja "+c.getNom());
                    System.out.println("----------------------------------");
                    
                      for (int i = 0; i < academia.getCursos().length; i++) {
                        if (academia.getCursos()[i]!=null&&academia.getCursos()[i].equals(c)) {             
                                System.out.println(academia.getCursos()[i].getNotaMitja());
                        }
                      }
                    break;
                }
                  
                   case 9:{
                    f_prg =true;
                    break;
                }
                
            }
    
    }while(f_prg==false);
    
    }
    
    public static void GestioBecaris(){
        boolean f_prg=false;
     int op_pr;
    do{
        
        do{
        m.MostrarMenuBecaris();
        op_pr = t.nextInt();
        }while(op_pr<1||op_pr>4);
        
            switch (op_pr){
            
                case 1:{
                       LlistarBecaris();
                    break;
                }
            
                case 2:{
                       boolean introduit=false;
                    academia.LlistarCursos();
                    
                    System.out.println("DNI | Becari: ");
                    String dni = t.next();
                    Becari p = new Becari(dni,"NULL");
                    
                    System.out.println("Curs: ");
                    String nom_curs = t.next();
                    System.out.println("AnyCurs: ");
                    int any_curs = t.nextInt();
                    Curs c = new Curs(nom_curs,any_curs);
                    
                        for (int i = 0; i < academia.getCursos().length&&!introduit; i++) {
                            if ( academia.getCursos()[i]!=null && academia.getCursos()[i].equals(c)) {
                                for (int j = 0; j <  academia.getCursos()[i].getBecaris().length; j++) {
                                    if (academia.getCursos()[i].getBecaris()[j]==null&&academia.getBecaris().equals(p)) {
                                        academia.asignarBecari(academia.getCursos()[i],academia.getCursos()[i].getBecaris()[j] );
                                        
                                    }
                                }
                            }
                    }
                        
                    break;
                }
                
                case 3:{
                academia.LlistarCursos();
                    
                    System.out.println("Curs: ");
                    String nom_curs = t.next();
                    System.out.println("AnyCurs: ");
                    int any_curs = t.nextInt();
                    Curs c = new Curs(nom_curs,any_curs);
                    
                    System.out.println("Trimestre");
                    int trimestre = t.nextInt();
                    
                        for (int i = 0; i < academia.getCursos().length; i++) {
                            if ( academia.getCursos()[i]!=null && academia.getCursos()[i].equals(c)) {
                                for (int j = 0; j <   academia.getCursos()[i].getExamens()[trimestre-1].getProva().length; j++) {
                                    if (academia.getCursos()[i].getExamens()[trimestre-1].getProva()[j]!=null) {
                                       academia.getCursos()[i].getCorrector().CorregirProva(academia.getCursos()[i].getExamens()[trimestre-1].getProva()[j]);
                                    }
                                }
                            }
                        }
                break;
                }
                
                case 4:{
                    f_prg =true;
                    break;
                }
                
            }
    
    }while(f_prg==false);
    
    }
    
    public static void LlistarBecaris(){
        boolean f_prg=false;
     int op_pr;
    do{
        
        do{
            
        m.MostrarSubMenuBecaris();
        op_pr = t.nextInt();
        }while(op_pr<1||op_pr>4);
        
            switch (op_pr){
            
                case 1:{
                    academia.LlistarBecaris();
                    break;
                }
            
                case 2:{
                    for (int i = 0; i < academia.getCursos().length; i++) {
                        if (academia.getCursos()[i]!=null) {
                            System.out.println("----------------------------------");
                            System.out.println(academia.getCursos()[i].getNom());
                            System.out.println("----------------------------------");
                            academia.getCursos()[i].LlistarBecarisCurs();
                        }
                    }
                    
                    break;
                }
                
                case 3:{
                    boolean trobat = false;
                    System.out.println("Becaris | DNI:");
                    String dni =  t.next();
                    Becari ser = new Becari(dni,"null");
                   
                    for (int i = 0; i < academia.getBecaris().length; i++) {
                        if (academia.getBecaris()[i]!=null&&academia.getBecaris()[i].equals(ser)) {
                             System.out.println("----------------------------------");
                            System.out.println(academia.getBecaris()[i].getCurs().getNom());
                             System.out.println("----------------------------------");
                            System.out.println(academia.getBecaris()[i].getNom());
                        }
                    }
                    
                    break;
                }
                
                case 4:{
                    f_prg =true;
                    break;
                }
                
            }
    
    }while(f_prg==false);
    
    }
    
   
}
