package com.stupar.fiberglasskamianske.controller;


import com.stupar.fiberglasskamianske.model.PriceItem;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeWebController {
    // Define the logger
    private static final Logger log = LoggerFactory.getLogger(HomeWebController.class);

    @GetMapping({"/", "/index.html"})
    public String showHome(Model model) {
        model.addAttribute("welcome", "Hello There, how are you?");
        return "index";
    }

    @GetMapping({"/features"})
    public String showFeatures(Model model) {
        log.info("getFeatures Started");
        model.addAttribute("features", List.of("Papa", "Mama", "Syn"));
        return "features";
    }

    @GetMapping({"/projects"})
    public String showProjects(Model model) {
        PriceItem priceItem1 = new PriceItem("100","Big Item", 14.99);
        PriceItem priceItem2 = new PriceItem("200","SemiBig Item", 10.00);
        PriceItem priceItem3 = new PriceItem("300","Medium Item", 8.88);
        PriceItem priceItem4 = new PriceItem("400","Small Item", 5.55);

        model.addAttribute("prices", List.of(priceItem1, priceItem2, priceItem3, priceItem4));
        return "projects";
    }

    @GetMapping({"/contact"})
    public String showContact() {
        return "contact";
    }
}
