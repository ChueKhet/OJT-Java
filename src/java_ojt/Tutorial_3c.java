package java_ojt;
import java.util.*;
public class Tutorial_3c {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Python");
		arrayList.add("JAVA");
		arrayList.add("PHP");
		arrayList.add("Perl");
		arrayList.add("C#");
		
		// Convert ArrayList to array
		String[] array = arrayList.toArray(new String[arrayList.size()]);
		
		System.out.println("Array: " + Arrays.toString(array));
	}

}
