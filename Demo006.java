public class Demo006 {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args){
        String username = "Srivardhan";
        String pss = "Bunny010";
        while ((username == "Srivardhan")&&(pss == "Buny010")){
            System.out.println("Hello");
            break;
        }
    }
}