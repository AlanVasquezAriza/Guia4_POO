package TuNominaYa;
// La clase EmpleadoPorComision que extiende a Empleado.

public class EmpleadoPorComision extends Empleado {
   private double ventasTotales;      // ventas totales por semana
   private double tasaComision;  // porcentaje de comisión

   // constructor
   public EmpleadoPorComision( String nombre, String apellido, 
      String numeroSeguroSocial, 
      double ventasTotalesSemana, double porcentaje )
   {
      super( nombre, apellido, numeroSeguroSocial );
      establecerVentasTotales( ventasTotalesSemana );
      establecerTasaComision( porcentaje );
   } 

   // establecer la tasa de comisión del empleado
   public void establecerTasaComision( double tasa )
   {
      tasaComision = ( tasa > 0.0 && tasa < 1.0 ) ? tasa : 0.0;
   } 

   // devolver la tasa de comisión del empleado
   public double obtenerTasaComision()
   {
      return tasaComision;
   } 

   // establecer salario base semanal del empleado por comisión
   public void establecerVentasTotales( double ventas )
   {
      ventasTotales = ventas < 0.0 ? 0.0 : ventas;
   } 

   // devolver cantidad de ventas totales del empleado por comisión
   public double obtenerVentasTotales()
   {
      return ventasTotales;
   } 

   // calcular pago del empleado por comisión;
   // sobrescribir el método abstracto ingresos en Empleado
   public double ingresos()
   {
      return obtenerTasaComision() * obtenerVentasTotales();
   } 

   // devolver la representación String del objeto EmpleadoPorComision
   public String toString()
   {
      return "\nempleado por comisión: " + super.toString();
   } 
   
} // fin de la clase EmpleadoPorComision

