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
public class Curs {
    
    private final String nom;
    private final int any;
    private Alumne[] alumnes;
    private Profesor[] profesors;
    private final Examen[] examens =new Examen[3];
    private Becari[] becaris;
    
    public Curs(String nom,int any) {
        this.nom = nom;
        this.any = any;
    }
    

    public Curs(String nom,int any, int cantAlumnes, int cantProfesors,int cantBecaris) {
        this.nom = nom;
        this.any = any;
        this.alumnes = new Alumne[cantAlumnes];
        this.profesors = new Profesor[cantProfesors];
        this.becaris = new Becari[cantBecaris];
    }
    
    
    @Override
      public boolean equals(Object c){
             return (nom.equals(((Curs)c).getNom()))&&(any==((Curs)c).getAny());
    }
      
    public void LlistarAlumnesCurs(){
        for (int i = 0; i < alumnes.length; i++) {
            if (alumnes[i]!=null) {
                System.out.println("Nom: "+alumnes[i].getNom()+" DNI: "+alumnes[i].getDni() );
            }
            
        }
    }
    
    public void LlistarProfesorsCurs(){
     for (int i = 0; i < profesors.length; i++) {
            if (profesors[i]!=null) {
                System.out.println("Nom: "+profesors[i].getNom()+" DNI: "+profesors[i].getDni() );
                 }
           }
    }
    
    public void LlistarBecarisCurs(){
     for (int i = 0; i < becaris.length; i++) {
            if (becaris[i]!=null) {
               System.out.println("Nom: "+becaris[i].getNom()+" DNI: "+becaris[i].getDni() );

                 }
           }
    }
  
    public Becari getCorrector(){
        int n_correctors_posibles = 0;
        
          
        
        for (int i = 0; i < becaris.length; i++) {
            if (becaris[i]!=null) {
                n_correctors_posibles++;
                 }
           }
        
        
        
        if (n_correctors_posibles>0) {
            Becari corrector[]= new Becari[n_correctors_posibles];
            
            boolean introduit=false;
            
            for (int i = 0; i < becaris.length; i++) {
            if (becaris[i]!=null) {
                for (int j = 0; j < corrector.length&& !introduit; j++) {
                    if (corrector[j]==null) {
                    corrector[j] =   becaris[i];    
                    introduit=true;
                    }
                     
                }//final for
                introduit=false;
               }//final if
           }
            
            int c =  (int)(Math.random()*n_correctors_posibles);
            
           for (int i = 0; i < becaris.length; i++) {
               if (becaris!=null) {
                   if (becaris[i].equals(corrector[c])) {
                       return becaris[i];
                   }
               }
            }
            return becaris[0];
        }
        return becaris[0];
            
    }
    
    public double getMitja(Alumne alumne){
        
        double notaMitja = 0;
        int notes = 0;
        
        for (int i = 0; i < examens.length; i++) {
            if (examens[i]!=null) {
                for (int j = 0; j < examens[i].getProva().length; j++) {
                    if (examens[i].getProva()[j]!=null) {
                        if (examens[i].getProva()[j].getAlumne().equals(alumne)) {
                        notaMitja = notaMitja + examens[i].getProva()[j].getNota();
                        notes++;
                    }
                    }
                    
                }
            }  
        }
        return notaMitja/notes;
        
    }
    
    public double getNotaMax(){
        
        double NotaMax=0;
        
        
        for (int i = 0; i < this.alumnes.length; i++) {
            
            if (alumnes[i]!=null) {
                if (this.getMitja(alumnes[i])>NotaMax) {
                 NotaMax = this.getMitja(alumnes[i]);
            }
        }
    
        }
        return NotaMax;
        
    }
    
    public double getNotaMin(){
        
         double NotaMin=10;
        
        
        for (int i = 0; i < this.alumnes.length; i++) {
            
            if (alumnes[i]!=null) {
                if (this.getMitja(alumnes[i])<NotaMin) {
                 NotaMin = this.getMitja(alumnes[i]);
            }
        }
    
        }
        return NotaMin;
        
        
    }
    
    public void getLlistarMitjes(){
        
           for (int i = 0; i < examens.length; i++) {
            if (examens[i]!=null) {
                System.out.println("Mitja Examen del "+(examens[i].getTrimestre()+1)+ " Trimesre = "+examens[i].getNotaMitja());
            }
           }
    }
    
    public double getNotaMitja(){
        
        double notaMitja=0;
        int cantExamens=0;
        
        for (int i = 0; i < examens.length; i++) {
            if (examens[i]!=null) {
                
                 notaMitja= notaMitja + examens[i].getNotaMitja();
                 cantExamens++;
            }
        }

        return notaMitja/cantExamens;
    }
    
    public Alumne[] getAprovats(){
    
        Alumne[] aprobats = new Alumne[alumnes.length];
        boolean introduit = false;
        
        for (int i = 0; i < this.alumnes.length; i++) {
            
            if (alumnes[i]!=null) {
                if (this.getMitja(alumnes[i])>=5) {
                    for (int j = 0; j < alumnes.length&&!introduit; j++) {
                        if (aprobats[j]==null) {
                            aprobats[j]=alumnes[i];
                            introduit=true;
                        }              
                    }
                    introduit=false;
                }
            }
        }
    
        return aprobats;
    }
    
    
    public Alumne[]  getSuspesos(){
        Alumne[] suspesos = new Alumne[alumnes.length];
        boolean introduit = false;
        
        for (int i = 0; i < this.alumnes.length; i++) {
            
            if (alumnes[i]!=null) {
                if (this.getMitja(alumnes[i])<5) {
                    for (int j = 0; j < alumnes.length&&!introduit; j++) {
                        if (suspesos[j]==null) {
                            suspesos[j]=alumnes[i];
                            introduit=true;
                        }              
                    }
                    introduit=false;
                }
            }
        }
    
        return suspesos;
    } 

    public Becari[] getBecaris() {
        return becaris;
    }

    public void setBecaris(Becari[] becaris) {
        this.becaris = becaris;
    }

    public void addExamen(Examen ex ,int trimestre){
    
        examens[trimestre]=ex;
    
    }
    
    public String getNom() {
        return nom;
    }
    
    public int getAny() {
        return any;
    }

    public Alumne[] getAlumnes() {
        return alumnes;
    }

    public void setAlumnes(Alumne[] alumnes) {
        this.alumnes = alumnes;
    }

    public Profesor[] getProfesors() {
        return profesors;
    }

    public void setProfesors(Profesor[] profesors) {
        this.profesors = profesors;
    }
    
    public Examen[] getExamens() {
        return examens;
    }
    
}
