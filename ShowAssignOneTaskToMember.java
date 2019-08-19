package Contructor_Assign;

import java.util.ArrayList;
import java.util.Scanner;

import Entities.Assign;
import Entities.Members;

public class ShowAssignOneTaskToMember {

	ArrayList<Assign>AssignList=new ArrayList<>();
	ArrayList<Members>MembersList=new ArrayList<>();
	
	static Scanner sc=new Scanner(System.in);
	
	//Show Tasks affected to a member
	public void ShowAffectedTaskToMember() {
		System.out.println(" ********INSERT ID OF MEMBER**********");
		long Id_member=sc.nextLong();
		System.out.println(" Assigned tasks are to a member:"+ Id_member);
		sc.nextLine();
		for(int i=0; i<AssignList.size();i++) {
			if(Id_member==AssignList.get(i).getMember().getId_Member()) {
				System.out.println("**********LIST OF TASKS AFFECTED TO A MEMBER********");
				System.out.println(AssignList.get(i).getTask());
				System.out.println(AssignList.get(i).getTask());
			}
		}
	}
}
