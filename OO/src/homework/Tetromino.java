package homework;

public class Tetromino {
	Cell[] cells;
	Tetromino(){
		cells=new Cell[4];
	}
	void drop(){
		for(int i=0;i<cells.length;i++){
			cells[i].row++;
		}
	
		
		
		
	}
	void moveLeft(){
		for(int i=0;i<cells.length;i++){
			cells[i].col--;
		}
	}
	void moveRight(){
		for(int i=0;i<cells.length;i++){
			cells[i].col++;
		}
	}
	void print(){
		for(int i=0;i<cells.length;i++){
			String str=cells[i].row+","+cells[i].col;
			System.out.println(str);
		}
	}
	
	
}