package Constructor_Members;

import java.util.ArrayList;

import Entities.Members;

public class ShowAllMembers {

	
	ArrayList<Members>MembersList=new ArrayList<>();
	//Showing up all the members
	public void ShowMembers() {
		for(int i=0; i<MembersList.size(); i++) {
			
			System.out.println("********** COMPLETE LIST OF MEMBERS **********");
			System.out.println("----------------------------------------------");
			System.out.println(MembersList.get(i).toString());
		}
	}
}
