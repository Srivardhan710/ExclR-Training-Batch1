public class Demo064 {
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50};
        
        if(array.length >= 0) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
            System.out.println("Array after swapping 1st and last element:");
            for(int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Array does not have enough elements.");
        }
    }
}