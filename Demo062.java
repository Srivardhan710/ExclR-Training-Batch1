public class Demo062 {
    public static void main(String[] args) {
        int[] array ={7,10,20,30,40,70};
        if(array.length>=0){
            System.out.println("1st Elemrnt: "+array[1]);
            System.out.println("2nd Elemrnt: "+array[2]);
            System.out.println("Last Elemrnt: "+array[array.length-1]);  
        }
        else{
            System.out.println("Array out of Bound");
        }
    }
}
