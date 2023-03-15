package TuNominaYa;
// Programa de prueba de la jerarquía Empleado.
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class PruebaSistemaNomina {

   public static void main( String[] args ) 
   {
      DecimalFormat dosDigitos = new DecimalFormat( "0.00" );

      // crear arreglo tipo Empleado
      Empleado empleados[] = new Empleado[ 4 ];

      // inicializar arreglo con Empleados
      empleados[ 0 ] = new EmpleadoAsalariado( "Juan", "Pérez", 
         "111-11-1111", 800.00 );
      empleados[ 1 ] = new EmpleadoPorComision( "Arlae", "Razón", 
         "222-22-2222", 10000, .06 );
      empleados[ 2 ] = new EmpleadoBaseMasComision( "Alfonso", "Romero", 
         "333-33-3333", 5000, .04, 300 );
      empleados[ 3 ] = new EmpleadoPorHoras( "Isabel", "Romero", 
         "444-44-4444", 16.75, 40 );

      String salida = "";

      // procesar genéricamente cada elemento en el arreglo empleados
      for ( int i = 0; i < empleados.length; i++ ) {
         salida += empleados[ i ].toString();

         // determinar si el elemento es un EmpleadoBaseMasComision
         if ( empleados[ i ] instanceof EmpleadoBaseMasComision ) {

            // conversión descendente de referencia a Empleado a 
            // referencia a EmpleadoBaseMasComision
            EmpleadoBaseMasComision empleadoActual = 
               ( EmpleadoBaseMasComision ) empleados[ i ];

            double salarioBaseAnterior = empleadoActual.obtenerSalarioBase();
            salida += "\nsalario base anterior: $" + salarioBaseAnterior;      
            
            empleadoActual.establecerSalarioBase( 1.10 * salarioBaseAnterior );
            salida += "\nel nuevo salario base con aumento del 10% es: $" +
               empleadoActual.obtenerSalarioBase();

         } // fin de instrucción if

         salida += "\nganó $" + empleados[ i ].ingresos() + "\n";

      } // fin de instrucción for

      // obtener nombre del tipo de cada objeto en el arreglo empleados
      for ( int j = 0; j < empleados.length; j++ )
         salida += "\nEl empleado " + j + " es un " +
            empleados[ j ].getClass().getName(); 

      JOptionPane.showMessageDialog( null, salida );  // mostrar resultados
      System.exit( 0 );

   } // fin de main

} // fin de la clase PruebaSistemaNomina
