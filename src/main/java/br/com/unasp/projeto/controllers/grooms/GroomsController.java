/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unasp.projeto.controllers.grooms;

import br.com.unasp.projeto.models.GroomsModel;
import br.com.unasp.projeto.services.grooms.GroomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author fabio.silva.a2
 */

@Controller
@RequestMapping(value = "/grooms")
public class GroomsController {
    @Autowired
    private GroomsService service;

    
    @RequestMapping(method = RequestMethod.POST)
    public void saveGrooms(@RequestBody GroomsModel groomsModel){
        service.save(groomsModel);
    }
    
        
    @RequestMapping(method = RequestMethod.PUT)
    public void saveNmBride(@PathVariable(value = "nm_bride") String nmBride){
        //service.saveNmGroom(conn, nmBride);
    }
}
