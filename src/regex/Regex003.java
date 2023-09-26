package regex;

public class Regex003 {
    public static void main(String[] args) {
        RegexTester firstnameTester = new RegexTester("[A-Z][a-z]+");
        firstnameTester.validate("Urszula");
        firstnameTester.validate("Tomek");
        firstnameTester.validate("Janusz");
        firstnameTester.validate("Janusz");

        RegexTester surnameTester = new RegexTester("^[A-Za-z -]+$");
        surnameTester.validate("Kowalski");
        surnameTester.validate("von der Leyen");
        surnameTester.validate("von der Leyen Aasd");
        surnameTester.validate("von der Leyen-Kowalska");
        surnameTester.validate("Bachleda-Curus");
        surnameTester.validate("de Silva");
        surnameTester.validate("De Silva");

        surnameTester.validate("123123123");
        surnameTester.validate("12312-3123");
        surnameTester.validate("de 12312-3123");
        surnameTester.validate("kowalska");
        surnameTester.validate("-Nowak");

    }
}
