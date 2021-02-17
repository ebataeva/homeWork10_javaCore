import java.util.ArrayList;
import java.util.List;


public class PhoneBook {
   private List<PhoneEntry> phoneEntryList = new ArrayList();


    public List<PhoneEntry> getPhoneEntryList() {
        return phoneEntryList;
    }

    @Override
    public String toString() {
        return "В телефонной книге " +
                "имеется запись=" + phoneEntryList +
                '}';
    }

    public void add(String name, String phone) {
        PhoneEntry entry = new PhoneEntry(name, phone);
        if (!phoneEntryList.contains(entry)) {
            phoneEntryList.add(entry);
        }
    }

    public String get(String lastName) {
        List<String> foundEntries = new ArrayList<>();
        for (PhoneEntry a : phoneEntryList) {
            if (a.getLastName().equals(lastName)) {
                foundEntries.add(a.getNumber());
            }

        }
        if(foundEntries.size()==0)return "фамилия не найдена";
        return "для фамилии "+ lastName+" найдены номера "+foundEntries.toString();
    }


}
