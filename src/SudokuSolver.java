public class SudokuSolver {

	UserInterface gui;

	public SudokuSolver () {
		gui = new UserInterface();

		gui.create();
	}

	public static void main (String[] args) {
		new SudokuSolver();
	}

}