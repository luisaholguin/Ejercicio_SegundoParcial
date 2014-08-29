/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestion;

import Datos.capaDatos;

/**
 *
 * @authora: Luisa Holguin
 */
public class GestionCredito implements IGestion
{
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
            capaDatos.capaDatos.Ejecutar("Insert into Credito ()"+"");
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
            capaDatos.capaDatos.Ejecutar("Select Credito");
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
