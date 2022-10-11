package com.tienda_l.controller;

import com.tienda_l.dao.ClienteDao;
import com.tienda_l.domain.Cliente;
import com.tienda_l.service.ClienteService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    private ClienteService clienteService;
    
            
    
    @GetMapping("/")
    public String inicio(Model model) { 
        log.info("ahora se usa arquitectura MVC");
 
        Cliente cliente = new Cliente(" Pamela", "Morera Zumbado", "mpamelamorera@gmail.com", "8529-0441");
        //Cliente cliente2 = new Cliente(" Jose", "Vargas Zamora", "jvaza1@gmail.com", "8529-0341");
        //var clientes = Arrays.asList();
        var clientes=clienteService.getClientes();
        clienteService.delete(clientes.get(0));
        model.addAttribute("clientes", clientes);
        return "index";
    }
    @GetMapping("/nuevoCliente")
    public String nuevoCliente (Cliente cliente)
    {return "modificarCliente";
    }
    @PostMapping("/guardarCliente")
    public String guardarCliente(Cliente cliente){
        clienteService.save(cliente);
        return "redirect";
    }
    @GetMapping ("/modificarCliente/{idCliente}")
    public String modificarCliente(Cliente cliente, Model model){
       cliente= clienteService.getCliente(cliente);
       model.addAttribute("cliente", cliente);
       return"modificarCliente";
        
    }
    @GetMapping ("/eliminarCliente/{idCliente}")
    public String eliminarCliente(Cliente cliente){
        clienteService.delete(cliente);
        return "redirect:/";
    }
}
