
public class Lift {
	
public static void main(String[] args) {
		 
int lift[]={8,7,10,5,1,3};
		 
int user=2,now=0,max=0,min=10;
		
 String dir[]={"down","up","down","up","up","down"};
		
 String s="up";
		
 for(int x=0;x<=lift.length-1;x++)
		
 {


			 if((dir[x]==s)&&(lift[x]>=now))
			 {
					if(s=="up"){
						         if(lift[x]<=user){
							     if(lift[x]>max)
							 {
								 max=lift[x];
								
							 }
							 }} 
					
					
				if(s=="down"){
				                if(lift[x]>=user) {
				                    if(lift[x]<min)
									 {
										 min=lift[x];
										
									 }
				               
				                      	}
				                     }
				 
					   
				 }}      if(s=="up"){
		                   System.out.println ("up"+"=" +max);}
		                   if(s=="down"){
		                    System.out.println ("down"+"=" +min);}
			                 
			                 
	
	}}                  


