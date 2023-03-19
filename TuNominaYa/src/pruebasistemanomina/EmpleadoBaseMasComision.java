package pruebasistemanomina;
// La clase EmpleadoBaseMasComision que extiende a EmpleadoPorComision.

import javax.swing.JOptionPane;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
   public double salarioBase;  // salario base por semana

   // constructor
   public EmpleadoBaseMasComision()
   {
      super();

      // Valida que el numero no contenga caracteres diferentes a los numericos
      for(int i = 0; i < 1; i++){
         String salarioBaseString = JOptionPane.showInputDialog(null,"salario Base");
         if(salarioBaseString != null && salarioBaseString.matches("[0-9]+")){
            this.salarioBase = Integer.parseInt(salarioBaseString);
            break;
         }
         JOptionPane.showMessageDialog(null, "Valor invalido, ingreselo nuevamente");
         i--;
         continue;
      }
      

      setSalarioBase(this.salarioBase);
   } 

   // establecer el salario base del empleado con salario base mas comision
   public void setSalarioBase( double salario )
   {
      salarioBase = salario < 0.0 ? 0.0 : salario;
   } 

   // devolver el salario base del empleado con salario base mas comision
   public double getSalarioBase()
   {
      return salarioBase;
   } 

   // calcular los ingresos del empleado con salario base m�s comisi�n;
   // sobrescribir el m�todo ingresos en EmpleadoPorComision
   public double ingresos()
   {
      return getSalarioBase() + super.ingresos();
   } 

   // devolver la representaci�n String de EmpleadoBaseMasComision
   public String toString()
   {
      return "\nEmpleado con salario base mas comision: " +
         super.getPrimerNombre() + " " + super.getApellidoPaterno() +
         "\nNumero de seguro social: " + super.getNumeroSeguroSocial();
   } 
   
} // fin de la clase EmpleadoBaseMasComision

