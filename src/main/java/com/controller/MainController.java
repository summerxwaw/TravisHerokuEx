package com.controller;
import java.util.List;

import com.dao.ProductionDAO;
import com.model.Production;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @Autowired
    private ProductionDAO productionDAO;

    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String welcomePage(Model model) {
        productionDAO.insertProduction("router1", 100);
        productionDAO.insertProduction("router2", 23);
        List<Production> list = productionDAO.listProduction();
        model.addAttribute("productions", "asdasdasdasdsada");
        return "index";
    }
}
