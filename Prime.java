class Prime{
	
	public static void main(String args[]){
		Prime_cal p = new Prime_cal(1,100);
		p.series();
	}
}

class Prime_cal{
	int m;
	int n;
	
	Prime_cal(int m, int n){
		this.m = m;
		this.n = n;
	}
	
	public boolean isPrime_cal(int n){
		if(n==2){
			return true;
		}else if(n == 1 || (n&1)==0){
			return false;
		}else{
			for(int i=3; i<=(int)Math.sqrt(n); i+=2){
				if(n%i==0){
					return false;
				}
			}
		}
		return true;
	}
	
	public void series(){
		System.out.println("Prime_cals number from " + m + " to " + n + " :");
		for(int i=m; i<=n; i++){
			if(isPrime_cal(i)){
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
}
	