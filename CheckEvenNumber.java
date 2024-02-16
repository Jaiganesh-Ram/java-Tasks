public class CheckEvenNumber {
 public static void main(String[] args) {
        
        if (args.length != 1) {
            System.out.println("java CheckEvenNumber <number>");
        }

        
        int number = Integer.parseInt(args[0]);

        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is not an even number.");
        }
    }

    private static boolean isEven(int num){
        return num % 2 == 0;
    }
}