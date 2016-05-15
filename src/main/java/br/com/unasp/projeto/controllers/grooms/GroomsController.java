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
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/grooms")
public class GroomsController {
	
    @Autowired
    private GroomsService groomsService;

    
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public GroomsModel saveGrooms(@RequestBody GroomsModel groomsModel){
        return groomsService.saveOrUpdate(groomsModel);
    }

    @RequestMapping(value = "/{id}",
    				method = RequestMethod.GET)
    @ResponseBody
    public GroomsModel getGrooms(@PathVariable(value = "id") Integer idGrooms){
    	return groomsService.get(idGrooms);
    }
}
