package pruebasistemanomina;
// La clase EmpleadoPorComision que extiende a Empleado.

import javax.swing.JOptionPane;

public class EmpleadoPorComision extends Empleado {
   protected double ventasTotales;      // ventas totales por semana
   protected double tasaComision;  // porcentaje de comisi�n

   // constructor
   public EmpleadoPorComision()
   {
      super();
      String ventasTotalesString = JOptionPane.showInputDialog(null,"Ventas totales");
      this.ventasTotales = Integer.parseInt(ventasTotalesString);
      String tasaComisioneString = JOptionPane.showInputDialog(null, "Porcentaje comision");
      this.tasaComision = Integer.parseInt(tasaComisioneString);
      setVentasTotales( this.ventasTotales );
      setTasaComision( this.tasaComision );
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

