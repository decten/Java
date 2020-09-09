package sec02;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME=0;
	
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void repair() {
		System.out.println("��� �����մϴ�.");
	}
	
	static void rest() {
		System.out.println("��� �ʱ�ȭ�Ѵ�.");
	}
}
