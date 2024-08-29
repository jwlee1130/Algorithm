package DFS;

public class map {

	
	public static StringBuffer map[] = new StringBuffer[25];	
	static {
		map[0]=new StringBuffer("    1   2   3   4   5   6   7   8   9  10   11  ");
		map[1]=new StringBuffer("  ┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐");
		for(int i = 2; i < 22; i++) {
			if(i%2 != 0)
				map[i]=new StringBuffer("  ├───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤");
			else
				{if(i/2<10)
					map[i]=new StringBuffer((i/2)+" │   │   │   │   │   │   │   │   │   │   │   │");
				 else
					 map[i]=new StringBuffer((i/2)+"│   │   │   │   │   │   │   │   │   │   │   │");}
			map[22]=new StringBuffer("11│   │   │   │   │   │   │   │   │   │   │   │");
			map[23]=new StringBuffer("  └───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘");
		}	
	}
	
	public static void DrawMap() {
		map[2].setCharAt(3, 'a');

		for(int i=0; i<24;i++)
			System.out.println(map[i]);
	}
	
	public static void main(String []args) {
		DrawMap();
		
	}
}
