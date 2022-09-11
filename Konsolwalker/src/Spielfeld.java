
public class Spielfeld {

	private char field[][];

	Spielfeld(){
	field = new char[10][10];
	}
	
	public void buildfield() {
		for(int i = 0; i<field.length;i++) {
			field[i][0] = '#';
			field[i][9] = '#';
			
			for(int t = 1; t < (field.length-1);t++) {
				field[i][t] = ' ';
				field[0][t] = '#';
				field[9][t] = '#';
			}
		}
		
		
	
	}
	
	public void printfield() {
		
		for(int i = 0; i<field.length;i++) {	
			for(int j = 0; j<field.length; j++) {
					
					System.out.print(field[i][j]);
				}
			System.out.println();
		}
		
		
	}

	public char[][] getField() {
		return field;
	}

	public void setField(char[][] field) {
		this.field = field;
	}
	
	
}

	

