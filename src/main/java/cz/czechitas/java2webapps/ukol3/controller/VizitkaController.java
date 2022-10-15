package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {

  private List<Vizitka> seznamVizitek = vytvorVizitky();

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("seznam");
    modelAndView.addObject("seznamVizitek", seznamVizitek);
    return modelAndView;
  }

  @GetMapping("/detail/{id}")
  public ModelAndView detail(@PathVariable int id) {
    ModelAndView modelAndView = new ModelAndView("detail");
    modelAndView.addObject("vizitka", seznamVizitek.get(id));
    return modelAndView;
  }


  private List<Vizitka> vytvorVizitky() {
    List<Vizitka> vizitky = new ArrayList<>();
    Vizitka vizitka = new Vizitka("Drahomíra Prokopová", "DrazaSoft", "Kryšpínova 530/9", "109 00 Praha 10", "prokopova.drahomira@gmail.com", "777 777 777", "www.draza.cz");
    vizitky.add(vizitka);
    Vizitka vizitka2 = new Vizitka("Pavel Novák", "", "Dubrovnícká 3", "150 00 Praha 5", "pavel.novak@gmail.com", "777 999 777", "www.novak.cz");
    vizitky.add(vizitka2);
    Vizitka vizitka3 = new Vizitka("Kamila Kasalová", "Kamca", "Děkanská vinice I 984/2", "140 00 Praha 4", "", "777 666 777", "");
    vizitky.add(vizitka3);
    Vizitka vizitka4 = new Vizitka("Martina Novotná", "", "Na pasece 3", "108 00 Praha" , "marga.novotna@gmail.com", "", "");
    vizitky.add(vizitka4);
    return vizitky;

  }




}
