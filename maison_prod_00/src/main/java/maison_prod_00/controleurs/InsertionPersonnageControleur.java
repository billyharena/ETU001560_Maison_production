package maison_prod_00.controleurs;

import hibernateDAO.HibernateDAO;
import models.Personnage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertionPersonnageControleur {
    @Autowired
    HibernateDAO dao;
    @RequestMapping("/insertion")
    public String index(Model model){
        model.addAttribute("listePerso", dao.findAll(Personnage.class));
        return "insertionPerso";
    }

}
