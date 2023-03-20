package pruebasistemanomina;
// Programa de prueba de la jerarqu�a Empleado.
import javax.swing.JOptionPane;

public class PruebaSistemaNomina {

   public static void main( String[] args ) 
   {
      // crear arreglo tipo Empleado
      Empleado empleados[] = new Empleado[ 4 ];

      // inicializar arreglo con Empleados

      JOptionPane.showMessageDialog(null, "Empleado Asalariado");
      empleados[ 0 ] = new EmpleadoAsalariado();

      JOptionPane.showMessageDialog(null, "Empleado Por Comision");
      empleados[ 1 ] = new EmpleadoPorComision();

      JOptionPane.showMessageDialog(null, "Empleado Base Mas Comision");
      empleados[ 2 ] = new EmpleadoBaseMasComision();

      JOptionPane.showMessageDialog(null, "Empleado Por Horas");
      empleados[ 3 ] = new EmpleadoPorHoras();

      String salida = "";

      // procesar genericamente cada elemento en el arreglo empleados
      for ( int i = 0; i < empleados.length; i++ ) {
         salida += empleados[ i ].toString();

         // determinar si el elemento es un EmpleadoBaseMasComision
         if ( empleados[ i ] instanceof EmpleadoBaseMasComision ) {

            // conversi�n descendente de referencia a Empleado a referencia a EmpleadoBaseMasComision           
            EmpleadoBaseMasComision empleadoActual = ( EmpleadoBaseMasComision ) empleados[ i ];

            double salarioBaseAnterior = empleadoActual.getSalarioBase();
            salida += "\nSalario base anterior: $" + salarioBaseAnterior;      
            
            empleadoActual.setSalarioBase( 1.10 * salarioBaseAnterior );
            salida += "\nEl nuevo salario base con aumento del 10% es: $" +
               empleadoActual.getSalarioBase();

         }
         salida += "\nIngresos $" + empleados[ i ].ingresos() + "\n";
      } 

      JOptionPane.showMessageDialog( null, salida );


      System.out.println("Hello world");
   }

}
