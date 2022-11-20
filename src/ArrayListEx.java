import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Tesla");
		cars.add("BMW");
		cars.add("Nexon");
		Collections.sort(cars);
		for(String i:cars) {
			System.out.println(i);
		}
	}

}
