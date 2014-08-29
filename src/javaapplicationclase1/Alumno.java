/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplicationclase1;

/**
 *
 * @authora: Luisa Holguin
 */
public class Alumno 
{
    //
    private Integer Id;
    private String Cedula;
    private String Nombre;
    private String Direccion;
    private String Telefono;

    public Integer getId() 
    {
        return Id;
    }
    public void setId(Integer Id) 
    {
        this.Id = Id;
    }

    public String getCedula() 
    {
        return Cedula;
    }
    public void setCedula(String Cedula) 
    {
        
        this.Cedula = Cedula;
    }

    public String getNombre() 
    {
        return Nombre;
    }
    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public String getDireccion() 
    {
        return Direccion;
    }
    public void setDireccion(String Direccion) 
    {
        this.Direccion = Direccion;
    }
    
    public String getTelefono() 
    {
        return Telefono;
    }
    public void setTelefono(String Telefono) 
    {
        this.Telefono = Telefono;
    }

    public Alumno(Integer Id, String Cedula, String Nombre, String Direccion, String Telefono) 
    {
        this.Id = Id;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }
}
