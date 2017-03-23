/**
 * @author OrenUrman
 */
public class Summ {
    public static void main(String[] args) {
        if (args.length!=2) {
            System.out.println("Invalid number of arguments.");
            System.exit(1);
        }
        try{
            System.out.println(Double.parseDouble(args[0]) + Double.parseDouble(args[1]));
        }catch (NullPointerException | NumberFormatException ex){
            System.out.println("Error. Perhaps incorrect arguments");
        }
    }
}
