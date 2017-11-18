import java.util.Scanner;

public class money{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int in = 0;
		in = scan.nextInt();
		System.out.println(Coin(in));
	}
	public static int Coin(int val){
		int[] coin = {500,100,50,10,1};
		int check=0;
		int i = 0;
		for(i=0;i<5;i++){
			if(val-coin[i]>0){
				check=1;
				break;
			}else if(val-coin[i]==0){
				check=2;
				break;
			}
		}
		if(check==1){
			return 1+ Coin(val-coin[i]);
		}else if(check==2){
			return 1;
		}else{
			return 0;
		}
	}
}