import java.util.ArrayList;
import java.util.Scanner;

class Publisher {
    String name;
    Publisher(String name) {
        this.name = name;
    }
}


class Book extends Publisher {
    String title;
    String author;

    Book(String name, String title, String author) {
        super(name);
        this.title = title;
        this.author = author;
    }
}


class Literature extends Book {
    String genre;

    Literature(String name,String title, String author, String genre) {
        super(name, title, author);
        this.genre = genre;
    }

    void display() {
        System.out.println("\n---------- Literature Book ----------");
        System.out.println("Publisher: " + name);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }
}

class Fiction extends Book {
    String theme;

    Fiction(String name,String title, String author, String theme) {
        super(name, title, author);
        this.theme = theme;
    }

    void display() {
        System.out.println("\n---------- Fiction Book ----------");
        System.out.println("Publisher: " + name);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Theme: " + theme);
    }
}

// Main class with menu
public class Bookstore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Literature> literatureList = new ArrayList<>();
        ArrayList<Fiction> fictionList = new ArrayList<>();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Literature Book");
            System.out.println("2. Add Fiction Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Publisher Name: ");
                    String pub1 = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title1 = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author1 = sc.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();
                    literatureList.add(new Literature(pub1, title1, author1, genre));
                    System.out.println("Literature book added.");
                    if (literatureList.isEmpty()) {
                        System.out.println("No literature books found.");
                    } else {
                        for (Literature l : literatureList) {
                            l.display();
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter Publisher Name: ");
                    String pub2 = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title2 = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author2 = sc.nextLine();
                    System.out.print("Enter Theme: ");
                    String theme = sc.nextLine();
                    fictionList.add(new Fiction(pub2, title2, author2, theme));
                    System.out.println("Fiction book added.");
                    if (fictionList.isEmpty()) {
                        System.out.println("No fiction books found.");
                    } else {
                        for (Fiction f : fictionList) {
                            f.display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}

