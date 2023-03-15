package pruebasistemanomina;
// La clase EmpleadoPorComision que extiende a Empleado.

public class EmpleadoPorComision extends Empleado {
   protected double ventasTotales;      // ventas totales por semana
   protected double tasaComision;  // porcentaje de comisi�n

   // constructor
   public EmpleadoPorComision( String nombre, String apellido, 
      String numeroSeguroSocial, 
      double ventasTotalesSemana, double porcentaje )
   {
      super( nombre, apellido, numeroSeguroSocial );
      setVentasTotales( ventasTotalesSemana );
      setTasaComision( porcentaje );
   } 

   public void setTasaComision( double tasa )
   {
      tasaComision = ( tasa > 0.0 && tasa < 1.0 ) ? tasa : 0.0;
   } 

   public double getTasaComision()
   {
      return tasaComision;
   } 

   public void setVentasTotales( double ventas )
   {
      ventasTotales = ventas < 0.0 ? 0.0 : ventas;
   } 

   public double getVentasTotales()
   {
      return ventasTotales;
   } 

   // calcular pago del empleado por comisi�n;
   // sobrescribir el m�todo abstracto ingresos en Empleado
   @Override
   public double ingresos()
   {
      return getTasaComision() * getVentasTotales();
   } 

   // devolver la representaci�n String del objeto EmpleadoPorComision
   @Override
   public String toString()
   {
      return "\nEmpleado por comision: " + super.toString();
   } 
   
}

