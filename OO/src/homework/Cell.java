package homework;

public class Cell {
	int row;
	int col;
	Cell(int row,int col){
		this.row=row;
		this.col=col;
	}
	void drop(){
		row++;
	}
	String getCellInfo(){
		String str=row+","+col;
		return str;
	}

}
