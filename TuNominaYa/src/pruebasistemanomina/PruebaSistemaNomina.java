package pruebasistemanomina;
// Programa de prueba de la jerarqu�a Empleado.
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class PruebaSistemaNomina {

   public static void main( String[] args ) 
   {
      // crear arreglo tipo Empleado
      Empleado empleados[] = new Empleado[ 4 ];

      // inicializar arreglo con Empleados
      empleados[ 0 ] = new EmpleadoAsalariado( "Juan", "P�rez", "111-11-1111", 800.00 );
      empleados[ 1 ] = new EmpleadoPorComision( "Arlae", "Raz�n", "222-22-2222", 10000, .06 );
      empleados[ 2 ] = new EmpleadoBaseMasComision( "Alfonso", "Romero", "333-33-3333", 5000, .04, 300 );
      empleados[ 3 ] = new EmpleadoPorHoras( "Isabel", "Romero", "444-44-4444", 16.75, 40 );

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

      // obtener nombre del tipo de cada objeto en el arreglo empleados
//      for ( int j = 0; j < empleados.length; j++ )
//        salida += "\nEl empleado " + j + " es un " + empleados[ j ].getClass().getName(); 

      JOptionPane.showMessageDialog( null, salida );


   }

}
