public class helloappuc3 {
    public static void main(String[] args) {
        String name = "World";
        name = (args.length > 0) ? args[0] : name;
        System.out.println("Hello, " + name + "!");
    }
}