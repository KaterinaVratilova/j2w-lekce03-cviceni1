package cz.czechitas.java2webapps.lekce3.controller;

import cz.czechitas.java2webapps.lekce3.entity.Address;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

/**
 * Hlavní kontroler pro zobrazení zákaznické kartičky.
 */
@Controller
public class CardController {

  @GetMapping("/")
  public ModelAndView karticka() {
    ModelAndView result = new ModelAndView("card");

    result.addObject("person", new Person(
            "Eliška", "Krásnohorská",
            LocalDate.of(1947, 11, 18),
            "https://thispersondoesnotexist.com/image"
    ));
    result.addObject("address", new Address("Husova 234/8", "Praha", "11000"));
    return result;
  }
}
