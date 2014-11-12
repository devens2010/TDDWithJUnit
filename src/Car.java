public class Car {

	private String color;
	private int speed;
	private int maxSpeed;
	private int minSpeed;

	
	/**
	 * Creates a new car instance
	 * @param color
	 * @param maxSpeed
	 */
	public Car(String color, int maxSpeed, int minSpeed){
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.minSpeed = minSpeed;
		this.speed = 0;
	}
	
	/**
	 * Return the current speed of the car.
	 */
	public int getSpeed(){
		return(this.speed);
	};
	
	/**
	 * Accelerates the car up to the maximum amount
	 * set in the object constructor.
	 * @param amount	The amount the car will accelerate
	 */
	public void accelerate(int amount){
		int limit = this.maxSpeed - this.speed;
		if(amount >= limit){
		  this.speed = limit;
		}else{
		  this.speed+= amount;
		}
	}
	
	public void decelerate(int amount){
		int stopped = this.minSpeed + this.speed;
		if(amount >= stopped){
			this.speed = 0;
		}else{
			this.speed-= amount;
		}
	}
	
	/**
	 * Displays the object as a string in the format
	 * "Color: red, Speed: 100"
	 */
	public String toString(){
		return("Color: Red, Speed: 0");
	}

}
