package br.com.unasp.projeto.controllers.notepad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.unasp.projeto.models.NotepadModel;
import br.com.unasp.projeto.services.notepad.NotepadService;

@Controller
@RequestMapping(value = "/notepad")
public class NotepadController {

	@Autowired
	NotepadService notepadService;

	@RequestMapping(value = "/{id}",
					method = RequestMethod.GET)
	@ResponseBody
	public List<NotepadModel> getNotepadList(@PathVariable(value = "id") Integer groomsId){
		return notepadService.get(groomsId);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public NotepadModel save(@RequestBody NotepadModel notepadModel){
		return notepadService.save(notepadModel);
	}
}
