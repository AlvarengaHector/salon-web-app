package com.emkt.controllers;

import com.emkt.entityclasses.Cliente;
import com.emkt.entityclasses.Persona;
import com.emkt.entityclasses.Telefono;
import com.emkt.sessionbeans.ClienteFacade;
import com.emkt.sessionbeans.PersonaFacade;
import com.emkt.sessionbeans.TelefonoFacade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;

@Named("clienteController")
@ViewScoped
public class ClienteController implements Serializable {

    @EJB
    private com.emkt.sessionbeans.ClienteFacade clienteFacade;
    private com.emkt.sessionbeans.PersonaFacade personaFacade;
    private com.emkt.sessionbeans.TelefonoFacade telefonoFacade;
    private List<Cliente> items = null;
    private Cliente selected;
    // mis variables
    private Integer codigo;
    private String nombre;
    private String apellido;
    private String correo;
    private Date fnacimiento;
    private String tipoTel;
    private Integer numeroTel;

    public ClienteController() {
    }

    public Cliente getSelected() {
        return selected;
    }

    public void setSelected(Cliente selected) {
        this.selected = selected;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(Date fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public String getTipoTel() {
        return tipoTel;
    }

    public void setTipoTel(String tipoTel) {
        this.tipoTel = tipoTel;
    }

    public Integer getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(Integer numeroTel) {
        this.numeroTel = numeroTel;
    }
    
    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    public ClienteFacade getClienteFacade() {
        return clienteFacade;
    }

    public void setClienteFacade(ClienteFacade clienteFacade) {
        this.clienteFacade = clienteFacade;
    }

    public PersonaFacade getPersonaFacade() {
        return personaFacade;
    }

    public void setPersonaFacade(PersonaFacade personaFacade) {
        this.personaFacade = personaFacade;
    }

    public TelefonoFacade getTelefonoFacade() {
        return telefonoFacade;
    }

    public void setTelefonoFacade(TelefonoFacade telefonoFacade) {
        this.telefonoFacade = telefonoFacade;
    }
    

    public void create() {
        Cliente c = new Cliente();
        Persona p = new Persona();
        Telefono t = new Telefono();
        c.setCodigo(codigo);
        p.setNombre(nombre);
        p.setApellido(apellido);
        p.setCorreo(correo);
        p.setFnacimiento(fnacimiento);
        t.setTipo(tipoTel);
        t.setNumero(numeroTel);

        telefonoFacade.create(t);
        personaFacade.create(p);
        clienteFacade.create(c);        
    }

    public void update() {
        
    }

    public void destroy() {
        
    }

    public List<Cliente> getItems() {
        if (items == null) {
            items = getClienteFacade().findAll();
        }
        return items;
    }

    public Cliente getCliente(java.lang.Integer id) {
        return getClienteFacade().find(id);
    }

    public List<Cliente> getItemsAvailableSelectMany() {
        return getClienteFacade().findAll();
    }

    public List<Cliente> getItemsAvailableSelectOne() {
        return getClienteFacade().findAll();
    }

    /* @FacesConverter(forClass = Cliente.class)
    public static class ClienteControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            ClienteController controller = (ClienteController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "clienteController");
            return controller.getCliente(getKey(value));
        }

        java.lang.Integer getKey(String value) {
            java.lang.Integer key;
            key = Integer.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Integer value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Cliente) {
                Cliente o = (Cliente) object;
                return getStringKey(o.getIdCliente());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Cliente.class.getName()});
                return null;
            }
        }

    } */

}
