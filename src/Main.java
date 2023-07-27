import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.util.*;
import java.util.regex.Pattern;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

//        Scanner scanner = new Scanner(System.in);
//
//        Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
//
//        try{
//            System.out.println("Player 1: Please enter your move");
//            String p1 = scanner.next();
//
//            ArrayList list = new ArrayList();
//            list.add(options.ROCK.name);
//            list.add(options.PAPER.name);
//            list.add(options.SCISSORS.name);
//
//            System.out.println("Player 2: Please enter your move");
//            String p2 = scanner.next();
//
//            if (!pattern.matcher(p1).find() || !pattern.matcher(p2).find() ){
//                throw new InputMismatchException();
//            }
//        }catch (InputMismatchException e){
//            System.out.println("Please enter a string");
//        }

        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,5,6,9,12));
        list.stream().filter(x -> x%3 ==0).forEach( (x) -> System.out.println(x));

        list.forEach((x) -> {
            if (x % 3 == 0) {
                System.out.println(x);
            }
        });

        double subtract = Operate(10, 5, (double x, double y) -> {return x-y;});
        double addition = Operate(1234, 2341, (double x, double y) -> {return x+y;});
        double multiplication = Operate(1234, 2341, (double x, double y) -> {return x*y;});

        double distanceFunction = Operate(1234, 2341, (double x, double y) -> {return (double) Math.round(Math.sqrt((x*x + y*y))*100)/100;});
        System.out.println(multiplication);
        System.out.println(distanceFunction);

    }

    public static double Operate(double a, double b, FuncInterface func){
        return func.Operation(a, b);
    }

    interface FuncInterface{
        double Operation(double a, double b);
    }
}