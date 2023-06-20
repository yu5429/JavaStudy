package class05;

public class car {
	String color;
	int maxSpeed;
	int speed;
	String company;
	String model ;
	
	
	public car(String color, int maxSpeed,int speed,String company, String model) {
		this.color=color;
		this.maxSpeed=maxSpeed;
		this.speed=speed;
		this.company=company;
		this.model=model;
		
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	
	void drive() {
		System.out.println("현재속도 "+this.speed+"km");
	}
	void speedUp() {
		this.speed = this.speed+20;
		System.out.println("현재속도 "+this.speed+"km");
	}
	void speedDown() {
		this.speed = this.speed-20;
		System.out.println("현재속도 "+this.speed+"km");
		if(this.speed == 0) {
			stop();
		}
	}
	void stop() {
		this.speed=0;
		System.out.println(" 정차했습니다.");
	}
	void turnLeft(){
		System.out.println(this.model+" 좌회전");
	}
	void turnRight() {
		System.out.println(this.model+" 우회전");
	}
	void myCarStatus() {
		String status = "색상:"+this.color+"\n"+
				"최고속력:"+this.maxSpeed+"\n"+
				"제조사:"+this.company+"\n"+
				"모델명:"+this.model;
		System.out.println(status);
	}
	
}
