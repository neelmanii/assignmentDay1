package com.ten.assignment;

public class Computer {

	private Monitor monitor;
	private Keyboard keyboard;
	private Mouse mouse;
	private CPU cpu;
	
	public Computer( Monitor monitor,Keyboard keyboard,Mouse mouse,CPU cpu) {
		this.setMonitor(monitor);
		this.keyboard=keyboard;
		this.mouse=mouse;
		this.cpu=cpu;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
}
