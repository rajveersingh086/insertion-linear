package pattern;
import java.util.*;

public class insertionlinearSS {
    public static void sort(int[] numbers, boolean asc){
        for(int i= 1; i<numbers.length;i++){
            int currentNumber= numbers[i];
            int j=i - 1;
            while(j>= 0 && (asc? numbers[j]>currentNumber:numbers[j]<currentNumber)){
                numbers[j+1]= numbers[j];
                j--;
            }
            numbers[j+1]= currentNumber;
        }
    }

    public static int search(int[]numbers,int noSearch) {
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]==noSearch){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]numbers= {4,2,2,3,1,7};
        sort(numbers, true);
        System.out.println("The sorted array in ascending order is:");
        System.out.println(Arrays.toString(numbers));
        sort(numbers, false);
        System.out.println("The sorted array in descending order is:");
        System.out.println(Arrays.toString(numbers));

        int numberToSearch= 3; //linear search number
        int index=search(numbers,numberToSearch);
        if(index== -1) {
            System.out.println("The number"+numberToSearch+"is not in the array");
        }else{
            System.out.println("The number "+numberToSearch +"is at index"+ index +"in the array");
        }

    }
}
