package br.com.unasp.projeto.services.grooms;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import br.com.unasp.projeto.models.PartyModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service(value = "groomsServiceImp")
public class GroomsServiceImpl implements GroomsService{

	@PersistenceContext
	EntityManager entityManager;
	EntityTransaction entityTransaction = entityManager.getTransaction();
    Query query;
	private final String INSERT_INTO_TB_GROOMS_DATA = "INSERT INTO tb_grooms_data (?) VALUES (?)";
    
    public void saveNmBride(Connection conn, String nmBride) {
    	entityTransaction.begin();
    	query = entityManager.createQuery(INSERT_INTO_TB_GROOMS_DATA);
    	query.setParameter(1, nmBride);//TODO ACERTAR
    	entityTransaction.commit();
    }

    public void saveNmGroom(Connection conn, String nmGroom) {
                    
            try {
                PreparedStatement ps = conn.prepareCall(INSERT_INTO_TB_GROOMS_DATA);
                ps.setString(0, "nm_groom");
                ps.setString(1, nmGroom);
                ps.executeQuery();
            } catch (SQLException ex) {
                Logger.getLogger(GroomsServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public void saveIdCeremony(Connection conn, PartyModel idCeremony) {
        try {
            PreparedStatement ps = conn.prepareCall(INSERT_INTO_TB_GROOMS_DATA);
            ps.setString(0, "id_ceremony");
            ps.setObject(1, idCeremony);
            ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GroomsServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveIdParty(Connection conn, Integer idParty) {
        try {
            PreparedStatement ps = conn.prepareCall(INSERT_INTO_TB_GROOMS_DATA);
            ps.setString(0, "id_party");
            ps.setInt(1, idParty);
            ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GroomsServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveIdDressCheck(Connection conn, Integer idDressCheck) {
        try {
            PreparedStatement ps = conn.prepareCall(INSERT_INTO_TB_GROOMS_DATA);
            ps.setString(0, "id_dress_check");
            ps.setInt(1, idDressCheck);
            ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GroomsServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveIdInvitation(Connection conn, Integer idInvitation) {
        try {
            PreparedStatement ps = conn.prepareCall(INSERT_INTO_TB_GROOMS_DATA);
            ps.setString(0, "id_invitation");
            ps.setInt(1, idInvitation);
            ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GroomsServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveIdGuestsList(Connection conn, Integer idGuestsList) {
        try {
            PreparedStatement ps = conn.prepareCall(INSERT_INTO_TB_GROOMS_DATA);
            ps.setString(0, "id_guests_list");
            ps.setInt(1, idGuestsList);
            ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GroomsServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveIdNotepad(Connection conn, Integer idNotepad) {
        try {
            PreparedStatement ps = conn.prepareCall(INSERT_INTO_TB_GROOMS_DATA);
            ps.setString(0, "id_notepad");
            ps.setInt(1, idNotepad);
            ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GroomsServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveIdProviders(Connection conn, Integer idProviders) {
        try {
            PreparedStatement ps = conn.prepareCall(INSERT_INTO_TB_GROOMS_DATA);
            ps.setString(0, "id_providers");
            ps.setInt(1, idProviders);
            ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(GroomsServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
