package br.com.unasp.projeto.repository.notepad;

import java.util.List;

import br.com.unasp.projeto.models.NotepadModel;

public interface NotepadDao {

	public List<NotepadModel> getNotepads(Integer groomsId) ;

	public void save(List<NotepadModel> notepadModel);

	public NotepadModel update(NotepadModel notepadModel);

}
