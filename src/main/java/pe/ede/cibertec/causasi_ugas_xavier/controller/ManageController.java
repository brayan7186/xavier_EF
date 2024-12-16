package pe.ede.cibertec.causasi_ugas_xavier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.ede.cibertec.causasi_ugas_xavier.dto.CarDto;
import pe.ede.cibertec.causasi_ugas_xavier.service.CarService;


import java.util.List;

@Controller
@RequestMapping("/manage")
public class ManageController {

    @Autowired
    CarService manageService;

    @GetMapping("/start")
    public String start(Model model) {

        try {
            List<CarDto> users = manageService.getAllCars();
            model.addAttribute("users", users);
            model.addAttribute("error", null);

        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", "Ocurrió un error al obtener los datos.");

        }
        return "home";

    }

}
