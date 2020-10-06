package ddg;

public class Main {

	public static void main(String[] args) {
		
		Model m = new Model(200,50);
		Viewer view = new Viewer(m);
		Controller c = new Controller(m, view);
		view.registerListener(c);
		
        
	}

}
