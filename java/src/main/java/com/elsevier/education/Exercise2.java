package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {
		
		private Engine engine = new Engine();
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public class Engine{
		public void spinwheels();
	
	}
	public class ElectricEngine extends Engine {
		public void spinWheels() {
			// no-op for now
		}
	public class GasEngine extends Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
		

}
