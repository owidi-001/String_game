import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome User!");
        System.out.println("Today, you're going to choose how to spend your afternoon!");

        System.out.println("Sounds good?");
        String affirm = scanner.nextLine();
        if (affirm.contains("yes")){
            System.out.println("Ok so I see you're ready to go. \nDo you wanna catch up on things inside or outside?");
            String choice_things = scanner.nextLine();
            if (choice_things.contains("inside")){
                System.out.println("Go to your bedroom or your living room");
                String choice_room = scanner.nextLine();

                if (choice_room.contains("living")){
                    while (true){
                        System.out.println("Magazines!\nWhat do you want to learn about?");
                        System.out.println("1: Ocean \n2: Space\n3: Forest");
                        int choice_learn = scanner.nextInt();
                        if (choice_learn==1 || choice_learn==2 || choice_learn==3){
                            System.out.println("Random fact");
                        }

                        System.out.println("Learn more?");
                        String choice_more= scanner.next();
                        if (choice_more.contains("yes")){
                            continue;
                        }
                        else if(choice_more.contains("no")){
                            break;
                        }
                    }
                    System.out.println("Those were cool facts");
                }
                else if (choice_room.contains("bedroom")){
                    System.out.println("Not much to do here, but sleep");
                    System.out.println("You slept the day away.");
                }

            }
            else if (choice_things.contains("outside")){
                System.out.println("Let's go to the grocery store!\n Do you have any money?");
                String choice_money = scanner.nextLine();
                if (choice_money.contains("yes")){
                    while (true){
                        System.out.println("What do you want?");
                        System.out.println("1: apples\n2:Canned soup\n3:Bread");
                        int choice_want= scanner.nextInt();
                        if (choice_want == 1 || choice_want == 2 || choice_want ==3){
                            System.out.println("More?");
                            String choice_more = scanner.next();
                            if (choice_more.contains("yes")){
                                continue;
                            }
                            else if (choice_more.contains("no")){
                                System.out.println("Nice stuff you got");
                                break;
                            }
                            System.out.println("Checked");
                        }
                    }

                }
                else if (choice_money.contains("no")){
                    System.out.println("Save up some money and we'll go again!");
                }
            }
            System.out.println("Goodbye!");
        }

    }
}
