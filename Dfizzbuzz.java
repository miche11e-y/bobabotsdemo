public class Dfizzbuzz {
    public static void main(String[] args) {
        for(int i = 1; i < 101; i++){
            if(i%5 ==0 && i%3 == 0) {
                System.out.println("fizzbuzz");
            }
            else if(i%5 == 0) {
                System.out.println("buzz");
            } 
            else if(i%3 == 0) {
                System.out.println("fizz");
            } 
            else{
                System.out.println(i);
            }
        }
    }
}
