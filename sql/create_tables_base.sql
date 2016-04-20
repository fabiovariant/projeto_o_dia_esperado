CREATE TABLE tb_grooms_data (
	id_grooms	BIGSERIAL PRIMARY KEY,
	nm_groom	character varying,
	nm_bridge 	character varying
	
)

CREATE TABLE tb_ceremony_data (
	id_grooms BIGSERIAL REFERENCES tb_grooms_data (id_grooms),
	civil_date 			CHARACTER VARYING,
	religious_date 		CHARACTER VARYING,
	alliance 			CHARACTER VARYING,
	registry 			CHARACTER VARYING,
	bridesmaid 			CHARACTER VARYING,
	documentation 		CHARACTER VARYING,
	father_and_church 	CHARACTER VARYING,
	godparents 			CHARACTER VARYING,
	bridge_clothing 	CHARACTER VARYING,
	groom_clothing 		CHARACTER VARYING,
	witnesses 			CHARACTER VARYING
);
CREATE TABLE tb_party_data (
	id_grooms BIGSERIAL REFERENCES tb_grooms_data (id_grooms),
	drinks				CHARACTER VARYING,
	cake_candy			CHARACTER VARYING,
	buffet				CHARACTER VARYING,
	car					CHARACTER VARYING,
	decoration			CHARACTER VARYING,
	photo_and_video		CHARACTER VARYING,
	locale				CHARACTER VARYING,
	safety				CHARACTER VARYING,
	sound				CHARACTER VARYING,
	valet				CHARACTER VARYING
);
CREATE TABLE tb_dress_check_data (
	id_grooms BIGSERIAL REFERENCES tb_grooms_data (id_grooms),
	dress_check			character varying,
	is_perfect			character varying,
	take_date			character varying,
	devolution_date		character varying
);
CREATE TABLE tb_invitation_data (
	id_grooms BIGSERIAL REFERENCES tb_grooms_data (id_grooms),
	invitation				character varying,
	menu					character varying,
	decotarion_details		character varying,
	souvenirs				character varying,
	god_parents_gift		character varying,
	reservation				character varying
);
CREATE TABLE tb_guests_list_data (
	id_grooms BIGSERIAL REFERENCES tb_grooms_data (id_grooms),
	invited_name		character varying,
	email_invited		character varying,
	is_confirmed		character varying,
	invited_hashcode	character varying
);
CREATE TABLE tb_notepad_data (
	id_grooms BIGSERIAL REFERENCES tb_grooms_data (id_grooms),
	annotation character varying
);
CREATE TABLE tb_providers_data (
	id_grooms BIGSERIAL REFERENCES tb_grooms_data (id_grooms),
	provider_name	character varying,
	area			character varying,
	is_confirmed	character varying,
	provider_site	character varying,
	price			character varying,
	provider_phone	character varying
);