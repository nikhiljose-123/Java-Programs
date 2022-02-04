import java.util.ArrayList;
import java.util.Comparator;
public class ArrayListSortDemo {
     public static void main(String [] args) {
    	 ArrayList<String> languages=new ArrayList();
    	 
    	 languages.add("Java");
    	 languages.add("Python");
    	 languages.add("c language");
    	 languages.add("Ruby");
    	 
    	 System.out.println("languages are"+languages);
    	 languages.sort(Comparator.naturalOrder());
    	 System.out.println("languages are"+languages);
    	 
    	 
    	 
    	 
     }

}
