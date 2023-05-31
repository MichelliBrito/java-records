public record PersonRecord(String name, int age) {

    public static final String DEFAULT_MESSAGE = "Hello World";

    public void printName(){
        System.out.println("Name: " + name);
    }

    public static void printMessage(){
        System.out.println(DEFAULT_MESSAGE);
    }

}
