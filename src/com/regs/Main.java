package com.regs;

import java.util.Scanner;
import java.lang.Character;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.FileNotFoundException;


/**
 *
 * @author alain
 */

public class Main {

    /**
     * param args the command line arguments
     */
    public static void main(String[] args) {
        int value = 0 ;
        char ans;
        String repeat;
        do{
            getHypen();
            System.out.println("\nWelcome to UoK Student Registration !\n");
            System.out.println("This is 4 years bachelor degree program. After that, you'll be given Bachelor's degree by UoK.");
            getHypen();
            Scanner scan = new Scanner(System.in);
            String name;
            System.out.print("\nEnter your name: ");
            name = scan.nextLine();
            int age;
            System.out.print("\nEnter your current age: ");
            age = scan.nextInt();

            String id = "";
            if (age<=16){
                System.out.print("\nDear"+" "+name+","+"Are you a matriculated student? [Y, N]");
                scan.nextLine();
                ans = scan.next().charAt(0);
                ans = Character.toUpperCase(ans);


                if (ans == 'Y'){
                    System.out.print("\nEnter your old school: ");
                    scan.nextLine();
                    scan.nextLine();
                }
                else if  (ans == 'N'){
                    System.out.print("\nEnter your UoK's Student ID: ");
                    scan.nextLine();
                    id = scan.nextLine();
                }
                else{
                    System.out.print("\nPlease write down 'Y' or 'N'!");
                    scan.next().charAt(0);
                    System.out.println("Enter your old school: ");
                    scan.nextLine();
                    scan.nextLine();
                }
            }else{
                System.out.print("\nEnter your UoK's Student ID: ");
                scan.nextLine();
                id = scan.nextLine();

            }

            System.out.println("\nChoose one of the following majors: 1,2,3,4,5,6,7,8,9\n");
            System.out.print("""
                    1.Civil Engineering
                    2.Architecture
                    3.Information Technology
                    """);
            System.out.print("""
                    4.Electornic Engineering
                    5.Mechatronic Engineering
                    6.Mechanical Engineering
                    """);
            System.out.println("7.Electrical Power Engineering\n"+"8.Chemical Engineering\n"+"9.Petroleum Engineering");

            int major;
            String output;
            major=scan.nextInt();

            if (major==1) {
                output="Civil Engineering";
            }else if (major==2) {
                output="Architecture";
            }else if(major==3){
                output="Information Technology";
            }else if (major==4) {
                output="Electornic Engineering";
            }else if (major==5) {
                output="Mechatronic Engineering";
            }else if (major==6) {
                output="Mechanical Engineering";
            }else if (major==7) {
                output="Electrical Engineering";
            }else if (major==8) {
                output="Chemical Engineering";
            }else if (major==9){
                output="Petroleum Engineering";
            }else{
                output="Wrong Number!";
            }

            if (age <= 16) {

                System.out.print("\nEnter your NID Number: ");
                scan.nextLine();
                String NID;
                NID = scan.nextLine();

                System.out.print("\nNumber of Distinction Achieved in Matriculation: ");
                int dis = 0 ;
                dis = scan.nextInt();

                System.out.print("\nProvide your Total Marks: ");
                int mark;
                mark = scan.nextInt();

                System.out.print("\nYear to attend: ");
                scan.nextLine();
                String yearta = "" ;
                yearta = scan.nextLine();


                System.out.println("\nYou need to choose at least one of these: 1,2,3,4,5\n");
                System.out.println("1. Univerisity fee (*MUST) 35000Ks for one semester");
                System.out.println("2. Material fees (*Optional) 100000Ks for one semester");
                System.out.println("3. Shuttle Service fares (*Optional) 80000Ks for one semester");
                System.out.println("4. Fees that cover all (Package A) 215000Ks");
                System.out.println("5. Fees that only cover 1 & 3 (Package B) 115000Ks");
                int paytype;
                paytype = scan.nextInt();
                String outputf = "";
                switch (paytype) {
                    case 1 -> {
                        outputf = "Univerisity fee";
                        value = 35000;
                    }
                    case 2 -> {
                        outputf = "Material fees";
                        value = 100000;
                    }
                    case 3 -> {
                        outputf = "Shuttle Service fares";
                        value = 80000;
                    }
                    case 4 -> {
                        outputf = "Package A";
                        value = 215000;
                    }
                    case 5 -> {
                        outputf = "Package B";
                        value = 115000;
                    }
                    default -> System.out.println("Please select just only one number out of them!");
                }

                System.out.println(name+", your registration is sucessfully recorded! You has officially become "+yearta+" Student of UoK !");

                try{
                    FileWriter fw = new FileWriter("student registration.txt");
                    Date date = new Date();
                    SimpleDateFormat currentDate = new SimpleDateFormat("dd(E)/MM(MMM)/yyyy");
                    SimpleDateFormat currentTime = new SimpleDateFormat("hh:mm:ss a");

                    fw.write("=== Student Registration Form===");
                    fw.write("\n\n");
                    fw.write("DATE: " + currentDate.format(date));
                    fw.write("\n");
                    fw.write("TIME: " + currentTime.format(date));
                    fw.write("\n\n");

                    fw.write("NID Number: " + NID + "\n"+"Student Name: "+name+"\n");
                    fw.write("Chosen Major: " + output +"\n"+"Academic Record: "+mark+"\n"+"Designated Year: "+yearta+"\n");
                    fw.write("Chosen Package: " + outputf + "," +"\t"+"Amount: "+value+"Ks"+"\n");


                    fw.close();

                    System.out.println("Thanks for your time!");
                    getHypen();

                }catch(IOException e){
                    System.out.println(e);
                }

                System.out.println("//Output//");
                getHypen();
                System.out.println("Student Name"+"\t"+"NID Number"+"\t"+"Chosen Major"+"\t"+"Total Marks"+"\t"+"Chosen Package"+"\t\t"+"Designated Year"+"\t\t"+"Amount");
                System.out.println(name+"\t"+NID+"\t"+output+"\t"+mark+"\t"+outputf+"\t\t"+yearta+"\t\t"+value+"Ks");
                getHypen();

                System.out.println();

                System.out.println("Do you want to restart registration again? [Y/N]");
                repeat = scan.next();
            }
            else{
                System.out.println("Last Attended Year: ");
                scan.nextLine();
                String year = "" ;
                year=scan.nextLine();

                System.out.println("Last Academic Record(Total Marks): ");
                int last = 0 ;
                last=scan.nextInt();

                System.out.println("Last Roll Number: ");
                int roll = 0 ;
                roll=scan.nextInt();

                System.out.println("Designated Year to attend: ");
                // scan.nextLine();
                String dyear = "" ;
                scan.nextLine();
                dyear=scan.nextLine();

                System.out.println("You need to choose at least one of these: 1,2,3,4,5");
                System.out.println("1. Univerisity fee (*MUST) 35000Ks for one semester");
                System.out.println("2. Material fees (*Optional) 100000Ks for one semester");
                System.out.println("3. Shuttle Service fares (*Optional) 80000Ks for one semester");
                System.out.println("4. Fees that cover all (Package A) 215000Ks");
                System.out.println("5. Fees that only cover 1 & 3 (Package B) 115000Ks");
                int paytype = 0 ;
                paytype = scan.nextInt();
                String outputf = "";

                switch(paytype){
                    case 1 :
                        outputf = "Univerisity fee";
                        value = 35000;
                        break;
                    case 2 :
                        outputf = "Material fees";
                        value = 100000;
                        break;
                    case 3 :
                        outputf = "Shuttle Service fares";
                        value = 80000;
                        break;
                    case 4 :
                        outputf = "Package A";
                        value = 215000;
                        break;
                    case 5 :
                        outputf = "Package B";
                        value = 115000;
                        break;
                    default :
                        System.out.println("Please select just only one number out of them!");
                }


                System.out.println(name+" , your registration is sucessfully recorded! You has officially become a "+dyear+" Student !");

                try{
                    FileWriter fw = new FileWriter("student registration.txt");
                    Date date = new Date();
                    SimpleDateFormat currentDate = new SimpleDateFormat("dd(E)/MM(MMM)/yyyy");
                    SimpleDateFormat currentTime = new SimpleDateFormat("hh:mm:ss a");

                    fw.write("=== Student Registration Form===");
                    fw.write("\n\n");
                    fw.write("DATE: " + currentDate.format(date));
                    fw.write("\n");
                    fw.write("TIME: " + currentTime.format(date));
                    fw.write("\n\n");

                    fw.write("Student ID: " + id + "\n"+"Student Name: "+name+"\n");
                    fw.write("Chosen Major: " + output +"\n"+"Academic Record: "+last+"\n"+"Designated Year: "+dyear+"\n");
                    fw.write("Chosen Package: " + outputf + "," +"\t"+"Amount: "+value+"Ks"+"\n");


                    fw.close();

                    System.out.println("Thanks for your time!");
                    getHypen();

                }catch(IOException e){
                    System.out.println(e);
                }

                System.out.println("//Output//");
                getHypen();
                System.out.println("Student Name"+"\t"+"Student ID"+"\t"+"Chosen Major"+"\t"+"Last Academic Record"+"\t"+"Chosen Package"+"\t"+"Designated Year"+"\t"+"Amount");
                System.out.println(name+"\t"+id+"\t\t"+output+"\t"+last+"\t\t"+outputf+"\t"+dyear+"\t"+value+" Ks");
                getHypen();

                System.out.println();

                System.out.println("Do you want to restart registration again? [Y/N]");
                repeat = scan.next();

            }


        }while(repeat.equals("Y") || repeat.equals("y"));
        try{
            File file = new File("student registration.txt");

            Scanner scan = new Scanner (file);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }

        }catch(FileNotFoundException e){
            System.out.println(e);
        }

    }
    public static void getHypen(){

        int x;
        System.out.println("\n");
        for (x=0;x<=119;x++){
            System.out.print("-");
        }
    }
}
