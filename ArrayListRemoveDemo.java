import java.util.ArrayList;
public class ArrayListRemoveDemo {
	public static void main(String [] args) {
		ArrayList <String> arrayList = new ArrayList();
		arrayList.add("dog");
		arrayList.add("cat");
		arrayList.add("elephant");
		System.out.println("The animals are"+arrayList);
		ArrayList <String> oops = new ArrayList();
		oops.add("C language");
		oops.add("java language");
		System.out.println("The subjects are "+oops);
		oops.removeAll(oops);
		System.out.println("The subjects are "+oops);
		arrayList.clear();
		System.out.println("The animals are"+arrayList);
		
		
		
		
	}
	

}
