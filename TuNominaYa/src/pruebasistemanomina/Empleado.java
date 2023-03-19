package pruebasistemanomina;
import javax.swing.JOptionPane;
// La superclase abstracta Empleado.

public abstract class Empleado {
   protected String primerNombre;
   protected String apellidoPaterno;
   protected String numeroSeguroSocial;
   protected double salario;

   // constructor
   public Empleado()
   {
      this.primerNombre = JOptionPane.showInputDialog(null, "Nombre: ");
      this.apellidoPaterno = JOptionPane.showInputDialog(null, "Apellido Paterno: ");
      this.numeroSeguroSocial = JOptionPane.showInputDialog(null, "Numero seguro social");
      String salarioString = JOptionPane.showInputDialog(null, "Salario");
      this.salario = Integer.parseInt(salarioString);
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
   public void setNumeroSeguroSocial( String numero )
   {
      numeroSeguroSocial = numero;  // deberia validarse
   } 

   // devolver el numero de seguro social
   public String getNumeroSeguroSocial()
   {
      return numeroSeguroSocial;
   } 

   // devolver representacion String del objeto Empleado
   public String toString()
   {
      return getPrimerNombre() + " " + getApellidoPaterno() +
         "\nNumero de seguro social: " + getNumeroSeguroSocial();
   } 

   // m�todo abstracto sobrescrito por las subclases
   public abstract double ingresos();
   
}

