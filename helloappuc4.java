public class helloappuc4 {
    public static void main(String[] args) {

        String result = "World";

        if (args.length > 0) {
            StringBuilder namesBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                namesBuilder.append(args[i]);

                if (i < args.length - 1) {
                    namesBuilder.append(", ");
                }
            }

            result = namesBuilder.toString();
        }

        System.out.println("Hello, " + result + "!");
    }
}