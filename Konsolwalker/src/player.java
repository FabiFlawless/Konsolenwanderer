
public class player {
	private char[] key;
	private int currentRow;
	private int currentCol;
	private int counter;
	
	
	
	player(Spielfeld f1){
		key = new char[4];
		key[0] = '^';
		key[1] = '>';
		key[2] = 'v';
		key[3] = '<';
		currentRow = 4;
		currentCol = 4;
		counter = 0;
		f1.getField()[currentRow][currentCol] = key[counter];
		
	}
	public void right(Spielfeld f1) {
		
		if(counter == 0) {
			counter = 1;
		}
		else if(counter == 1) {
			counter = 2;
			
		}
		else if(counter == 2) {
			counter =3;
			
		}
		else if(counter == 3) {
			counter = 0;
			
		}
		f1.getField()[currentRow][currentCol] = key[counter];
		f1.printfield();
	}
	
public void left(Spielfeld f1) {
		
		if(counter == 0) {
			counter = 3;
		}
		else if(counter == 1) {
			counter = 0;
			
		}
		else if(counter == 2) {
			counter =1;
			
		}
		else if(counter == 3) {
			counter = 2;
			
		}
		f1.getField()[currentRow][currentCol] = key[counter];
		f1.printfield();
	}
	
	
	public void forward(Spielfeld f1) {
		
		
		f1.getField()[currentRow][currentCol] = ' ';
		if(counter == 0) {
			currentRow -=1 ;
			
		}
		else if(counter == 1) {
			currentCol +=1 ;
			
		}
		
		else if(counter ==2) {
			currentRow +=1 ;
		}
		
		else if(counter == 3) {
			currentCol -=1;
		}
		
		if(f1.getField()[currentRow][currentCol]=='#') {
			currentRow = 4;
			currentCol = 4;
			counter = 0;
			f1.getField()[currentRow][currentCol] = key[counter];
			System.out.println("Rand erreicht, Spieler wurde zurückgesetzt");
			f1.printfield();
			
			}
		else {
			f1.getField()[currentRow][currentCol] = key[counter];
			f1.printfield();
		}
		
		
		
	}
	
}
