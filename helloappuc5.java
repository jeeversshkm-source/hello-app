
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