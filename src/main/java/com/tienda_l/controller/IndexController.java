package com.tienda_l.controller;
import com.tienda_l.service.ArticuloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    private ArticuloService articuloService;
       
    @GetMapping("/")
    public String inicio(Model model) { 
        log.info("ahora se usa arquitectura MVC");
        var articulos=articuloService.getPorExistenciasCategorias(5, new Long(1));
        model.addAttribute("articulos", articulos);
        return "index";
    }

}
