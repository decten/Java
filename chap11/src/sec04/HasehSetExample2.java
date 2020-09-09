package sec04;

import java.util.HashSet;
import java.util.Set;

class Element{
	String value;
	
	public Element(String value) {
		this.value= value;
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Element) {
			String s = ((Element)o).value;
			return s.equals(value);
		}
		return false;
	}
	
	public String toString() {
		return "Element[" + value + "]"; 
	}
}

public class HasehSetExample2 {
	public static void main(String[] args) {
		Set<Element> hs = new HashSet<>();
		hs.add(new Element("¾È³ç"));
		hs.add(new Element("¸Þ·Õ"));
		System.out.println(hs.size());
		System.out.println(hs);
	}

}
