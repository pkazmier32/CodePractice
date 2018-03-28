import java.util.ArrayList;
import java.util.List;

public class Runit {

    public static void main( String[] args )
    {
    	BinarySearchTree bst = new BinarySearchTree();
    	
    	List<Integer> startList = new ArrayList<Integer>();
    	
    	startList.add(10);
    	startList.add(5);
    	startList.add(20);
    	startList.add(15);
    	
    	startList.forEach(item->System.out.println(item));
    	
    	startList.forEach(item->bst.insert(item));
    	
    	// Should print items in order
    	bst.traverseInOrder();

    }
}