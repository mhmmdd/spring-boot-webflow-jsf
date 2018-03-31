package com.example.springbootwebflowjsf.beans;

import org.springframework.stereotype.Component;

import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * Bean to handle html form data to create/edit {@link Person person entities}.
 */
@Component("personForm")
@ViewScoped
public class PersonFormBean implements Serializable {

    private String firstName;

    private String lastName;

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }

    public void testUser() {
        System.out.println("testUser");
    }
}
