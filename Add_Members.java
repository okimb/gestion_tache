package Constructor_Members;

import java.util.ArrayList;
import java.util.Scanner;

import Entities.Members;

public class Add_Members {
ArrayList<Members>MembersList=new ArrayList<>();

static Scanner sc=new Scanner(System.in);

//AddMembers
public void AddMember() {
	System.out.println(" WELCOME TO THE SECTION OF ADDING MEMBERS  ");
	System.out.println("   START INSERTING MEMBERS INFORMATIONS    ");
	System.out.println(" ******************************************");
	
	System.out.println("*********     Member's Id         ***********");
	long id_member=sc.nextLong();
	sc.nextLine();
	System.out.println("*********     Member's Name       ***********");
	String Name=sc.nextLine();
	
	System.out.println("*********     Member's Surname    ***********");
	String Surname=sc.nextLine();
	
	System.out.println("*********     Member's Adresse    ***********");
	String adresse= sc.nextLine();
	
	System.out.println("*********     Member's Email      ***********");
	String email= sc.nextLine();
	
	
	System.out.println("*********   Member's Phone number ***********");
	String Telephone= sc.nextLine();
	
	Members membre=new Members(id_member, Name, Surname, adresse, email, Telephone);
	MembersList.add(membre);
}
}
