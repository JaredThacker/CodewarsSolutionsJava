public class GrassHopperPersonalizedMessage {
    public static String greet(String name, String owner) {
        return (name.equals(owner)) ? "Hello boss" : "Hello guest";
    }
}
