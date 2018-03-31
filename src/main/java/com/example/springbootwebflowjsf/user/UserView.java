package com.example.springbootwebflowjsf.user;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class UserView {

    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

//    public void save() {
//        FacesContext.getCurrentInstance().addMessage(null,
//                new FacesMessage("Welcome " + firstname + " " + lastname));
//    }


}
