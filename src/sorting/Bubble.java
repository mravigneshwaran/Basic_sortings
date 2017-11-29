package sorting;

public class Bubble {
    
    //bubblesort logic
    public static void bubble(int[] array){
        int n= array.length;
        int k;
        
        for(int m=n; m>=0; m--){
            for(int i=0; i<n-1; i++){
            k = i+1;
            if(array[i] > array[k]){
                swap(i,k,array);
            }
        }
        printNum(array);
        }
    }
    
    //swapping logic
    public static void swap(int i, int j,int[]arr){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    //print input from given array list
    public static void printNum(int[] input){
        for(int i=0; i<input.length; i++){
            System.out.print(input[i]+ ",");
        }
        System.out.println("\n");
    }
 
    public static void main(String[] args) {
        int[] input = {4,9,3,5,2,0,1};
        bubble(input);
    }
    
}
