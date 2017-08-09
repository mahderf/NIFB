package nifb.me.nifb.controller;

import nifb.me.nifb.models.Nifb;
import nifb.me.nifb.repository.NifbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    NifbRepository nifbRepository;
    @GetMapping("/enterhere")
    public String Enternumber(Model model)
    {
        model.addAttribute("newnifb", new Nifb());
        return "enterhere";
    }

    @PostMapping("/enterhere")
    public String Postnumber(@Valid @ModelAttribute("newnifb") Nifb othernifb, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "enterhere";
        }

        nifbRepository.save(othernifb);
        return "postresult";
    }
}





