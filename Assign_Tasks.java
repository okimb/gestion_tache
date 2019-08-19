package Contructor_Assign;

import java.util.ArrayList;
import java.util.Scanner;

import Entities.Assign;
import Entities.Members;
import Entities.Tasks;

public class Assign_Tasks {
	
	ArrayList<Assign>AssignList=new ArrayList<>();

	ArrayList<Members>MembersList=new ArrayList<>();
	
	ArrayList<Tasks>TasksList=new ArrayList<>();
	
	static Scanner sc=new Scanner(System.in);
	
	//Assign Tasks-to-Members
	public void Assign_task() {
		
		System.out.println("************* INSERT THE ID OF ASSIGN TASK ***********");
		long Id_assign=sc.nextLong();
		sc.nextLine();
		
		//Assigning Tasks to Members
		
		System.out.println("***********INSERT THE Id of Task to be assigned to a member***********");
		long Id_task=sc.nextLong();
		Tasks task=new Tasks();
		
		for(int i=0; i<TasksList.size(); i++) {
			if(TasksList.get(i).getId_Task()==Id_task) {
				
	
	            task.setId_Task(TasksList.get(i).getId_Task());
				task.setName_Task(TasksList.get(i).getName_Task());
				task.setDescription_Task(TasksList.get(i).getDescription_Task());
				task.setStart_Date(TasksList.get(i).getStart_Date());
				task.setEnd_Date(TasksList.get(i).getEnd_Date());
				task.setStatus_Task(TasksList.get(i).getStatus_Task());
			}
		}
		
		// Assigning Members to tasks
		
		System.out.println("*********** INSERT THE MEMBER'S ID ********************");
		long Id_member=sc.nextLong();
		sc.nextLine();
		Members mem=new Members();
		
		for(int i=0; i<MembersList.size(); i++) {
			if(MembersList.get(i).getId_Member()==Id_member) {
				
				mem.setId_Member(MembersList.get(i).getId_Member());
				mem.setName_Member(MembersList.get(i).getName_Member());
				mem.setSurname_Member(MembersList.get(i).getSurname_Member());
				mem.setAdresse(MembersList.get(i).getAdresse());
				mem.setEmail(MembersList.get(i).getEmail());
				mem.setN_Phone(MembersList.get(i).getN_Phone());
			}
		}
		
		Assign assign= new Assign(Id_assign, mem, task);
		AssignList.add(assign);
	}
}
