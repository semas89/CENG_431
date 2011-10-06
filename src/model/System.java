package model;

import java.util.ArrayList;

public class System implements ISystem{

	ArrayList<Project> projectList;
	
	public System() {
		projectList = new ArrayList<Project>();
	}
	
	@Override
	public void addProject(Project project) {
		if(!findProject(project))
			projectList.add(project);
		else
		{
			java.lang.System.err.println("Project already in list");
		}
	}

	@Override
	public void removeProject(Project project) {
		if(!findProject(project))
			projectList.remove(project);
		else{
			java.lang.System.err.println("Project doesn't exist in list");
		}
	}

	@Override
	public void updateProject(Project project) {
		//if(!findProject(project))
		
	}

	public Boolean findProject(Project project){
		if(projectList.contains(project))
			return true;		
		
		return false;
		
	}
	
}
