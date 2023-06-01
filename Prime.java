package week1.day1;

public class Prime {
	public static void main(String[] args) {
		int n = 20;
		boolean flag = false;
		for(int i=2;i<n/2;i++) {
		
			if (n % i == 0) {
				flag = true;
			}
		}
		if (flag==false) {
			System.out.println("prime number");
			
		}
			
			
			else {
				System.out.println("not the prime number");	
			}
				
			
		}
		
			
	

	}



