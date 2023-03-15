package TuNominaYa;

// La clase EmpleadoAsalariado que extiende a Empleado.

public class EmpleadoAsalariado extends Empleado {
   private double salarioSemanal;

   // constructor
   public EmpleadoAsalariado( String nombre, String apellido, 
      String numeroSeguroSocial, double salario )
   {
      super( nombre, apellido, numeroSeguroSocial ); 
      establecerSalarioSemanal( salario );
   } 

   // establecer el salario del empleado asalariado
   public void establecerSalarioSemanal( double salario )
   {
      salarioSemanal = salario < 0.0 ? 0.0 : salario;
   } 

   // devolver el salario del empleado asalariado
   public double obtenerSalarioSemanal()
   {
      return salarioSemanal;
   } 

   // calcular el pago del empleado asalariado;
   // sobrescribir el método abstracto ingresos en Empleado
   public double ingresos()
   {
      return obtenerSalarioSemanal();
   } 

   // devolver la representación String del objeto EmpleadoAsalariado
   public String toString()
   {
      return "\nempleado asalariado: " + super.toString();
   } 
   
} // fin de la clase EmpleadoAsalariado