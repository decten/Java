package finaltest;

public interface Serachable {
	void serach(String url);
	public default void start() {
		System.out.println("검색을 시작합니다");
	}
}
