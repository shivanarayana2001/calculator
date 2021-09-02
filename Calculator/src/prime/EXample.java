package prime;

public class EXample {
	public int Prime(int n) {
		
		
		int i,m=0,flag=0;   
		  m=n/2;      
		  if(n==0||n==1){  
		   return 1;      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     return 0;     
		    }      
		   }      
		   if(flag==0)  { return 1; }  
		  }//end of else  
		  return 1;
		
	}

}
