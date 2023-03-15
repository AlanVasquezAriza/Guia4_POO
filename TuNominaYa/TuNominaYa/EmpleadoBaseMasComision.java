package TuNominaYa;
// La clase EmpleadoBaseMasComision que extiende a EmpleadoPorComision.

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
   private double salarioBase;  // salario base por semana

   // constructor
   public EmpleadoBaseMasComision( String nombre, String apellido, 
      String numeroSeguroSocial, double cantidadVentasTotales,
      double tasa, double cantidadSalarioBase )
   {
      super( nombre, apellido, numeroSeguroSocial, cantidadVentasTotales, tasa );
      establecerSalarioBase( cantidadSalarioBase );
   } 

   // establecer el salario base del empleado con salario base más comisión
   public void establecerSalarioBase( double salario )
   {
      salarioBase = salario < 0.0 ? 0.0 : salario;
   } 

   // devolver el salario base del empleado con salario base más comisión
   public double obtenerSalarioBase()
   {
      return salarioBase;
   } 

   // calcular los ingresos del empleado con salario base más comisión;
   // sobrescribir el método ingresos en EmpleadoPorComision
   public double ingresos()
   {
      return obtenerSalarioBase() + super.ingresos();
   } 

   // devolver la representación String de EmpleadoBaseMasComision
   public String toString()
   {
      return "\nempleado con salario base más comisión: " +
         super.obtenerPrimerNombre() + " " + super.obtenerApellidoPaterno() +
         "\nnúmero de seguro social: " + super.obtenerNumeroSeguroSocial();
   } 
   
} // fin de la clase EmpleadoBaseMasComision

