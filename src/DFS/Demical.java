package DFS;

public class Demical {

	
		static int jari= 1;
		
		public Demical() {}
		
		public void demical(int jari,int a){
			
			if(4==jari) { // 자리수 4개 되면 끝
				if(demicalNum(a)) //자리수가 4개일때 소수냐>?
					System.out.println(a);
			}
			for(int i=1;i<=10;i++) { //1~10 붙여 
				if(i%2==0) {// 짝수 붙였으면 걸러
					continue; //짝수면 소수 일 수 없음
				}
				
				if(demicalNum(a*10+i)) { //홀수 일때  2 3 5 7  21 23 25 27 29 검사 
					demical(jari+1,a*10+i); //4자리수 될때까지 사 맞으면 10의 자리니까 자리수 2(1+1),i 더한거만큼재귀)
				}
			}
		
				
			
			
	 	}
		
		public boolean demicalNum(int n) {
			for(int i=2; i<=n/2; i++) {
				if(n%i==0) 
					return false;
			}
			return true;
		}
	
	public static void main(String[] args) {
		Demical d = new Demical();
		d.demical(1, 2);
		d.demical(1, 3);
		d.demical(1, 5);
		d.demical(1, 7);
	}

}
