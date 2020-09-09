package finaltest;

public abstract class TV {
	private int volume;
	
	public abstract void turnOn();
	public abstract void turnOff();
	
	public void setVolume(int volume) {
		this.volume=volume;
		System.out.println("º¼·ý: "+ this.volume);
	}
}
