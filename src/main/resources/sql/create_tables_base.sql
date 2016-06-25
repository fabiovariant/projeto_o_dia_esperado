CREATE TABLE tb_grooms_data (
	id_grooms		BIGSERIAL 				PRIMARY KEY		UNIQUE,
	nm_groom		character varying,
	nm_bridge 		character varying,
	grooms_email	character varying 		UNIQUE,
	gr_password		character varying
);
CREATE TABLE tb_ceremony_data (
	id_grooms 			BIGSERIAL 				UNIQUE REFERENCES tb_grooms_data (id_grooms),
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
	id_grooms 			BIGSERIAL 				UNIQUE REFERENCES tb_grooms_data (id_grooms),
	party_date			CHARACTER VARYING,
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
	id_grooms 			BIGSERIAL 				UNIQUE REFERENCES tb_grooms_data (id_grooms),
	dress_check			character varying,
	perfect_date		character varying,
	take_date			character varying,
	devolution_date		character varying
);
CREATE TABLE tb_invitation_data (
	id_grooms 				BIGSERIAL 				UNIQUE REFERENCES tb_grooms_data (id_grooms),
	invitation				character varying,
	menu					character varying,
	decotarion_details		character varying,
	souvenirs				character varying,
	god_parents_gift		character varying,
	reservation				character varying
);
CREATE TABLE tb_guests_list_data (
	id_grooms 			BIGSERIAL 				 REFERENCES tb_grooms_data (id_grooms),
	invited_name		character varying,
	email_invited		character varying,
	is_confirmed		character varying 		 DEFAULT FALSE,
	email_text			character varying,
	PRIMARY KEY(id_grooms, email_invited)
);
CREATE TABLE tb_notepad_data (
	id_grooms 			BIGSERIAL 				REFERENCES tb_grooms_data (id_grooms),
	annotation 			character varying
);
CREATE TABLE tb_providers_data (
	id_grooms 			BIGSERIAL 				REFERENCES tb_grooms_data (id_grooms),
	provider_name		character varying,
	area				character varying,
	is_confirmed		character varying,
	provider_site		character varying,
	price				character varying,
	provider_phone		character varying
);

CREATE TABLE tb_time_line_data(
	id_grooms			BIGSERIAL    	 		REFERENCES tb_grooms_data (id_grooms),
	location			character varying,
	picture_text		character varying,
	dt_upload			character varying,
	PRIMARY KEY(id_grooms, location)		
);