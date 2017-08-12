/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.templates;

import com.mycompany.dto.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author Oracle D77738
 */
@ManagedBean(name = "clienteBean")
@RequestScoped
public class ClienteController {

    private Persona persona = new Persona(null, null, null);

    private List<Persona> clientes;
    private List<String> estados;
    private List<String> municipios;
    
    @PostConstruct
    public void init(){
        estados = new ArrayList<String>();
        estados.add("Aguascalientes");
        estados.add("Baja California");
        estados.add("Baja California Sur");
        
        municipios = new ArrayList<String>();
        
        clientes = new ArrayList<Persona>();
        for (int i = 0; i < 50; i++) {
            clientes.add(new Persona("Raul", "Soto", "Jojutla"));
            clientes.add(new Persona("Joselin", "Juarez", "Orizaba"));
        }
    }
  
    public void cargarMunicipios(){
        System.out.println("Entra!!!!!!!!");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Iterando...");
            municipios.add("Municipio"+i);
        }
    }
    
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getClientes() {
        return clientes;
    }

    public void setClientes(List<Persona> clientes) {
        this.clientes = clientes;
    }
      public List<String> getEstados() {
        return estados;
    }

    public void setEstados(List<String> estados) {
        this.estados = estados;
    }

    public List<String> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(List<String> municipios) {
        this.municipios = municipios;
    }
    
    
}
