package Entities;

public class Members {
private long Id_Member;
private String Name_Member;
private String Surname_Member;
private String Adresse;
private String Email;
private String N_Phone;

public Members() {
	super();
	// TODO Auto-generated constructor stub
}
public Members(long id_Member, String name_Member, String surname_Member, String adresse, String email,
		String n_Phone) {
	super();
	Id_Member = id_Member;
	Name_Member = name_Member;
	Surname_Member = surname_Member;
	Adresse = adresse;
	Email = email;
	N_Phone = n_Phone;
}
public long getId_Member() {
	return Id_Member;
}
public void setId_Member(long id_Member) {
	Id_Member = id_Member;
}
public String getName_Member() {
	return Name_Member;
}
public void setName_Member(String name_Member) {
	Name_Member = name_Member;
}
public String getSurname_Member() {
	return Surname_Member;
}
public void setSurname_Member(String surname_Member) {
	Surname_Member = surname_Member;
}
public String getAdresse() {
	return Adresse;
}
public void setAdresse(String adresse) {
	Adresse = adresse;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getN_Phone() {
	return N_Phone;
}
public void setN_Phone(String n_Phone) {
	N_Phone = n_Phone;
}
public String toString() {
	return "Members[Id_Member ="+ Id_Member + ", Name_Member=" + Name_Member + " , "
			+ "Surname_Member=" + Surname_Member +", Adresse="+ Adresse +""
			+ ", Email="+ Email +", N_Phone="+ N_Phone +"]";
			
}
}
