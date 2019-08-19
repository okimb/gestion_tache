package Constructor_Members;

import java.util.ArrayList;
import java.util.Scanner;

import Entities.Members;

public class ShowOneMember {

	ArrayList<Members>MembersList=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	 
	//Show the informations of a member
	public void ShowOne(long id) {
		System.out.println("************ INSERT THE ID OF MEMBER FOR SEARCHING HIS INFOS ***********");
		for(int i=0; i<MembersList.size(); i++) {
			if(MembersList.get(i).getId_Member()==id) {
				
				System.out.println("******Member informations are:********");
				System.out.println("                                      ");
				System.out.println(MembersList.get(i).toString());
			}else {
				System.out.println("******* This Id does not exist *******");
				break;
			}
		}
	}
}
