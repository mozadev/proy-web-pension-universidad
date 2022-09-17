
package Modelo;


public class CategorizacionGeneral {
    int categoria;
    int tipoalumno;
    double promedio;
    
    public int calcularPension(Alumno objAlumno){
        
        
        int pension=0;
        if("A".equals(objAlumno.categoria) && "INTERNO".equals(objAlumno.tipoalumno)){
            pension=600;
        }
        
         if("A".equals(objAlumno.categoria) && "EXTERNO".equals(objAlumno.tipoalumno)){
            pension=550;
        }
        
         
          if("B".equals(objAlumno.categoria) && "INTERNO".equals(objAlumno.tipoalumno)){
            pension=550;
        }
        
           if("B".equals(objAlumno.categoria) && "EXTERNO".equals(objAlumno.tipoalumno)){
            pension=500;
        }
           
              if("C".equals(objAlumno.categoria) && "INTERNO".equals(objAlumno.tipoalumno)){
            pension=500;
        }
        
           if("C".equals(objAlumno.categoria) && "EXTERNO".equals(objAlumno.tipoalumno)){
            pension=460;
        }
           
        
              if("D".equals(objAlumno.categoria) && "INTERNO".equals(objAlumno.tipoalumno)){
            pension=450;
        }
        
           if("D".equals(objAlumno.categoria) && "EXTERNO".equals(objAlumno.tipoalumno)){
            pension=400;
        }
        
        
        return pension;
    }
    
        public double calcularDescuento(Alumno objAlumno){
             double descuento=0;
            if(objAlumno.promedio>=0 && objAlumno.promedio<=13.99){
                descuento=0;
            }
              if(objAlumno.promedio>=14 && objAlumno.promedio<=15.99){
                descuento=0.1;
            }
                if(objAlumno.promedio>=16 && objAlumno.promedio<=17.99){
                descuento=0.12;
            }
                  if(objAlumno.promedio>=18 && objAlumno.promedio<=20){
                descuento=0.15;
            }
       
        return descuento;
    }
        
         public double calcularNuevaPension(Alumno objAlumno){
        
        double nuevaPension=0;
        nuevaPension=calcularPension(objAlumno)*(1-calcularDescuento(objAlumno));
        return nuevaPension;
    }
    
}
