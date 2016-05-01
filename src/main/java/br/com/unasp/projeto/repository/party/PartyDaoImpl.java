package br.com.unasp.projeto.repository.party;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import br.com.unasp.projeto.models.PartyModel;

@Repository(value = "partyDao")
public class PartyDaoImpl implements PartyDao {

	private final String SELECT_FROM_TABLE = "SELECT (id_grooms, drinks, cake_candy, buffet, car,"
			+ " decoration, photo_and_video, locale, safety, sound, valet)"
			+ " FROM tb_party_data WHERE id_grooms = ?";
	
	private final String INSERT_INTO_TABLE = "INSERT INTO tb_party_data (id_grooms, drinks, cake_candy,"
			+ " buffet, car, decoration, photo_and_video, locale, safety, sound, valet)"
			+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	public void save(Connection connection, PartyModel partyModel) throws SQLException {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(INSERT_INTO_TABLE);
			int i = 0;
			preparedStatement.setInt(++i, partyModel.getIdGrooms());
			preparedStatement.setString(++i, partyModel.getDrinks());
			preparedStatement.setString(++i, partyModel.getCakeCandy());
			preparedStatement.setString(++i, partyModel.getBuffet());
			preparedStatement.setString(++i, partyModel.getCar());
			preparedStatement.setString(++i, partyModel.getDecoration());
			preparedStatement.setString(++i, partyModel.getPhotoAndVideo());
			preparedStatement.setString(++i, partyModel.getLocale());
			preparedStatement.setString(++i, partyModel.getSafety());
			preparedStatement.setString(++i, partyModel.getSound());
			preparedStatement.setString(++i, partyModel.getValet());
			preparedStatement.execute();
		} finally {
			if(preparedStatement != null && !preparedStatement.isClosed()){preparedStatement.close();}
		}
	}

	public PartyModel get(Connection connection, Integer groomsId) throws SQLException{
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		PartyModel model = new PartyModel();
		
		try {
			preparedStatement = connection.prepareStatement(SELECT_FROM_TABLE);
			preparedStatement.setInt(1, groomsId);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				model.setIdGrooms(resultSet.getInt("id_grooms"));
				model.setDrinks(resultSet.getString("drinks"));
				model.setCakeCandy(resultSet.getString("cake_candy"));
				model.setBuffet(resultSet.getString("buffet"));
				model.setCar(resultSet.getString("car"));
				model.setDecoration(resultSet.getString("decoration"));
				model.setPhotoAndVideo(resultSet.getString("photo_and_video"));
				model.setLocale(resultSet.getString("locale"));
				model.setSafety(resultSet.getString("safety"));
				model.setSound(resultSet.getString("sound"));
				model.setValet(resultSet.getString("valet"));
			}
			return model;
		} finally {
			if(preparedStatement != null && !preparedStatement.isClosed()){preparedStatement.close();}
			if(resultSet != null && !resultSet.isClosed()){resultSet.close();}
		}
	}

}
