package br.com.unasp.projeto.services.grooms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.unasp.projeto.models.CeremonyModel;
import br.com.unasp.projeto.models.DressCheckModel;
import br.com.unasp.projeto.models.GroomsModel;
import br.com.unasp.projeto.models.InvitationModel;
import br.com.unasp.projeto.models.PartyModel;
import br.com.unasp.projeto.models.ProvidersModel;
import br.com.unasp.projeto.repository.grooms.GroomsDao;
import br.com.unasp.projeto.services.ceremony.CeremonyService;
import br.com.unasp.projeto.services.dress.DressCheckService;
import br.com.unasp.projeto.services.invitation.InvitationService;
import br.com.unasp.projeto.services.party.PartyService;
import br.com.unasp.projeto.services.providers.ProviderService;

@Service(value = "groomsService")
@Transactional(propagation = Propagation.REQUIRED)
public class GroomsServiceImpl implements GroomsService{

	@Autowired
	GroomsDao groomsDao;

	@Autowired
	CeremonyService ceremonyService;
	
	@Autowired
	DressCheckService dressCheckService;
	
	@Autowired
	InvitationService invitationService;
	
	@Autowired
	PartyService partyService;
	
	@Autowired
	ProviderService providerService;
		
	@Override
	public GroomsModel get(Integer id){
		return groomsDao.get(id);
	}

	@Override
	public GroomsModel saveOrUpdate(GroomsModel groomsModel) {
		if(groomsModel.getIdGrooms() == null || groomsModel.getIdGrooms() == 0){
			groomsModel = groomsDao.save(groomsModel);
			createInitialRegisters(groomsModel);
			return groomsModel;
		} else
			return groomsDao.update(groomsModel);
	}

	private void createInitialRegisters(GroomsModel groomsModel){
		
		CeremonyModel ceremonyModel = new CeremonyModel();
		ceremonyModel.setIdGrooms(groomsModel.getIdGrooms());
		ceremonyService.save(ceremonyModel);
		
		DressCheckModel dressCheckModel = new DressCheckModel();
		dressCheckModel.setIdGrooms(groomsModel.getIdGrooms());
		dressCheckService.save(dressCheckModel);
		
		InvitationModel invitationModel = new InvitationModel();
		invitationModel.setIdGrooms(groomsModel.getIdGrooms());
		invitationService.save(invitationModel);
		
		PartyModel partyModel = new PartyModel();
		partyModel.setIdGrooms(groomsModel.getIdGrooms());
		partyService.save(partyModel);
		
		ProvidersModel providersModel = new ProvidersModel();
		providersModel.setIdGrooms(groomsModel.getIdGrooms());
		providerService.save(providersModel);
	}

}
