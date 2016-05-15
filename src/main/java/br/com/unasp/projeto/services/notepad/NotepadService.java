package br.com.unasp.projeto.services.notepad;

import java.util.List;

import br.com.unasp.projeto.models.NotepadModel;

public interface NotepadService {

	public List<NotepadModel> get(Integer groomsId);
	
	public NotepadModel update(NotepadModel notepadModel);
	
	public NotepadModel save(NotepadModel notepadModel);
}
