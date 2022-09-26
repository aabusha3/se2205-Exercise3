package Q1BL3;

public class StudentGrades {

    public static void main(String[] args) {
        header();
        System.out.println();

        DoublyLinkedList<Student> ahmadList = new DoublyLinkedList<>();
        Student s1 = new Student("Harry", 67.35),
                s2 = new Student("Luna", 87.5),
                s3 = new Student("Vincent", 60.5),
                s4 = new Student("Hermione", 89.2);

        System.out.println("Adding 3 Students To The List.");
        ahmadList.addLast(s1);
        ahmadList.addLast(s2);
        ahmadList.addLast(s3);

        System.out.println(ahmadList);

        if(ahmadList.findNode(s2) != null && ahmadList.findNode(s3) != null) {
            System.out.println("Adding 4th Student In Between.....");
            ahmadList.addBetween(s4, ahmadList.findNode(s2), ahmadList.findNode(s3));
            System.out.println(ahmadList);
        }
        else
            System.out.println("s2 or s3 Is Null, Please Fix It");


        footer();
    }


    public static void header() {
        System.out.println();
        //general lab header
        int n = 81;
        for (int i = 0; i < n; i++) System.out.print("*");
        System.out.println("""

                \t\t\t\t\tHello User, My Name Is Ahmad Sami Abu Shawarib
                \t\t\t\t\t\t\tStudent Number: 251149713
                \t\t\t\t\t\t Welcome To Lab Exercise #3""");
        for (int i = 0; i < n; i++) System.out.print("*");

        //specific lab header
        System.out.println("""

                \t\t\tThis Code Plays Around With The Doubly Linked List Concept
                \t\t   Using Nodes To Navigate Student Objects With Dual Parameters""");
        for (int i = 0; i < n; i++) System.out.print("*");
        System.out.println();
    }


    public static void footer() {
        System.out.printf("%n****************%7s~The Program Has Stopped, GoodBye!~%7s****************", "", "");
    }
}


