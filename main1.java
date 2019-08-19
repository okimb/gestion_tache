package Entities;
import java.util.ArrayList;
import java.util.Scanner;

import Entities.Members;
import Entities.Tasks;
import Entities.Assign;


public class main1 {
	
	ArrayList<Members>MembersList=new ArrayList<>();
	ArrayList<Tasks>TasksList=new ArrayList<>();
	ArrayList<Assign>AssignList=new ArrayList<>();
	
	static Scanner sc=new Scanner(System.in);

	//AddMembers
	public void AddMember() {
		System.out.println(" WELCOME TO THE SECTION OF ADDING MEMBERS  ");
		System.out.println("   START INSERTING MEMBERS INFORMATIONS    ");
		System.out.println(" ******************************************");
		
		System.out.println("*********     Member's Id         ***********");
		int id_member=sc.nextInt();
		sc.nextLine();
		
		System.out.println("*********     Member's Name       ***********");
		String Name=sc.next();
		
		System.out.println("*********     Member's Surname    ***********");
		String Surname=sc.next();
		
		System.out.println("*********     Member's Adresse    ***********");
		String adresse= sc.next();
		
		System.out.println("*********     Member's Email      ***********");
		String email= sc.next();
		
		
		System.out.println("*********   Member's Phone number ***********");
		String Telephone= sc.next();
		
		Members membre=new Members(id_member, Name, Surname, adresse, email, Telephone);
		MembersList.add(membre);
	}
	
	
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
					String Name_member=sc.next();
					MembersList.get(i).setName_Member(Name_member);
					
					System.out.println("********* INSERT THE SURNAME OF MEMBER ********");
					String Surname=sc.next();
					MembersList.get(i).setSurname_Member(Surname);
					
					System.out.println("******* INSERT THE ADRESSE OF MEMBER **********");
					String adresse=sc.next();
					MembersList.get(i).setAdresse(adresse);
					
					System.out.println("********* INSERT THE EMAIL OF MEMBER **********");
					String email=sc.next();
					MembersList.get(i).setEmail(email);
					
