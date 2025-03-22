import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number of the game :");
        int firstNumberOfGame = scanner.nextInt();
        System.out.println("Enter the last number of the game :");
        int lastNumberOfGame = scanner.nextInt();

        HashMap<Integer , String> hashMap = hashMapBuild();
        String result = "";
        for(int i = firstNumberOfGame ; i <= lastNumberOfGame ; i += 1){
            result = stringAdd(i , hashMap);
            if(result.isEmpty()){result += String.valueOf(i);}
            System.out.println(result);
        }
    }

    public static String wordAdd(int number , int counter , String word){
        if(number % counter == 0){
            return word;
        }
        return "";
    }

    public static HashMap<Integer , String> hashMapBuild(){
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer , String> words = new HashMap<>();

        while (true){
            System.out.println("Enter a number (enter -1 to end) :");
            int number = scanner.nextInt();
            scanner.nextLine();

            if(number == -1){
                return words ;
            }

            System.out.println("Enter a word for number " + number + " :");
            String word = scanner.nextLine();

            words.put(number , word);
        }
    }

    public static String stringAdd(int num , HashMap<Integer,String> hashMap ){
        StringBuilder output = new StringBuilder();
        for(Map.Entry<Integer,String> entry : hashMap.entrySet()){
            output.append(wordAdd(num, entry.getKey(), entry.getValue()));
        }
        return output.toString();
    }
}