class sortArray{
    public static void Sort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        }
    }
}
public class Demo074 {
    public static void main(String[] args) {
        int[] arr ={10,2,5,7,6};
        sortArray.Sort(arr);
        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
