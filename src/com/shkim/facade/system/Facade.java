package com.shkim.facade.system;

public class Facade {
	private CentralProcessingUnit centralProcessUnit;
	private HardDrive hardDrive;
	private Memory memory;
	
	public Facade() {
		System.out.println("Facade - Facade()");
		centralProcessUnit = new CentralProcessingUnit();
		hardDrive = new HardDrive();
		memory = new Memory();
	}
	
	public void process() {
		System.out.println("Facade - process()");
		centralProcessUnit.execute();
		hardDrive.read();
		memory.load();
	}
}
