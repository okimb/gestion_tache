package Contructor_Assign;

import java.util.ArrayList;

import Entities.Assign;

public class DeleteAssignTasks {

	ArrayList<Assign>AssignList=new ArrayList<>();
	
	//Deleting AssignedTasks
	public void DeleteAssigned(long id) {
		for(int i=0; i<AssignList.size(); i++) {
			if(AssignList.get(i).getId_Assign()==id) {
				System.out.println("**********SUPPRESSION THE ASSIGNED TASK********");
				System.out.println(AssignList.remove(i));
			}else {
				System.out.println(" ******** The Id entered does not match to any of the assigned tasks*********");
				break;
			}
		}
	}
}
