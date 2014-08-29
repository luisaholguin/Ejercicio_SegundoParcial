package Gestion;

import Datos.capaDatos;
import java.sql.SQLException;
import javaapplicationclase1.Credito;
import javaapplicationclase1.Matricula;
import javaapplicationclase1.MatriculaCredito;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @authora: Luisa Holguin
 */
public class GestionMatricula implements IGestion
{
    private Matricula objetoMatricula = new Matricula();
    
    @Override
    public void Nuevo() 
    {
        
    }

    @Override
    public void Insertar() {
        try 
        {
            capaDatos.capaDatos.Conectar();
            capaDatos.capaDatos.IniciarTransaccion();
            capaDatos.capaDatos.Ejecutar("Insert into Matricula (id,idperiodo,idalumno,numero,fecha)"
                    +"values("+objetoMatricula.getId()+","+objetoMatricula.getIdPeriodo().getId()+",'"+objetoMatricula.getIdAlumno().getId()+","+objetoMatricula.getNumero()+"','"+objetoMatricula.getFecha()+"')");
            capaDatos.capaDatos.ConfirmarTransaccion();
            for (MatriculaCredito mc : objetoMatricula.getMatriculaCredito()) 
            {
                capaDatos.capaDatos.Ejecutar("Insert into MatriculaCredito(idmatricula, idcredito, estado)"+"values("+objetoMatricula.getId()+", "+mc.getIdCredito().getId()+", "+mc.getEstado()+")");
            }
        } 
        catch (Exception e) 
        {
            capaDatos.capaDatos.AnularTransaccion();
          
        }
        finally
        {
            capaDatos.capaDatos.Desconectar();
        }
    }

    @Override
    public void Modificar() 
    {
        try 
        {
            capaDatos.capaDatos.Conectar();
            capaDatos.capaDatos.IniciarTransaccion();
            capaDatos.capaDatos.Ejecutar("Update");
            capaDatos.capaDatos.ConfirmarTransaccion();
        } 
        catch (Exception e) 
        {
            capaDatos.capaDatos.AnularTransaccion();
        }
        finally
        {
            capaDatos.capaDatos.Desconectar();
        }
    }

    @Override
    public void Eliminar() {
        try 
        {
            capaDatos.capaDatos.Conectar();
            capaDatos.capaDatos.IniciarTransaccion();
            capaDatos.capaDatos.Ejecutar("Delete from"+"");
            capaDatos.capaDatos.ConfirmarTransaccion();
        } 
        catch (Exception e) 
        {
            capaDatos.capaDatos.AnularTransaccion();
        }
        finally
        {
            capaDatos.capaDatos.Desconectar();
        }
    }

    @Override
    public void Consultar() 
    {
        try 
        {
            capaDatos.capaDatos.Conectar();
            capaDatos.capaDatos.IniciarTransaccion();
            capaDatos.capaDatos.Ejecutar("Select Matricula");
            capaDatos.capaDatos.ConfirmarTransaccion();
        } 
        catch (Exception e) 
        {
            capaDatos.capaDatos.AnularTransaccion();
        }
        finally
        {
            capaDatos.capaDatos.Desconectar();
        }
    }
    
}
