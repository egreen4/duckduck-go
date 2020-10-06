package calc;

public class Main {

	public static void main(String[] args) {
		
		Model m = new Model();
		Viewer view = new Viewer(m);
		Controller c = new Controller(m, view);
		
		view.registerListener(c);
		
        
	}

}
