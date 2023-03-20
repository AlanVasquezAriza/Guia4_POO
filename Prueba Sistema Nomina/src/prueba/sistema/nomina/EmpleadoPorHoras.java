package prueba.sistema.nomina;
// La clase EmpleadoPorHoras que extiende a Empleado.

import javax.swing.JOptionPane;

public class EmpleadoPorHoras extends Empleado {
   private double sueldoPorHora;   // sueldoPorHora por hora
   private double horas;  // horas trabajadas en la semana

   // constructor
   public EmpleadoPorHoras()
   {
      super();
      
      // Valida que el numero no contenga caracteres diferentes a los numericos
      for(int i = 0; i < 1; i++){
         String salarioHoraString = JOptionPane.showInputDialog(null, "Salario por hora");
         if(salarioHoraString != null && salarioHoraString.matches("[0-9]+")){
            this.sueldoPorHora = Integer.parseInt(salarioHoraString);
            break;
         }
         JOptionPane.showMessageDialog(null, "Valor invalido, ingreselo nuevamente");
         i--;
         continue;
      }


      // Valida que el numero no contenga caracteres diferentes a los numericos
      for(int i = 0; i < 1; i++){
         String horasString = JOptionPane.showInputDialog(null, "Horas trabajadas"); 
         if(horasString != null && horasString.matches("[0-9]+")){
            this.horas = Integer.parseInt(horasString);
            break;
         }
         JOptionPane.showMessageDialog(null, "Valor invalido, ingreselo nuevamente");
         i--;
         continue;
      }


      setSueldo( this.sueldoPorHora );
      setHoras( this.horas );
   } 

   // establecer sueldoPorHora de empleado por horas
   public void setSueldo( double cantidadSueldo )
   {
      sueldoPorHora = cantidadSueldo < 0.0 ? 0.0 : cantidadSueldo;
   } 

   // devolver sueldoPorHora
   public double getSueldo()
   {
      return sueldoPorHora;
   } 

   // establecer horas trabajadas del empleado por horas
   public void setHoras( double horasTrabajadas )
   {
      horas = ( horasTrabajadas >= 0.0 && horasTrabajadas <= 168.0 ) ?
         horasTrabajadas : 0.0;
   } 

   // devolver horas trabajadas
   public double getHoras()
   {
      return horas;
   } 

   // calcular pago del empleado por horas;
   // sobrescribir el m�todo abstracto ingresos en Empleado
   @Override
   public double ingresos()
   {
      if ( horas <= 40 )  // sin tiempo extra
         return sueldoPorHora * horas;
      else
         return 40 * sueldoPorHora + ( horas - 40 ) * sueldoPorHora * 1.5;
   } 

   // devolver la representaci�n String del objeto EmpleadoPorHoras
   @Override
   public String toString()
   {
      return "\nEmpleado por horas: " + super.toString();
   } 
   
} // fin de la clase EmpleadoPorHoras