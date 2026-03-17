/**
 * UC 5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop or Default Message
 * The application should accept multiple names as command-line arguments and display a personalized greeting
 * for each user using an enhanced for loop. If no names are provided, it should display "Hello, World!".
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!"
 * - If no names are provided, it will display "Hello, World!"
 */

public class helloappuc5 {
    public static void main(String[] args) {

        String result = "World";

        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for (String name : args) {

                if (!first) {
                    nameBuilder.append(", ");
                }

                nameBuilder.append(name);
                first = false;
            }

            result = nameBuilder.toString();
        }

        System.out.println("Hello, " + result + "!");
    }
}