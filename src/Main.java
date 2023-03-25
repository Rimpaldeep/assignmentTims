import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TimsItem[] timsItem = new TimsItem[100];
        TimsMerchandise mug = new Mugs();
        TimsMerchandise coffeePowder = new CoffeePowder();
        TimsMerchandise giftCards = new GiftCards();
        TimsConsumable bagel = new Bagel ();
        TimsConsumable donut = new Donut ();
        TimsConsumable coffee = new Coffee ();
        TimsConsumable sandwich = new Sandwich ();
        TimsConsumable wrap = new Wrap ();

        int counter = 0;
        double totalPrice = 0;
        String  item = "null";

        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Scanner s = new Scanner (System.in);

        for (int i = 0; i <timsItem.length; i++) {
            System.out.println("Please give your input");
            System.out.println("1. Tims Merchendise \n2. Tims Consumable \n3. Done Ordering");
            int choice = sc.nextInt ();
            switch (choice) {
            case 1:
                System.out.println ("1. Mug \n2. Coffee Powder \n3. Gift Cards");
               int input = scanner.nextInt ();
                switch (input) {
                    case 1:
                        System.out.println ("Name: Mug \nFeatures: " + mug.getFeature ());
                        System.out.println ("Price: $" + mug.getPrice ());
                        System.out.println ("1. Order this \n2. Choose Again");
                        int value = s.nextInt ();
                        if (value == 1) {
                            //timsItem [counter++] = mug;
                            counter++;
                            totalPrice = mug.getPrice () ;
                            item = mug.toString ();
                        }
                        break;
                    case 2:
                        System.out.println ("Name: Starbucks \nFeatures: " + coffeePowder.getFeature ());
                        System.out.println ("Price: $" + coffeePowder.getPrice ());
                        System.out.println ("1. Order this \n2. Choose Again");
                        value = s.nextInt ();
                        if (value == 1) {
                            //timsItem [counter++] = coffeePowder;
                            counter++;
                            totalPrice = totalPrice + coffeePowder.getPrice ();
                            item =  item + " , " + coffeePowder.toString ();
                        }
                        break;
                    case 3:
                        System.out.println ("Name: Gift Card \nFeatures: " + giftCards.getFeature ());
                        System.out.println ("Price: $" + giftCards.getPrice ());
                        System.out.println ("1. Order this \n2. Choose Again");
                        value = s.nextInt ();
                        if (value == 1) {
                            //timsItem [counter++] = giftCards;
                            counter++;
                            totalPrice = totalPrice + giftCards.getPrice ();
                            item = item + " , " + giftCards.toString ();
                        }
                        break;
                } break;
                case 2:
                    System.out.println ("1. Donut \n2. Bagel \n3. Coffee \n4. Wrap \n5. Sandwich");
                    input = scanner.nextInt ();
                    switch (input) {
                        case 1:
                            System.out.println ("Name: Donut \nCalories: " + donut.getCalories ());
                            System.out.println ("Price: $" + donut.getPrice ());
                            System.out.println ("1. Order this \n2. Choose Again");
                            int value = s.nextInt ();
                            if (value == 1) {
                                //timsItem [counter++] = donut;
                                counter++;
                                totalPrice = totalPrice + donut.getPrice ();
                                item = item + " , " + donut.toString ();
                            }
                            break;
                        case 2:
                            System.out.println ("Name: Bagel \nCalories: " + bagel.getCalories ());
                            System.out.println ("Price: $" + bagel.getPrice ());
                            System.out.println ("1. Order this \n2. Choose Again");
                            value = s.nextInt ();
                            if (value == 1) {
                                //timsItem [counter++] = bagel;
                                counter++;
                                totalPrice = totalPrice + bagel.getPrice ();
                                item = item + " , " + bagel.toString ();
                            }
                            break;
                        case 3:
                            System.out.println ("Name: Coffee \nCalories: " + coffee.getCalories ());
                            System.out.println ("Price: $" + coffee.getPrice ());
                            System.out.println ("1. Order this \n2. Choose Again");
                            value = s.nextInt ();
                            if (value == 1) {
                                //timsItem [counter++] = coffee;
                                counter++;
                                totalPrice = totalPrice + coffee.getPrice ();
                                item = item + " , " + coffee.toString ();
                            }
                            break;
                        case 4:
                            System.out.println ("Name: Wrap \nCalories: " + wrap.getCalories ());
                            System.out.println ("Price: $" + wrap.getPrice ());
                            System.out.println ("1. Order this \n2. Choose Again");
                            value = s.nextInt ();
                            if (value == 1) {
                                //timsItem [counter++] = wrap;
                                counter++;
                                totalPrice = totalPrice + wrap.getPrice ();
                                item = item + " , " + wrap.toString ();
                            }
                            break;
                        case 5:
                            System.out.println ("Name: Sandwich \nCalories: " + sandwich.getCalories ());
                            System.out.println ("Price: $" + sandwich.getPrice ());
                            System.out.println ("1. Order this \n2. Choose Again");
                            value = s.nextInt ();
                            if (value == 1) {
                                //timsItem [counter++] = sandwich;
                                counter++;
                                totalPrice = totalPrice + sandwich.getPrice ();
                                item = item + " , " + sandwich.toString ();
                            }
                            break;
                    } break;
                case 3:
                    System.out.println ("***************");
                    System.out.println ("Your order is: " + item);
                    System.out.println ("Number of Items ordered are " + counter);
                    System.out.println ("***************");
                    System.out.println ("Total Price is " + totalPrice);
                    break;
                default:
                    System.out.println ("Invalid input, Please try again");
            }
            }
                     System.out.println ("Proceeding Payment");
        }

    }






