package prob.object.basic;

public class Tv {
	String color;
	boolean power;
	int channel;
	
	public Tv() {
		this.color = "black";
		this.power = false;
		this.channel = 0;
	}
	
	public void power() {
		power = !power;
	}
	
	public void channelUp()	{
		channel += 1;
	}
	
	public void channelDown()	{
		channel -= 1;
	}
	
	public void print() {
		System.out.println("color :" + color + "\tpower:" + power + "\tchannel:" + channel);
	}
}
