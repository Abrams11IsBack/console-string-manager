package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //memory
	    String mem1 = "null";
	    String mem2 = "null";
	    String mem3 = "null";
	    String mem4 = "null";
	    String mem5 = "null";

        Scanner mem1Input = new Scanner(System.in);
        Scanner mem2Input = new Scanner(System.in);
        Scanner mem3Input = new Scanner(System.in);
        Scanner mem4Input = new Scanner(System.in);
        Scanner mem5Input = new Scanner(System.in);

	    String polecenieUser;

	    //scanners
        Scanner pressEnterToContinue = new Scanner(System.in);
        Scanner polecenieUserInput = new Scanner(System.in);

        //main
        System.out.println("Welcome to the text os(enter)");
        pressEnterToContinue.nextLine();
        while (true) {
            System.out.println("Commands: write mem<number from 1 to 5> oraz list oraz view mem<number from 1 to 5> NO SPACE BETWEEN mem!");
            polecenieUser = polecenieUserInput.nextLine();

            switch (polecenieUser) {
                case ("write mem1"):
                    System.out.println("type your text to write to mem1");
                    mem1 = mem1Input.nextLine();
                    break;
                case ("write mem2"):
                    System.out.println("type your text to write to mem2");
                    mem2 = mem2Input.nextLine();
                    break;
                case ("write mem3"):
                    System.out.println("type your text to write to mem3");
                    mem3 = mem3Input.nextLine();
                    break;
                case ("write mem4"):
                    System.out.println("type your text to write to mem4");
                    mem4 = mem4Input.nextLine();
                    break;
                case ("write mem5"):
                    System.out.println("type your text to write to mem5");
                    mem5 = mem5Input.nextLine();
                    break;
                case ("view mem1"):
                    System.out.println("mem1:" + mem1);
                    break;
                case ("view mem2"):
                    System.out.println("mem2:" + mem2);
                    break;
                case ("view mem3"):
                    System.out.println("mem3:" + mem3);
                    break;
                case ("view mem4"):
                    System.out.println("mem4:" + mem4);
                    break;
                case ("view mem5"):
                    System.out.println("mem5:" + mem5);
                    break;
                case ("list"):
                    System.out.println("mem1:" + mem1);
                    System.out.println("mem2:" + mem2);
                    System.out.println("mem3:" + mem3);
                    System.out.println("mem4:" + mem4);
                    System.out.println("mem5:" + mem5);
                    break;
                default:
                    System.out.println("syntax error");

            }
        }

    }
}
