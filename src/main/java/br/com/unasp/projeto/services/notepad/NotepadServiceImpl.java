package br.com.unasp.projeto.services.notepad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unasp.projeto.models.NotepadModel;
import br.com.unasp.projeto.repository.notepad.NotepadDao;

@Service("notepadService")
public class NotepadServiceImpl implements NotepadService{

	@Autowired
	NotepadDao notepadDao;
	
	@Override
	public List<NotepadModel> get(Integer groomsId) {
		return notepadDao.getNotepads(groomsId);
	}

	@Override
	public NotepadModel update(NotepadModel notepadModel) {
		return notepadDao.update(notepadModel);
	}

	@Override
	public NotepadModel save(NotepadModel notepadModel) {
		return notepadDao.save(notepadModel);
	}

}
