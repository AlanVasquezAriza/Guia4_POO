package prueba.sistema.nomina;
import javax.swing.JOptionPane;
// La superclase abstracta Empleado.

public abstract class Empleado {
   protected String primerNombre;
   protected String apellidoPaterno;
   protected int numeroSeguroSocial;
   protected double salario;

   // constructor
   public Empleado()
   {
      this.primerNombre = JOptionPane.showInputDialog(null, "Nombre: ");
      this.apellidoPaterno = JOptionPane.showInputDialog(null, "Apellido Paterno: ");

      // Valida que el numero no contenga caracteres diferentes a los numericos
      for(int i = 0; i < 1; i++){
         String numeroSeguroSocialString =  JOptionPane.showInputDialog(null, "Numero seguro social");
         if(numeroSeguroSocialString != null && numeroSeguroSocialString.matches("[0-9]+")){
            this.numeroSeguroSocial = Integer.parseInt(numeroSeguroSocialString);
            break;
         }
         JOptionPane.showMessageDialog(null, "Valor invalido, ingreselo nuevamente");
         i--;
         continue;
      }

      // Valida que el numero no contenga caracteres diferentes a los numericos
      for(int i = 0; i < 1; i ++){
         String salarioString = JOptionPane.showInputDialog(null, "Salario");
         if(salarioString != null && salarioString.matches("[0-9]+")){
            this.salario = Integer.parseInt(salarioString);
            break;
         }
         JOptionPane.showMessageDialog(null, "Valor invalido, ingreselo nuevamente");
         i--;
         continue;
      }
   } 

   public void setPrimerNombre( String nombre )
   {
      primerNombre = nombre;
   } 

   public String getPrimerNombre()
   {
      return primerNombre;
   } 

   public void setApellidoPaterno( String apellido )
   {
      apellidoPaterno = apellido;
   } 

   public String getApellidoPaterno()
   {
      return apellidoPaterno;
   } 

   // establecer el numero de seguro social
   public void setNumeroSeguroSocial( int numero )
   {
      numeroSeguroSocial = numero;  // deberia validarse
   } 

   // devolver el numero de seguro social
   public double getNumeroSeguroSocial()
   {
      return this.numeroSeguroSocial;
   } 

   // devolver representacion String del objeto Empleado
   public String toString()
   {
      return getPrimerNombre() + " " + getApellidoPaterno() +
         "\nNumero de seguro social: " + getNumeroSeguroSocial();
   } 

   // metodo abstracto sobrescrito por las subclases
   public abstract double ingresos();
   
}