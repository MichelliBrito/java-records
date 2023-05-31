public class Main {
    public static void main(String[] args) {

        var person = new PersonClass("Ana", 15);
        System.out.println(person);

        var personRecord = new PersonRecord("José", 35);
        System.out.println(personRecord);
        personRecord.printName();
        PersonRecord.printMessage();
    }
}