/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 4. Your pseudocode algorithm here

for( 6 lines )
	for( 6 stars per line)
		print("*")
		print new line

*/
// for each line print 6 stars
// repeat each line of 6 stars 6 times
public class P7_NestedLoopBox {

	
	public static void main(String[] args) {
		for(int lines = 6; lines >= 1; lines--) {
			for(int stars = 6; stars >= 1; stars--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
