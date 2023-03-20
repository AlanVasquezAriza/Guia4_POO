package pruebasistemanomina;

import javax.swing.JOptionPane;

public class PruebaSistemaNomina {

   public static void main( String[] args ){       
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
    }// 

      JOptionPane.showMessageDialog( null, salida );
      
      String delUser = JOptionPane.showInputDialog(null,"¿Quiere eliminar algun usuario?");
      
      if(delUser.equals("Si")){
        String delUserNumString = JOptionPane.showInputDialog(null,"Que usuario \n 1. Empleado Asalariado \n2. Empleado por Comision \n"
                + "3. Empleado base mas comision \n4. Empleado por horas");
        int delUserNum = Integer.parseInt(delUserNumString);

        switch(delUserNum){
            case 1:
                //Elimina empleado 1
                empleados[ 0 ] = null;
                break;
            case 2:
                //Elimina empleado 2
                empleados[ 1 ] = null;
                break;
            case 3:
                //Elimina empleado 3
                empleados[ 2 ] = null;
                break;
            case 4:
                //Elimina empleado 4
                empleados[ 3 ] = null;
                break;    
        }
          System.out.println("Se elmimino el empleado " + delUserNum);  
          System.out.println("Informacion actualizada: ");
          String salida1 = "";

        for ( int i = 0; i < empleados.length; i++ ) {
            
            if(empleados[i]==null){
                continue;
            }
            
            salida1 += empleados[ i ].toString();

            if ( empleados[ i ] instanceof EmpleadoBaseMasComision ) {
        
               EmpleadoBaseMasComision empleadoActual = ( EmpleadoBaseMasComision ) empleados[ i ];

               double salarioBaseAnterior = empleadoActual.getSalarioBase();
               salida1 += "\nSalario base anterior: $" + salarioBaseAnterior;      

               empleadoActual.setSalarioBase( 1.10 * salarioBaseAnterior );

               salida1 += "\nEl nuevo salario base con aumento del 10% es: $" +
                  empleadoActual.getSalarioBase();

            }
            salida1 += "\nIngresos $" + empleados[ i ].ingresos() + "\n";
        }
        JOptionPane.showMessageDialog( null, salida1 );
   
      }
      else{
          System.out.println("No se ha eliminado ningun empleado");
          System.out.println();
      }
   }
}
