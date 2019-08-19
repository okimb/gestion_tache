package Contructor_Assign;

import java.util.ArrayList;

import Entities.Assign;

public class ShowAllAssignedTasks {
	
	ArrayList<Assign>AssignList=new ArrayList<>();
	
	//Show up all the assigned tasks to the members
	
	public void ShowAssignedTasks() {
		for(int i=0; i<AssignList.size(); i++) {
			
			System.out.println("**********LIST OF ASSIGNED TASKS **********");
			
			System.out.println(AssignList.get(i).Show());
		}
	}

}
