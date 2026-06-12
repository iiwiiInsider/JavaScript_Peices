
public class App {

	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		
		plant2.grow();
		
		tree.ShedLeaves();	
		
		//plant2.ShedLeaves(); // This will cause a compile-time error because plant2 is of type Plant, which does not have the ShedLeaves method.
	
			doGrow(tree);
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}
}
