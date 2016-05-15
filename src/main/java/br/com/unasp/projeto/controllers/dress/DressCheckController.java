package br.com.unasp.projeto.controllers.dress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.unasp.projeto.models.DressCheckModel;
import br.com.unasp.projeto.services.dress.DressCheckService;

@Controller
@RequestMapping(value = "/dress")
public class DressCheckController {

	@Autowired
	DressCheckService dressCheckService;
	
	@RequestMapping(value = "/{id}",
					method = RequestMethod.GET)
	@ResponseBody
	public DressCheckModel get(@PathVariable("id") Integer idGrooms){
		return dressCheckService.get(idGrooms);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public DressCheckModel update(@RequestBody DressCheckModel checkModel){
		return dressCheckService.update(checkModel);
	}
}
