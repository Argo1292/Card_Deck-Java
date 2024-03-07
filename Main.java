/*
Rampalli Agni Mithra
22070126083
B1
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("a. Create Deck");
            System.out.println("b. Print Deck");
            System.out.println("c. Print Card");
            System.out.println("d. Same Suit (check if two cards have the same suit)");
            System.out.println("e. Compare Card (same rank)");
            System.out.println("f. Find Card");
            System.out.println("g. Deal 5 random cards");
            System.out.println("h. Shuffle Deck");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);

            switch (Character.toLowerCase(choice)) {
                case 'a':
                    deck.createDeck();
                    System.out.println("Deck created.");
                    break;
                case 'b':
                    deck.printDeck();
                    break;
                case 'c':
                    System.out.print("Enter the index of the card: ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 'd':
                    System.out.print("Enter the index of the first card: ");
                    int x = scanner.nextInt();
                    System.out.print("Enter the index of the second card: ");
                    int y = scanner.nextInt();
                    if (deck.sameSuit(x, y)) {
                        System.out.println("The cards have the same suit.");
                    } else {
                        System.out.println("The cards have different suits.");
                    }
                    break;
                case 'e':
                    System.out.print("Enter the rank: ");
                    String rank = scanner.next();
                    deck.compareCard(rank);
                    break;
                case 'f':
                    System.out.print("Enter the rank of the card: ");
                    String searchRank = scanner.next();
                    System.out.print("Enter the suit of the card: ");
                    String searchSuit = scanner.next();
                    deck.findCard(searchRank, searchSuit);
                    break;
                case 'g':
                    deck.dealCard();
                    break;
                case 'h':
                    deck.shuffleDeck();
                    System.out.println("Deck shuffled.");
                    break;
                case '0':
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (Character.toLowerCase(choice) != '0');

        scanner.close();
    }
}
