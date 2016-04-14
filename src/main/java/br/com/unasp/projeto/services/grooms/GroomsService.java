package br.com.unasp.projeto.services.grooms;

import br.com.unasp.projeto.models.PartyModel;
import java.sql.Connection;

public interface GroomsService {

	public void saveNmBride(Connection conn, String nmBride);
	public void saveNmGroom(Connection conn, String nmGroom);
	public void saveIdCeremony(Connection conn, PartyModel idCeremony);
	public void saveIdParty(Connection conn, Integer idParty);
	public void saveIdDressCheck(Connection conn, Integer idDressCheck);
	public void saveIdInvitation(Connection conn, Integer idInvitation);
	public void saveIdGuestsList(Connection conn, Integer idGuestsList);
	public void saveIdNotepad(Connection conn, Integer idNotepad);
	public void saveIdProviders(Connection conn, Integer idProviders);
}
