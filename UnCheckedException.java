
class UnCheckedException {  
   public static void main(String args[]) {
	try{
	   int arr[] ={3,6,33,8,4};
	   System.out.println(arr[6]);
	}
        catch(ArrayIndexOutOfBoundsException e){
	   System.out.println("Index doesn't Exit");
	}
   }
}