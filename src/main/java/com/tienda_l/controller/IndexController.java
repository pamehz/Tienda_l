package com.tienda_l.controller;

import com.tienda_l.dao.ClienteDao;
import com.tienda_l.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    private ClienteDao clienteDao;
    
            
    
    @GetMapping("/")
    public String inicio(Model model) { 
        log.info("ahora se usa arquitectura MVC");
 
        Cliente cliente = new Cliente(" Pamela", "Morera Zumbado", "mpamelamorera@gmail.com", "8529-0441");
        //Cliente cliente2 = new Cliente(" Jose", "Vargas Zamora", "jvaza1@gmail.com", "8529-0341");
        //var clientes = Arrays.asList();
        var clientes=clienteDao.findAll();
        model.addAttribute("cliente", cliente);
        model.addAttribute("clientes", clientes);
        return "index";
    }
    
}
