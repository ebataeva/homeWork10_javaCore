import java.util.ArrayList;
import java.util.List;


public class PhoneBook {
 List<PhoneEntry> phoneEntryList = new ArrayList();


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
  if(!phoneEntryList.contains(entry)){
 phoneEntryList.add(entry);}
}

public List  get(String lastName){
  List<String> foundEntries = new ArrayList<>();
for(PhoneEntry a: phoneEntryList){
 if(a.lastName.equals(lastName)){
  foundEntries.add(a.number);
 }

}
return foundEntries;
}


}
