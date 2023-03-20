package prueba.sistema.nomina;
// La clase EmpleadoPorComision que extiende a Empleado.

import javax.swing.JOptionPane;

public class EmpleadoPorComision extends Empleado {
   protected int ventasTotales;      // ventas totales por semana
   protected int tasaComision;  // porcentaje de comisi�n

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

      setTasaComision( this.tasaComision );
      setVentasTotales( this.ventasTotales );      
   } 

   public void setTasaComision( int tasa )
   {
      tasaComision = ( tasa > 0 ) ? tasa : 0;
   } 

   public double getTasaComision()
   {
      return tasaComision;
   } 

   public void setVentasTotales( int ventas )
   {
      ventasTotales = (ventas < 0) ? 0 : ventas; //&& tasa < 1.0 
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