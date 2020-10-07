package ddg;

/**
 * Program that shows a moving duck. Cute
 *
 */
public class Main {

	public static void main(String[] args) {
		

		Model m = new Model();
		Viewer view = new Viewer(m);
		m.setv(view);
		Controller c = new Controller(m);
		view.registerListener(c);
		
        
	}

}
