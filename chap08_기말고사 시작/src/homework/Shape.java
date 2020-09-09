package homework;

public interface Shape {
	public static final double PI = 3.14;

	public abstract void draw();

	default double findArea() {
		return 0.0;
	}
}
