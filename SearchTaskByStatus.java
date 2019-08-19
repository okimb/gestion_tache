package Contructor_Assign;

import java.util.ArrayList;
import java.util.Scanner;

import Entities.Assign;
import Entities.Tasks;

public class SearchTaskByStatus {
	
	ArrayList<Assign>AssignList=new ArrayList<>();
	ArrayList<Tasks>TasksList=new ArrayList<>();

	static Scanner sc=new Scanner(System.in);
	
	//Searching Task by Status
	public void SearchTaskByStatu() {
		System.out.println("***** Enter a word for the research ******* ");
		String Choix=sc.next();
		sc.nextLine();
		for(int i=0; i<AssignList.size();i++) {
			if(Choix.compareTo(TasksList.get(i).getStatus_Task())==0) {
				System.out.println(AssignList.get(i).toString());
			}else {
				System.out.println("**** The status of the task does not exist *****");
				break;
			}
		}
	}
}
