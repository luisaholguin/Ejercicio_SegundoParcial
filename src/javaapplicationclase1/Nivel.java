/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplicationclase1;

import java.util.List;

/**
 *
 * @authora: Luisa Holguin
 */
public class Nivel 
{

    public Nivel(int Id, String Descripcion, Malla Idmalla) 
    {
        this.Id = Id;
        this.Descripcion = Descripcion;
        this.Idmalla = Idmalla;
    }
    
    private int Id;
    private String Descripcion;
    private Malla Idmalla;

    
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
    
    public Malla getIdmalla() 
    {
        return Idmalla;
    }
    public void setIdmalla(Malla Idmalla) 
    {
        this.Idmalla = Idmalla;
    }
    
    private List<Credito> listaCredito;

    public List<Credito> getListaCredito() {
        return listaCredito;
    }

    public void setListaCredito(List<Credito> listaCredito) {
        this.listaCredito = listaCredito;
    }

}
