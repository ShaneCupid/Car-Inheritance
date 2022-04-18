
public abstract class Car {
	
String name;	
double speed;
String engine;
String ownership;

void pushPedal() {
	System.out.println("Vrooooom");
}



public Car(String name, double speed, String engine, String ownership) {
	super();
	this.name = name;
	this.speed = speed;
	this.engine = engine;
	this.ownership = ownership;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSpeed() {
	return speed;
}
public void setSpeed(double speed) {
	this.speed = speed;
}
public String getEngine() {
	return engine;
}
public void setEngine(String engine) {
	this.engine = engine;
}

public String getOwnership() {
	return ownership;
}
public void setOwnership(String ownership) {
	this.ownership = ownership;
}

@Override
public String toString() {
	return name + speed + engine + ownership;

}
public abstract double speed();
}
