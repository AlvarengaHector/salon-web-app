package com.emkt.controllers;

import com.emkt.entityclasses.Persona;
import com.emkt.entityclasses.Rol;
import com.emkt.entityclasses.Usuario;
import com.emkt.sessionbeans.UsuarioFacade;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named("usuarioController")
@SessionScoped
public class UsuarioController implements Serializable {

    @EJB
    private com.emkt.sessionbeans.UsuarioFacade ejbFacade;
    private List<Usuario> items = null;
    private Usuario selected;
    
    private Integer id;
    private String usuario;
    private String password;
    private String estado;
    private List<Rol> rol;
    private List<Persona> persona;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Rol> getRol() {
        return rol;
    }

    public void setRol(List<Rol> rol) {
        this.rol = rol;
    }

    public List<Persona> getPersona() {
        return persona;
    }

    public void setPersona(List<Persona> persona) {
        this.persona = persona;
    }
    
    public UsuarioController() {
    }

    public Usuario getSelected() {
        return selected;
    }

    public void setSelected(Usuario selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private UsuarioFacade getFacade() {
        return ejbFacade;
    }

    public void create() {
        Usuario u = new Usuario();
        u.setUsuario(usuario);
        u.setPassword(password);
        u.setEstado(estado);
        u.setFkRol((Rol) rol);
        u.setFkPersona((Persona) persona);
        ejbFacade.create(u);
    }

    public void update() {

    }

    public void destroy() {

    }

    public List<Usuario> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    public Usuario getUsuario(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<Usuario> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Usuario> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

}
