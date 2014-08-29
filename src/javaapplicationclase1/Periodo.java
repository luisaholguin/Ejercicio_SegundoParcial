/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplicationclase1;

import java.util.Date;

/**
 *
 * @authora: Luisa Holguin
 */
public class Periodo 
{
 
    private int Id;
    private String Descripcion;
    private Date Inicio;
    private Date Fin;

    public int getId() 
    {
        return Id;
    }
    public void setId(int Id) 
    {
        this.Id = Id;
    }
     
    public String getDescripcion() 
    {
        return Descripcion;
    }
    public void setDescripcion(String Descripcion)
    {
        this.Descripcion = Descripcion;
    }

    public Date getInicio() 
    {
        return Inicio;
    }
    public void setInicio(Date Inicio)
    {
        this.Inicio = Inicio;
    }

    public Date getFin() 
    {
        return Fin;
    }
    public void setFin(Date Fin) 
    {
        this.Fin = Fin;
    }

    public Periodo(int Id, String Descripcion, Date Inicio, Date Fin) 
    {
        this.Id = Id;
        this.Descripcion = Descripcion;
        this.Inicio = Inicio;
        this.Fin = Fin;
    }
}
