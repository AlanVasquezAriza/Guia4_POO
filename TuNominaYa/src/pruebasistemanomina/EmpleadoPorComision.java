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

      // Valida que el numero no contenga caracteres diferentes a los numericos
      for(int i = 0; i < 1; i++){
         String ventasTotalesString = JOptionPane.showInputDialog(null,"Ventas totales");
         if(ventasTotalesString != null && ventasTotalesString.matches("[0-9]+")){
            this.ventasTotales = Integer.parseInt(ventasTotalesString);
            break;
         }
         JOptionPane.showMessageDialog(null, "Valor invalido, ingreselo nuevamente");
         i--;
         continue;
      }

      // Valida que el numero no contenga caracteres diferentes a los numericos
      for(int i = 0; i < 1; i++){
         String tasaComisioneString = JOptionPane.showInputDialog(null, "Porcentaje comision");
         if(tasaComisioneString != null && tasaComisioneString.matches("[0-9]+")){
            this.tasaComision = Integer.parseInt(tasaComisioneString);
            break;
         }
         JOptionPane.showMessageDialog(null, "Valor invalido, ingreselo nuevamente");
         i--;
         continue;
      }

      setVentasTotales( this.ventasTotales );
      setTasaComision( this.tasaComision );
   } 

   public void setTasaComision( double tasa )
   {
      tasaComision = ( tasa > 0.0 ) ? tasa : 0.0;
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

