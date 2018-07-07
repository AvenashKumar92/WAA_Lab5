package edu.mum.controller;

import edu.mum.domain.User;
import edu.mum.repository.DataFacade;
import edu.mum.repositoryimpl.TestDataImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Avenash_2 on 6/28/2018.
 */

@Controller
@SessionAttributes("userObj")
@RequestMapping("/authenticationController")
public class AuthenticationController
{
    @Autowired
    DataFacade dataFacade;

    @RequestMapping(method = RequestMethod.POST)
    public String authenticateUser(@ModelAttribute User user, Model model){

        //DataFacade data = TestDataImpl.INSTANCE;
        String expectedPassword = dataFacade.findPassword(user.getName() );

        if(expectedPassword == null || !expectedPassword.equals(user.getPassword())) {
            return "index";
        }
        else
        {
            model.addAttribute("userObj", user);
            return "advice";
        }
    }
}
