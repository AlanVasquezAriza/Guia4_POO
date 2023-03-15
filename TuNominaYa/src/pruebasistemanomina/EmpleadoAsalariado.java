package pruebasistemanomina;

public class EmpleadoAsalariado extends Empleado {
   public double salarioSemanal;

   // constructor
   public EmpleadoAsalariado( String nombre, String apellido, 
      String numeroSeguroSocial, double salario )
   {
      super( nombre, apellido, numeroSeguroSocial ); 
      setSalarioSemanal( salario );
   } 

   // establecer el salario del empleado asalariado
   public void setSalarioSemanal( double salario )
   {
      salarioSemanal = salario < 0.0 ? 0.0 : salario;
   } 

   // devolver el salario del empleado asalariado
   public double getSalarioSemanal()
   {
      return salarioSemanal;
   } 

   // calcular el pago del empleado asalariado;
   // sobrescribir el m�todo abstracto ingresos en Empleado
   @Override
   public double ingresos()
   {
      return getSalarioSemanal();
   } 

   // devolver la representaci�n String del objeto EmpleadoAsalariado
   @Override
   public String toString()
   {
      return "\nEmpleado asalariado: " + super.toString();
   } 
   
} // fin de la clase EmpleadoAsalariado