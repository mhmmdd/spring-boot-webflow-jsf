package com.example.springbootwebflowjsf;

import com.example.springbootwebflowjsf.beans.PersonFormBean;
import org.springframework.stereotype.Controller;

@Controller("personController")
public class PersonController {

    public String savePerson (PersonFormBean personFormBean ) {
        System.out.println("savePerson");
        return "success";
    }

}
