package ADDRESS_BOOK2;
import java.util.*;
public class AddressBook {
    public Map<String, Person> persons;

    public void AddressBook() {
        this.persons = new HashMap<>();
    }

    // Add a new person
    public void addPerson(Person person) {
        String key = person.getFirstName() + " " + person.getLastName();
        if (persons.containsKey(key)) {
            System.out.println("Duplicate entry found for " + key);
        } else {
            persons.put(key, person);
            System.out.println("Person added: " + person);
        }
    }

    // Edit an existing person
    public void editPerson(String firstName, String lastName, Person updatedPerson) {
        String key = firstName + " " + lastName;
        if (persons.containsKey(key)) {
            persons.put(key, updatedPerson);
            System.out.println("Person updated: " + updatedPerson);
        } else {
            System.out.println("Person not found: " + key);
        }
    }

    // Delete a person
    public void deletePerson(String firstName, String lastName) {
        String key = firstName + " " + lastName;
        if (persons.containsKey(key)) {
            persons.remove(key);
            System.out.println("Person deleted: " + key);
        } else {
            System.out.println("Person not found: " + key);
        }
    }

    // Search for a person
    public Person searchPerson(String firstName, String lastName) {
        String key = firstName + " " + lastName;
        return persons.get(key);
    }

    // Sort persons by various criteria
    public List<Person> sortPersons(Comparator<Person> comparator) {
        List<Person> sortedList = new ArrayList<>(persons.values());
        sortedList.sort(comparator);
        return sortedList;
    }

    // Display all persons
    public void displayAll() {
        for (Person person : persons.values()) {
            System.out.println(person);
        }
    }

    // Define some comparators for sorting
    public static Comparator<Person> byFirstName() {
        return Comparator.comparing(Person::getFirstName);
    }

    public static Comparator<Person> byLastName() {
        return Comparator.comparing(Person::getLastName);
    }

    public static Comparator<Person> byAddress() {
        return Comparator.comparing(Person::getAddress);
    }
}