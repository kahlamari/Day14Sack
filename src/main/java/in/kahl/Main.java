package in.kahl;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharamcy = new Pharmacy();

        Medication para = new Medication("Paracetamol", 599, true);
        Medication ibu = new Medication("Ibuprofen", 699, true);
        Medication paraSaft = new Medication("Paracetamol Saft", 1500, false);

        pharamcy.save(para);
        pharamcy.save(ibu);
        pharamcy.save(paraSaft);

        System.out.println(pharamcy);
        System.out.println("Stock: " + pharamcy.getCount());

        System.out.println("In Pharmacy: " + pharamcy.find("Paracetamol Saft"));
        pharamcy.delete("Paracetamol Saft");
        System.out.println("and it's gone: " + pharamcy.find("Paracetamol Saft"));
        System.out.println("Stock: " + pharamcy.getCount());

    }


    private void beutel() {
        Beutel beutel = new Beutel();

        beutel.add(1);
        beutel.add(2);
        beutel.add(3);
        beutel.add(14);
        beutel.add(20);
        beutel.add(11);

        System.out.println(beutel.size());
        System.out.println(beutel);
    }

    private void sack() {
        Sack sack = new Sack();

        sack.add(1);
        sack.add(2);
        sack.add(3);
        sack.add(14);
        sack.add(20);
        sack.add(11);

        System.out.println(sack);
        System.out.println("Size: " + sack.size());
        System.out.println("Element content " + sack.get(2));
        sack.removeByIndex(2);
        System.out.println("Element content " +  sack.get(2));
        sack.removeLast();
        sack.removeFirst();
        System.out.println(sack);
        System.out.println("Size: " + sack.size());
    }

    static private void school() {
        School school = new School("Neue Fische");

        Student student1 = new Student("Horst", "Thomas", 123);
        Student student2 = new Student("Frida", "Fridrich", 456);
        Student student3 = new Student("Helga", "Hofmeier", 789);
        Student student4 = new Student("Micha", "Maria", 369);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        System.out.println(school);

        school.removeStudent(123);
        System.out.println(school);

        Course course1 = new Course("java", "Florian", "remote");
        Course course2 = new Course("c++", "Anne", "remote");

        student2.addCourse(course1);
        student2.addCourse(course2);

        System.out.println(school);

        System.out.println(school.retrieveCourses(456));
    }
}