					System.out.println("********* INSERT THE NUMBER PHONE *************");
					String telephone=sc.next();
					MembersList.get(i).setN_Phone(telephone);
				}else {
					System.out.println(" The Id_Member does not to any member to be edited");
					break;
				}
			}
		}
		
		//Showing up all the members
		public void ShowMembers() {
			for(int i=0; i<MembersList.size(); i++) {
				
				System.out.println("********** COMPLETE LIST OF MEMBERS **********");
				System.out.println("----------------------------------------------");
				System.out.println(MembersList.get(i).toString());
			}
		}
		
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
		
		//ADDING TASKS
		public void AddTask() {
			System.out.println("----WELCOME TO THE SECTION OF ADDING TASKS----");
			System.out.println("*****START INSERTING TASKS INFORMATIONS*******");
			System.out.println("                                              ");
			
			System.out.println("*****************Task's ID********************");
			int id_task=sc.nextInt();
			
			System.out.println("*****************Task's Name******************");
			String Name=sc.next();
			
			System.out.println("************Task's Description****************");
			String description=sc.next();
			
			System.out.println("***********Task's Start_Date******************");
			String Start=sc.next();
			
			System.out.println("***********Task's End_Date********************");
			String End=sc.next();
			
			System.out.println("***********Task's Status**********************");
			String status=sc.next();
			
			Tasks task=new Tasks(id_task, Name, description, Start, End, status);
			TasksList.add(task);
		
		}
		//DELETING TASKS
		public void deleteTask(long id) {
			System.out.println("******* Warning: Do you really wanna delete this task *******");
			System.out.println("****** Insert the Id of Task to delete from the system ******");
			for(int i=0; i<TasksList.size(); i++) {
				if (TasksList.get(i).getId_Task()==id) {
					TasksList.remove(i);
				}else
				{
					System.out.println("**** This task does not match with the Id or not exist*****");
					break;
				}
			}
		}
		
		//EDITING TASKS
		public void EditTasks() {
			System.out.println("***** WELCOME TO THE SECTION OF EDITING TASKS *********");
			     System.out.println("***** INSERT THE ID OF TASK TO EDIT ********");
			     long Id=sc.nextLong();	
			     sc.nextLine();
			     for(int i=0; i<TasksList.size(); i++) {
			    	 if(TasksList.get(i).getId_Task()==Id) {
			    		 
			    		 System.out.println(" ********** INSERT THE NAME OF TASKS ************");
			    		 String Name=sc.nextLine();
			    		 TasksList.get(i).setName_Task(Name);
			    		 
			    		 System.out.println("*********** INSERT THE DESCRIPTION OF TASKS*******");
			    		 String Description=sc.nextLine();
			    		 TasksList.get(i).setDescription_Task(Description);
			    		 
			    		 System.out.println("************ INSERT START DATE OF TASK ***********");
			    		 String Start=sc.nextLine();
			    		 TasksList.get(i).setStart_Date(Start);
			    		 
			    		 System.out.println("*********** INSERT END DATE OF TASK **************");
			    		 String End=sc.nextLine();
			    		 TasksList.get(i).setEnd_Date(End);
			    		 
			    		 System.out.println("*********** INSERT THE STATUS OF TASK ************");
			    		 String status=sc.nextLine();
			    		 TasksList.get(i).setStatus_Task(status);
			   
			    	 }
			    	 else {
			    		 System.out.println("************ This Id does not match with any task to be edited********");
			    		 break;
			    	 }
			     }
		
		}
		
		//Showing all the tasks
		public void ShowTasks() {
			for(int i=0; i<TasksList.size();i++) {
				System.out.println("******* LIST OF THE ALL TASKS ********");
				System.out.println("                                      ");
				System.out.println(TasksList.get(i).toString());
			}
		}
		
		//Show a task
		public void ShowTask(long id) {
			for(int i=0; i<TasksList.size(); i++) {
				if(TasksList.get(i).getId_Task()==id) {
					System.out.println("***** Task Informations ******");
					System.out.println("                              ");
					System.out.println(TasksList.get(i).toString());
				}else {
					System.out.println("**** This task does not exist ******");
					break;
				}
			}
		}
		
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
		
		//Searching Task by Status
		public void SearchTaskByStatu() {
			System.out.println("***** Enter a word for the research of the status of task ******* ");
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
		
		//Show up all the assigned tasks to the members
		
		public void ShowAssignedTasks() {
			for(int i=0; i<AssignList.size(); i++) {
				
				System.out.println("**********LIST OF ASSIGNED TASKS **********");
				
				System.out.println(AssignList.get(i).Show());
			}
		}
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
		
		
		public void Interface() {
			System.out.println("*********************>>MANAGEMENT OF TASKS TO MEMBERS<<***********************");
			System.out.println("                                                                              ");
			System.out.println("1:                       SECTION MEMBERS                                      ");
			System.out.println("2:                Section Members: Add Members                           *****");
			System.out.println("3:                Section Members: Delete Members                        *****");
			System.out.println("4:                Section Members: Edit Members                          *****");
			System.out.println("5:                Section Members: Show all Members                      *****");
			System.out.println("6:                Section Members: Show One Members                      *****");
			System.out.println("7:                       SECTION TASKS                                        ");
			System.out.println("8:                Section TASKS: Add TASKS                               *****");
			System.out.println("9:                Section TASKS: Delete TASKS                            *****");
			System.out.println("10:               Section TASKS: Edit TASKS                              *****");
			System.out.println("11:               Section TASKS: Show all TASKS                          *****");
			System.out.println("12:               Section TASKS: Show One TASK                           *****");
			System.out.println("13:                      SECTION ASSIGN                                       ");
			System.out.println("14:               Section ASSIGN: Assign TASKS                           *****");
			System.out.println("15:               Section ASSIGN: Delete Assign TASKS                    *****");
			System.out.println("16:               Section ASSIGN: Search Assign  by Status TASKS         *****");
			System.out.println("17:               Section ASSIGN: Show all Assigned TASKS                *****");
			System.out.println("18:               Section ASSIGN: Show Assigned One TASK to Member      *****");
			
			
			
		                     	System.out.println("         tapez votre choix           ");
			
		}
		
	
		public void Operation() {
			 
			int fin=1;
			do {  
				
				//Interface();
				 int key =sc.nextInt()	;
		    	switch(key) {
				
				case 1:
					System.out.println("**************************SECTION MEMBERS :***********************************");
					break;
					
				case 2:
					System.out.println("2:                Section Members: Add Members                           *****");
					AddMember();
					break;
					
				case 3:
					System.out.println("3:                Section Members: Delete Members                        *****");
					DeleteMembers(sc.nextLong());
					break;
					
				case 4:
					System.out.println("4:                Section Members: Edit Members                          *****");
					EditMembers();
					break;
				case 5:
					System.out.println("5:                Section Members: Show all Members                      *****");
					ShowMembers();
					break;
			    
				case 6:
					System.out.println("6:                Section Members: Show One Members                      *****");
					ShowOne(sc.nextLong());
					break;
				case 7:
					System.out.println("7:                       SECTION TASKS                                        ");
					break;
				case 8:
					System.out.println("8:                Section TASKS: Add TASKS                               *****");
					AddTask();
					break;
				case 9:
					System.out.println("9:                Section TASKS: Delete TASKS                            *****");	
					deleteTask(sc.nextLong());
					break;
				case 10:
					System.out.println("10:               Section TASKS: Edit TASKS                              *****");	
					EditTasks();
					break;
				case 11:
					System.out.println("11:               Section TASKS: Show all TASKS                          *****");
					ShowTasks();
					break;
				case 12:
					System.out.println("12:               Section TASKS: Show One TASK                           *****");
					ShowTask(sc.nextLong());
					break;
				case 13:
					System.out.println("13:                      SECTION ASSIGN                                       ");
					break;
				case 14:
					System.out.println("14:               Section ASSIGN: Assign TASKS                           *****");
					Assign_task();
					break;
				case 15:
					System.out.println("15:               Section ASSIGN: Delete Assign TASKS                    *****");
					DeleteAssigned(sc.nextLong());
					break;
				case 16:
					System.out.println("16:               Section ASSIGN: Search Assign  by Status TASKS         *****");
					SearchTaskByStatu();
					break;
				case 17:
					System.out.println("17:               Section ASSIGN: Show all Assigned TASKS                *****");
					ShowAssignedTasks();
					break;
				case 18:
					System.out.println("18:               Section ASSIGN: Show Assigned One TASK to Member      *****");
					ShowAffectedTaskToMember();
					break;
				case 19:
					break;
				}
		    	System.out.println("voulez-vous continuer? si oui Tapez un chiffre different de 0");
				fin=sc.nextInt();
		    }while(fin!=0);
			
		}
		
		// Execution of the Application
		
		public static void main(String[]args) {
				main1 m=new main1();
				m.Interface();
				m.Operation();
			
				
		}
}
