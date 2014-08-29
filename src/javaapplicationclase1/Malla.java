/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplicationclase1;

import java.util.Date;
import java.util.List;

/**
 *
 * @authora: Luisa Holguin
 */
public class Malla 
{
 
       private int Id;
       private String Descripcion;
       private Date Hasta;
       private Date Desde;

   
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

    public Date getDesde() 
    {
        return Desde;
    }
    public void setDesde(Date Desde) 
    {
        this.Desde = Desde;
    }
    
    public Date getHasta() 
    {
        return Hasta;
    }
    public void setHasta(Date Hasta) 
    {
        this.Hasta = Hasta;
    }

    public Malla(int Id, String Descripcion, Date Desde, Date Hasta) 
    {
        this.Id = Id;
        this.Descripcion = Descripcion;
        this.Desde = Desde;
        this.Hasta = Hasta;
    }
    
    private List<Nivel> listaNivel;

    public List<Nivel> getListaNivel() {
        return listaNivel;
    }

    public void setListaNivel(List<Nivel> listaNivel) {
        this.listaNivel = listaNivel;
    }

}
