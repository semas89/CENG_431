package controller;

import model.ISystem;

public class Controller {

	ISystem model;
	IView view;
	
	public Controller(ISystem system, IView view) {
		this.model = system;
		this.view = view;
	}

}

