package pruebasistemanomina;
// La clase EmpleadoBaseMasComision que extiende a EmpleadoPorComision.

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
   public double salarioBase;  // salario base por semana

   // constructor
   public EmpleadoBaseMasComision( String nombre, String apellido, 
      String numeroSeguroSocial, double cantidadVentasTotales,
      double tasa, double cantidadSalarioBase )
   {
      super( nombre, apellido, numeroSeguroSocial, cantidadVentasTotales, tasa );
      setSalarioBase( cantidadSalarioBase );
   } 

   // establecer el salario base del empleado con salario base mas comision
   public void setSalarioBase( double salario )
   {
      salarioBase = salario < 0.0 ? 0.0 : salario;
   } 

   // devolver el salario base del empleado con salario base mas comision
   public double getSalarioBase()
   {
      return salarioBase;
   } 

   // calcular los ingresos del empleado con salario base m�s comisi�n;
   // sobrescribir el m�todo ingresos en EmpleadoPorComision
   public double ingresos()
   {
      return getSalarioBase() + super.ingresos();
   } 

   // devolver la representaci�n String de EmpleadoBaseMasComision
   public String toString()
   {
      return "\nEmpleado con salario base mas comision: " +
         super.getPrimerNombre() + " " + super.getApellidoPaterno() +
         "\nNumero de seguro social: " + super.getNumeroSeguroSocial();
   } 
   
} // fin de la clase EmpleadoBaseMasComision

