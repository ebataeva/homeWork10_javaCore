public class TestData {
    String[] LASTNAMES = new String[]{"Ivanov", "Kuznecov", "Sokolov", "Popov", "Lebedev", "Kozlov", "Novikov", "Morozov", "Petrov", "Volkov", "Solovyov", "Vasilev", "Zajcev", "Pavlov", "Semyonov", "Golubev", "Vinogradov", "Bogdanov", "Vorobyov", "Fyodorov", "Mihajlov", "Belyaev", "Tarasov", "Belov", "Komarov", "Orlov", "Kiselyov", "Makarov", "Andreev", "Kovalyov", "Ilin", "Gusev", "Titov", "Kuzmin", "Kudryavcev", "Baranov", "Kulikov", "Alekseev", "Stepanov"};
    String[] PHONES = new String[]{"12", "21", "34", "43", "56", "67", "78", "89"};

    public String randArray(String[] array) {

        int n = (int) Math.floor(Math.random() * array.length);
        return array[n];
    }
    public String generatePhone() {
        String name = new String("+79" + randArray(PHONES) + randArray(PHONES) + randArray(PHONES) + randArray(PHONES));
        return name;
    }
    public String generateLastName() {
        String name = new String(randArray(LASTNAMES));
        return name;
    }


}
