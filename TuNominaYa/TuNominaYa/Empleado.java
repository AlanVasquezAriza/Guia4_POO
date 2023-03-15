package TuNominaYa;
// La superclase abstracta Empleado.

public abstract class Empleado {
   private String primerNombre;
   private String apellidoPaterno;
   private String numeroSeguroSocial;

   // constructor
   public Empleado( String nombre, String apellido, String ssn )
   {
      primerNombre = nombre;
      apellidoPaterno = apellido;
      numeroSeguroSocial = ssn;
   } 

   // establecer el primer nombre
   public void establecerPrimerNombre( String nombre )
   {
      primerNombre = nombre;
   } 

   // devolver el primer nombre
   public String obtenerPrimerNombre()
   {
      return primerNombre;
   } 

   // establecer el apellido
   public void establecerApellidoPaterno( String apellido )
   {
      apellidoPaterno = apellido;
   } 

   // devolver el apellido
   public String obtenerApellidoPaterno()
   {
      return apellidoPaterno;
   } 

   // establecer el número de seguro social
   public void establecerNumeroSeguroSocial( String numero )
   {
      numeroSeguroSocial = numero;  // debería validarse
   } 

   // devolver el número de seguro social
   public String obtenerNumeroSeguroSocial()
   {
      return numeroSeguroSocial;
   } 

   // devolver representación String del objeto Empleado
   public String toString()
   {
      return obtenerPrimerNombre() + " " + obtenerApellidoPaterno() +
         "\nnúmero de seguro social: " + obtenerNumeroSeguroSocial();
   } 

   // método abstracto sobrescrito por las subclases
   public abstract double ingresos();
   
} // fin de la clase abstracta Empleado

