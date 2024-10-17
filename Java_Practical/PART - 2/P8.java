public class P8 {
    public static int array_count(int arr[],int count) {
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == 9) {
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,9};
        int arr2[] = {1,9,9};
        int arr3[] = {1,9,9,3,9};

     System.out.println("9 repeates : " +array_count(arr1,0) + " times");   
     System.out.println("9 repeates : " + array_count(arr2, 0)+ " times");   
     System.out.println("9 repeates : " +array_count(arr3, 0)+ " times");  
     System.out.println("ID : 23DCS078_KRISH PATEL");         
    } 
}
