package br.com.unasp.projeto.services.guest;

import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unasp.projeto.mail.EmailSender;
import br.com.unasp.projeto.mail.impl.GuestListEmailSender;
import br.com.unasp.projeto.models.GroomsModel;
import br.com.unasp.projeto.models.GuestsListModel;
import br.com.unasp.projeto.repository.grooms.GroomsDao;
import br.com.unasp.projeto.repository.guest.GuestListDao;

@Service("guestListService")
public class GuestListServiceImpl implements GuestListService{

	@Autowired
	GuestListDao guestListDao;
	@Autowired
	GroomsDao groomsDao;
	
	EmailSender emailSender;
	
	@Override
	public void inviteGuest(GuestsListModel guestsListModel) {
		guestsListModel.setIsConfirmed(false);
		guestListDao.save(guestsListModel);
		GroomsModel groomsModel = groomsDao.get(guestsListModel.getIdGrooms());
		emailSender = new GuestListEmailSender(guestsListModel, groomsModel);
		try {
			emailSender.send();
		} catch (MessagingException e) {
			System.out.println("Erro" + e);
		}
	}

	@Override
	public void confirmGuest(String guestEmail, Integer idGrooms) {
		guestListDao.confirmGuest(guestEmail, idGrooms);
	}
	
	@Override
	public List<GuestsListModel> getList(Integer idGrooms) {
		return guestListDao.getList(idGrooms);
	}
}
