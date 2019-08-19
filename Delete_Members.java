package Constructor_Members;

import java.util.ArrayList;

import Entities.Members;

public class Delete_Members {

	ArrayList<Members>MembersList=new ArrayList<>();
	// DELETING MEMBERS FROM THE SYSTEM
	public void DeleteMembers(long Id) {
		System.out.println("***** Warning: Do yo wanna delete this member from the system *********");
		for(int i=0; i<MembersList.size(); i++) {
			if (MembersList.get(i).getId_Member()==Id) {
				MembersList.remove(i);
			}else {
				System.out.println("************** This member does not exist **********************");
				break;
			}
		}
	}
}
