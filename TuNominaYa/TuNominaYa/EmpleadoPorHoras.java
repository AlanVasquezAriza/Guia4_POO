package TuNominaYa;
// La clase EmpleadoPorHoras que extiende a Empleado.

public class EmpleadoPorHoras extends Empleado {
   private double sueldo;   // sueldo por hora
   private double horas;  // horas trabajadas en la semana

   // constructor
   public EmpleadoPorHoras( String nombre, String apellido, 
      String numeroSeguroSocial, double sueldoPorHora, double horasTrabajadas )
   {
      super( nombre, apellido, numeroSeguroSocial );
      establecerSueldo( sueldoPorHora );
      establecerHoras( horasTrabajadas );
   } 

   // establecer sueldo de empleado por horas
   public void establecerSueldo( double cantidadSueldo )
   {
      sueldo = cantidadSueldo < 0.0 ? 0.0 : cantidadSueldo;
   } 

   // devolver sueldo
   public double obtenerSueldo()
   {
      return sueldo;
   } 

   // establecer horas trabajadas del empleado por horas
   public void establecerHoras( double horasTrabajadas )
   {
      horas = ( horasTrabajadas >= 0.0 && horasTrabajadas <= 168.0 ) ?
         horasTrabajadas : 0.0;
   } 

   // devolver horas trabajadas
   public double obtenerHoras()
   {
      return horas;
   } 

   // calcular pago del empleado por horas;
   // sobrescribir el método abstracto ingresos en Empleado
   public double ingresos()
   {
      if ( horas <= 40 )  // sin tiempo extra
         return sueldo * horas;
      else
         return 40 * sueldo + ( horas - 40 ) * sueldo * 1.5;
   } 

   // devolver la representación String del objeto EmpleadoPorHoras
   public String toString()
   {
      return "\nempleado por horas: " + super.toString();
   } 
   
} // fin de la clase EmpleadoPorHoras
