package Test;
import java.util.ArrayList;
import java.util.List;

class Test{
	public static void main(String[] args) {
		List fail = new ArrayList();
		fail.add("Un");
		fail.add("Deux");
		fail.add("Trois");
		fail.add("Quarte");
		for (int i=0 ;i<fail.size();i++) {
			String elem=(String)fail.get(i);
			if (elem.startsWith("D")) {
				fail.remove(elem);
			}
		}
	}
}
