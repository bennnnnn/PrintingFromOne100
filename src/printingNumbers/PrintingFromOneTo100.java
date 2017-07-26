package printingNumbers;
/**
 * 
 * @author binalfew
 *
 */

public class PrintingFromOneTo100 {
	
    public static void main(String args[]){
		
		int count; // holds numbers from 1 to 100
 
		for(count=1;count<=100;count++){
			 
			if(count % 3==0 && count %5 ==0){
				System.out.println( "\tFizzBuzz");
			}
			else if(count % 5==0){
				System.out.println( "\tBuzz");
			}
			else if( count %3==0){
				System.out.println( "\tFuzz");
			}
				else 
					System.out.println( "\t"+count);
				
			}
			 
		}

}
