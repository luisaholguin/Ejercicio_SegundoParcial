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
public class Credito 
{

    public Credito(int Id, String Descripcion, Nivel IdNivel) 
    {
        this.Id = Id;
        this.Descripcion = Descripcion;
        this.IdNivel = IdNivel;
    }
 
    public List<Credito> ListaPrerequisito;
    private int Id;
    private String Descripcion;
    private Nivel IdNivel;

    public List<Credito> getListaPrerequisito() 
    {
        return ListaPrerequisito;
    }
    public void setListaPrerequisito(List ListaPrerequisito) 
    {
        this.ListaPrerequisito = ListaPrerequisito;
    }

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

    public Nivel getIdNivel() 
    {
        return IdNivel;
    }
    public void setIdNivel(Nivel IdNivel) 
    {
        this.IdNivel = IdNivel;
    }
    
    private List<MatriculaCredito> listamatriculaCredito;

    public List<MatriculaCredito> getListamatriculaCredito() {
        return listamatriculaCredito;
    }

    public void setListamatriculaCredito(List<MatriculaCredito> listamatriculaCredito) {
        this.listamatriculaCredito = listamatriculaCredito;
    }

}
