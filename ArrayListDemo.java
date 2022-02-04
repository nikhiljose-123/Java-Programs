import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
	

	

		public static void main(String[] args) {
			ArrayList<Integer> arrayList = new ArrayList<>();
			arrayList.add(10);
			arrayList.add(20);
			arrayList.add(5);
			arrayList.add(0, 1);
			System.out.println("ArrayList 1:"+arrayList);
			ArrayList<Integer> arrayList2 = new ArrayList<>();
			arrayList2.add(100);
			arrayList2.add(200);
			System.out.println("ArrayList 2:"+arrayList2);
			//arrayList2.addAll(arrayList);
			arrayList2.addAll(1, arrayList);
			System.out.println("ArrayList 2 after addAll():"+arrayList2);
			//System.out.println(arrayList.get(0));
			Iterator<Integer> iterator = arrayList.iterator();
			System.out.println("Printing Using Iterator");
			while(iterator.hasNext()) {
				int element = iterator.next();
				System.out.println(element);
			}
			System.out.println("Printing Using For Loop");
			for(int i=0;i<arrayList2.size();i++) {
				System.out.println(arrayList2.get(i));
			}
			

		}

	}


