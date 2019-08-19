package Constructor_Members;

import java.util.ArrayList;
import java.util.Scanner;

import Entities.Members;

public class EditingMembers {
	
	ArrayList<Members>MembersList=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	
	//EDITING MEMBERS
	public void EditMembers() {
		System.out.println("***** WELCOME TO THE SECTION OF EDITING MEMBERS ******");
		System.out.println("                                                      ");
		System.out.println("************** INSERT THE ID OF MEMBER TO EDIT *******");
		long Id=sc.nextLong();
		sc.nextLine();
		for(int i=0; i<MembersList.size();i++) {
			if(MembersList.get(i).getId_Member()==Id) {
				
				System.out.println("***** INSERT THE NAME OF MEMBER **************");
				String Name_member=sc.nextLine();
				MembersList.get(i).setName_Member(Name_member);
				
				System.out.println("********* INSERT THE SURNAME OF MEMBER ********");
				String Surname=sc.nextLine();
				MembersList.get(i).setSurname_Member(Surname);
				
				System.out.println("******* INSERT THE ADRESSE OF MEMBER **********");
				String adresse=sc.nextLine();
				MembersList.get(i).setAdresse(adresse);
				
				System.out.println("********* INSERT THE EMAIL OF MEMBER **********");
				String email=sc.nextLine();
				MembersList.get(i).setEmail(email);
				
				System.out.println("********* INSERT THE NUMBER PHONE *************");
				String telephone=sc.nextLine();
				MembersList.get(i).setN_Phone(telephone);
			}else {
				System.out.println(" The Id_Member does not to any member to be edited");
				break;
			}
		}
	}
	

}
