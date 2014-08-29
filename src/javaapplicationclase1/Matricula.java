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
public class Matricula
{
    
    private Integer Id;
    private Periodo IdPeriodo;
    private Alumno IdAlumno;
    private String Numero;
    private Date Fecha;
    

    public Integer getId() 
    {
        return Id;
    }
    public void setId(Integer Id) 
    {
        this.Id = Id;
    }
    
    public Periodo getIdPeriodo() 
    {
        return IdPeriodo;
    }
    public void setIdPeriodo(Periodo IdPeriodo) 
    {
        this.IdPeriodo = IdPeriodo;
    }

    public Alumno getIdAlumno() 
    {
        return IdAlumno;
    }
    public void setIdAlumno(Alumno IdAlumno) 
    {
        this.IdAlumno = IdAlumno;
    }

    public String getNumero() 
    {
        return Numero;
    }
    public void setNumero(String Numero) 
    {
        this.Numero = Numero;
    }

    public Date getFecha() 
    {
        return Fecha;
    }
    public void setFecha(Date Fecha)
    {
        this.Fecha = Fecha;
    }  
    
    private List<MatriculaCredito> MatriculaCredito;

    public List<MatriculaCredito> getMatriculaCredito() {
        return MatriculaCredito;
    }

    public void setMatriculaCredito(List<MatriculaCredito> MatriculaCredito) {
        this.MatriculaCredito = MatriculaCredito;
    }

}