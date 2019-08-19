package Entities;

public class Assign {
private long Id_Assign;
private Members member;
private Tasks task;

public Assign() {
	super();
	// TODO Auto-generated constructor stub
}

public Assign(long id_Assign, Members member, Tasks task) {
	super();
	Id_Assign = id_Assign;
	this.member = member;
	this.task = task;
}

public long getId_Assign() {
	return Id_Assign;
}

public void setId_Assign(long id_Assign) {
	Id_Assign = id_Assign;
}

public Members getMember() {
	return member;
}

public void setMember(Members member) {
	this.member = member;
}

public Tasks getTask() {
	return task;
}

public void setTask(Tasks task) {
	this.task = task;
}

public String Show() {
	return " Id_Assign ="+ Id_Assign +"\n"+
	       " Members ="+ member.toString() +"\n"+
	       "Tasks ="+ task.toString() +"\n";
}
}
