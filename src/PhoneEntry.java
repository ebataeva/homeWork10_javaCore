import java.util.HashMap;
import java.util.Objects;

public class PhoneEntry {
 private    String lastName;
 private    String number;

    public String getLastName() {
        return lastName;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneEntry that = (PhoneEntry) o;
        return Objects.equals(lastName, that.lastName) &&
                Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, number);
    }

    @Override
    public String toString() {
        return "{" +
                "lastName='" + lastName + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public PhoneEntry(String lastName, String number) {
        this.lastName = lastName;
        this.number = number;

    }

}
