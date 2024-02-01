/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

import java.util.Scanner;

public class ProjectFinalVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long StartTime = 0;
        long StopTime = 0;
        
        boolean cases = true;
        boolean StopwatchRunning = false;
        
     
        String contactnumber1 ="05324442619";
        String contactname1= "MOM";
        String contact1 = contactname1  +" : " + contactnumber1;
        String Message11 = "";
        String Message12 = "";
        String Message13 = "";
     
        String contactnumber2 ="05323090609";
        String contactname2 = "DAD";
        String contact2 =  contactname2  +" : " + contactnumber2;
        String Message21 = "";
        String Message22 = "";
        String Message23 = "";
    
        String contact3 = "";
        String contactnumber3 ="";
        String contactname3 = "";
        String Message31 = "";
        String Message32 = "";
        String Message33 = "";
     
        String contact4 = "";
        String contactnumber4 ="";
        String contactname4 = "";
        String Message41 = "";
        String Message42 = "";
        String Message43 = "";

        String contact5 = "";
        String contactnumber5 ="";
        String contactname5 = "";
        String Message51 = "";
        String Message52 = "";
        String Message53 = "";
     
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
     
        String empty = "";
     
        
        while(cases){
            cases = false;
            System.out.println("------------------------------------------");        
            System.out.println("Choose which operator you want to use");
            System.out.println("[1]: Stopwatch");
            System.out.println("[2]: Clock and Time");
            System.out.println("[3]: Phone functions");
            System.out.println("[4]: Contact Management");
            System.out.println("[5]: Rock, Paper & Scissors");
            System.out.println("-------------------------------------------");
            int choice1 = sc.nextInt();
            
    

            switch (choice1) {

            case 1://STOPWATCH
                while(true){
                    System.out.println("-------------------------------------------");
                    System.out.println("[1]: Start");
                    System.out.println("[2]: Stop");
                    System.out.println("[3]: Reset");
                    System.out.println("[4]: Display Time");
                    System.out.println("[5]: Main Menu");
                    System.out.println("-------------------------------------------");
                    int selection = sc.nextInt();

                switch (selection) {
                    case 1:
                        if(! StopwatchRunning){
                            StopwatchRunning = true;
                            StartTime = System.currentTimeMillis() - StopTime;
                            System.out.println("Stopwatch is running");
                        }
                        
                        else{
                            System.out.println("Stopwatch is already running");
                        }
                        break;

                    case 2:
                        if(StopwatchRunning){
                            StopwatchRunning = false;
                            System.out.println("Stopwatch stopped.");
                            StopTime = System.currentTimeMillis() - StartTime ;
                        }
                        
                        else{
                            System.out.println("Stopwatch is already stopped");
                        }

                        break;

                    case 3:
                         System.out.println("Stopwatch is reseting");
                            StartTime = 0;
                            StopTime = 0;
                            StopwatchRunning = false;

                        break;

                    case 4: 
                        System.out.println("Stopwatch time is : " + StopTime/1000);
                        break;
                }
                
                    if(selection == 5) {
                        cases= true;
                        break;
                    }
                }
                     break;
          
            case 2: // CLOCK
                {
                long utcHourDifference = 3;
                long totalSeconds = (System.currentTimeMillis()/1000) % 86400;
                long seconds = totalSeconds % 60;
                long minutes = (totalSeconds/60) % 60;
                long hours = (totalSeconds / 3600) + utcHourDifference;
                System.out.println(hours + ":" + minutes + ":" + seconds);
                cases = true;
                }

                            break;


            case 3: //PHONE FUNCTIONS
                while(true){
                System.out.println("-------------------------------------------");
                System.out.println("[1] Call Contact");
                System.out.println("[2] Message Contact");
                System.out.println("[3] Wiew Message history");
                System.out.println("[4] Wiew Call History");
                System.out.println("[5] Main Menu");
                System.out.println("-------------------------------------------");

                int lm = sc.nextInt();
                
                
                    if(lm == 5){
                        cases = true;
                        break;
                    }

                    switch (lm) {
                        case 1://CALL CONTACT, Int c1,c2,c3,c4,c5 keeps track off the calls that have been made.

                            System.out.println("Select who you would like to call: ");
                            System.out.println("[1]" + contact1);
                            System.out.println("[2]" + contact2);
                            System.out.println("[3]" + contact3);
                            System.out.println("[4]" + contact4);
                            System.out.println("[5]" + contact5);

                            int call = sc.nextInt();

                        switch (call) {
                            case 1:
                                if(contact1==""){System.out.println("Contact doesn't exist");
                                break;
                                }
                                System.out.println("Calling... " + contact1);
                                c1 ++;
                                break;
                            case 2:
                                if(contact2==""){System.out.println("Contact doesn't exist");
                                break;
                                }
                                System.out.println("Calling... " + contact2);
                                c2 ++;
                                break;
                            case 3:
                                if(contact3==""){System.out.println("Contact doesn't exist");
                                break;
                                }
                                System.out.println("Calling... " + contact3);
                                c3 ++;
                                break;
                            case 4:
                                if(contact4==""){System.out.println("Contact doesn't exist");
                                break;
                                }
                                System.out.println("Calling... " + contact4);
                                c4 ++;
                                break;
                            case 5:
                                if(contact5==""){System.out.println("Contact doesn't exist");
                                break;
                                }
                                System.out.println("Calling... " + contact5);
                                c5 ++;
                                break;
                            default:
                            System.out.println("Your Selection is invalid please enter an integer between 1-5");
                        }

                        break;
                        
                        case 2://MESSAGE CONTACT, smartwach can only record three messages per person after the sloths are full you can choose to delete old messages.
                            System.out.println("Select who you would like to message:  ");
                            System.out.println("[1]" + contact1  );
                            System.out.println("[2]" + contact2  );
                            System.out.println("[3]" + contact3  );
                            System.out.println("[4]" + contact4  );
                            System.out.println("[5]" + contact5  );

                            int messages = sc.nextInt();

                            switch (messages) {
                            case 1:// SENDING MESSAGE TO CONTACT1


                                if(contact1==""){System.out.println("This contact doesn't exist");
                                break;
                                }
                                if(Message11== "" ){
                                System.out.println("Messaging to " + contact1);
                                System.out.println("Type in your message: ");
                                String empty5 = sc.nextLine();
                                Message11 = sc.nextLine();
                                System.out.println("Message: " + Message11 + "\nSent to: " + contactname1);
                                }

                                else if (Message11!= "" && Message12 == "")
                                    {
                                System.out.println("Messaging to " + contact1);
                                System.out.println("Type in your message: ");
                                String empty5 = sc.nextLine();
                                Message12 = sc.nextLine();
                                System.out.println("Message: " + Message12 + "\nSent to: " + contactname1);

                                }

                                else if(Message11!= "" && Message12 != ""&& Message13=="")
                                      {
                                System.out.println("Messaging to " + contact1);
                                System.out.println("Type in your message: ");
                                String empty5 = sc.nextLine();
                                Message13 = sc.nextLine();
                                System.out.println("Message: " + Message13 + "\nSent to: " + contactname1);

                                }

                                else{
                                    System.out.println("Your Messages are full, would you like to delete the old ones to send a new one");
                                    System.out.println("[1] YES");
                                    System.out.println("[2] NO");

                                    int deletemessages = sc.nextInt();

                                    if(deletemessages==1){
                                        System.out.println("Deleting old messages...");
                                        Message11 = "";
                                        Message12 = "";
                                        Message13 = "";
                                        System.out.println("Old messages are deleted.");

                                   }

                                    else {

                                    break;

                                    }

                                }

                                break;
                        
                            case 2: // SENDING MESSAGE TO CONTACT2
                                 if(contact2==""){System.out.println("This contact doesn't exist");
                                break;
                                }                       
                                if(Message21== "" ){
                                System.out.println("Messaging to " + contact2);
                                System.out.println("Type in your message: ");
                                String empty5 = sc.nextLine();
                                Message21 = sc.nextLine();
                                System.out.println("Message: " + Message21 + "\nSent to: " + contactname2);

                                }

                                else if (Message21!= "" && Message22 == "")
                                    {
                                System.out.println("Messaging to " + contact2);
                                System.out.println("Type in your message: ");
                                String empty5 = sc.nextLine();
                                Message22 = sc.nextLine();
                                System.out.println("Message: " + Message22 + "\nSent to: " + contactname2);

                                }

                                else if(Message21!= "" && Message22 != ""&& Message23=="")
                                      {
                                System.out.println("Messaging to " + contact2);
                                System.out.println("Type in your message: ");
                                String empty5 = sc.nextLine();
                                Message23 = sc.nextLine();
                                System.out.println("Message: " + Message23 + "\nSent to: " + contactname2);

                                }

                                else{
                                    System.out.println("Your Messages are full, would you like to delete the old ones to send a new one");
                                    System.out.println("[1] YES");
                                    System.out.println("[2] NO");

                                    int deletemessages = sc.nextInt();

                                    if(deletemessages==1){
                                        System.out.println("Deleting old messages...");
                                        Message21 = "";
                                        Message22 = "";
                                        Message23 = "";
                                        System.out.println("Old messages are deleted.");

                                   }

                                    else {

                                    break;

                                    }
                                }

                                break;
                            case 3: // SENDING MESSAGE TO CONTACT3
                                if(contact3==""){System.out.println("This contact doesn't exist");
                                break;
                                        }                       
                                if(Message31== "" ){
                                    System.out.println("Messaging to " + contact3);
                                    System.out.println("Type in your message: ");
                                    String empty5 = sc.nextLine();
                                    Message31 = sc.nextLine();
                                    System.out.println("Message: " + Message31 + "\nSent to: " + contactname3);
                                }

                                else if (Message31!= "" && Message32 == ""){
                                    System.out.println("Messaging to " + contact3);
                                    System.out.println("Type in your message: ");
                                    String empty5 = sc.nextLine();
                                    Message32 = sc.nextLine();
                                    System.out.println("Message: " + Message32 + "\nSent to: " + contactname3);
                                }

                                else if(Message31!= "" && Message32 != ""&& Message33==""){
                                    System.out.println("Messaging to " + contact3);
                                    System.out.println("Type in your message: ");
                                    String empty5 = sc.nextLine();
                                    Message33 = sc.nextLine();
                                    System.out.println("Message: " + Message33 + "\nSent to: " + contactname3);
                                }

                                else{
                                    System.out.println("Your Messages are full, would you like to delete the old ones to send a new one");
                                    System.out.println("[1] YES");
                                    System.out.println("[2] NO");

                                    int deletemessages = sc.nextInt();

                                            if(deletemessages==1){
                                                System.out.println("Deleting old messages...");
                                                Message31 = "";
                                                Message32 = "";
                                                Message33 = "";
                                                System.out.println("Old messages are deleted.");

                                           }

                                            else {

                                            break;

                                            }

                                        }

                                        break;
                            case 4: // SENDING MESSAGE TO CONTACT4
                                if(contact4==""){System.out.println("This contact doesn't exist");
                                break;
                                }                        
                                if(Message41== "" ){
                                System.out.println("Messaging to " + contact4);
                                System.out.println("Type in your message: ");
                                String empty5 = sc.nextLine();
                                Message41 = sc.nextLine();
                                System.out.println("Message: " + Message41 + "\nSent to: " + contactname4);

                                }

                                else if (Message41!= "" && Message42 == "")
                                    {
                                System.out.println("Messaging to " + contact4);
                                System.out.println("Type in your message: ");
                                String empty5 = sc.nextLine();
                                Message42 = sc.nextLine();
                                System.out.println("Message: " + Message42 + "\nSent to: " + contactname4);

                                }

                                else if(Message41!= "" && Message42 != ""&& Message43=="")
                                      {
                                System.out.println("Messaging to " + contact4);
                                System.out.println("Type in your message: ");
                                String empty5 = sc.nextLine();
                                Message43 = sc.nextLine();
                                System.out.println("Message: " + Message43 + "\nSent to: " + contactname4);

                                }

                                else{
                                    System.out.println("Your Messages are full, would you like to delete the old ones to send a new one");
                                    System.out.println("[1] YES");
                                    System.out.println("[2] NO");

                                    int deletemessages = sc.nextInt();

                                    if(deletemessages==1){
                                        System.out.println("Deleting old messages...");
                                        Message41 = "";
                                        Message42 = "";
                                        Message43 = "";
                                        System.out.println("Old messages are deleted.");

                                   }

                                    else {

                                    break;

                                    }

                                }

                                break;

                            case 5: // SENDING MESSAGE TO CONTACT5

                                if(contact5==""){System.out.println("This contact doesn't exist");
                                break;
                                }                        
                                if(Message51== "" ){
                                System.out.println("Messaging to " + contact5);
                                System.out.println("Type in your message: ");
                                String empty5 = sc.nextLine();
                                Message51 = sc.nextLine();
                                System.out.println("Message: " + Message51 + "\nSent to: " + contactname5);

                                }

                                else if (Message51!= "" && Message52 == "")
                                    {
                                System.out.println("Messaging to " + contact5);
                                System.out.println("Type in your message: ");
                                String empty5 = sc.nextLine();
                                Message52 = sc.nextLine();
                                System.out.println("Message: " + Message52 + "\nSent to: " + contactname5);

                                }

                                else if(Message51!= "" && Message52 != ""&& Message53=="")
                                      {
                                System.out.println("Messaging to " + contact5);
                                System.out.println("Type in your message: ");
                                String empty5 = sc.nextLine();
                                Message53 = sc.nextLine();
                                System.out.println("Message: " + Message53 + "\nSent to: " + contactname5);

                                }

                                else{
                                    System.out.println("Your Messages are full, would you like to delete the old ones to send a new one");
                                    System.out.println("[1] YES");
                                    System.out.println("[2] NO");

                                    int deletemessages = sc.nextInt();

                                    if(deletemessages==1){
                                        System.out.println("Deleting old messages...");
                                        Message51 = "";
                                        Message52 = "";
                                        Message53 = "";
                                        System.out.println("Old messages are deleted.");
                                    }

                                    else {
                                        break;
                                    }
                                }

                                break;
                            default:
                            System.out.println("Your Selection is invalid please enter an integer between 1-5");
                        }

                        break;
                        
                        case 3:// MESSAGE HISTORY
                            System.out.println("Select whose messages you would like to display :  ");
                                System.out.println("[1]" + contact1  );
                                System.out.println("[2]" + contact2  );
                                System.out.println("[3]" + contact3  );
                                System.out.println("[4]" + contact4  );
                                System.out.println("[5]" + contact5  );

                                int messageshistory = sc.nextInt();

                            switch (messageshistory) {
                                case 1: // DISPLAYING MESSAGES SENT TO CONTACT1
                                    if(Message11 == "" && Message12 ==""&&Message13 == ""){System.out.println("There are no messages to display");
                                    break;
                                    }
                                    System.out.println("Displaying messages sent to " + contactname1+ ":");
                                    System.out.println(Message11);
                                    System.out.println(Message12);
                                    System.out.println(Message13);
                                    break;
                                case 2:// DISPLAYING MESSAGES SENT TO CONTACT2
                                    if(Message21 == "" && Message22 ==""&&Message23 == ""){System.out.println("There are no messages to display");
                                    break;
                                    }
                                    System.out.println("Displaying messages sent to " + contactname2 + ":");
                                    System.out.println(Message21);
                                    System.out.println(Message22);
                                    System.out.println(Message23);

                                    break;
                                case 3:// DISPLAYING MESSAGES SENT TO CONTACT3
                                    if(Message31 == "" && Message32 ==""&&Message33 == ""){System.out.println("There are no messages to display");
                                    break;
                                    }
                                    System.out.println("Displaying messages sent to " + contactname3 + ":");
                                     System.out.println(Message31);
                                    System.out.println(Message32);
                                    System.out.println(Message33);
                                    break;
                                case 4:// DISPLAYING MESSAGES SENT TO CONTACT4
                                    if(Message41 == "" && Message42 ==""&&Message43 == ""){System.out.println("There are no messages to display");
                                    break;
                                    }
                                    System.out.println("Displaying messages sent to " + contactname4 + ":");
                                     System.out.println(Message41);
                                    System.out.println(Message42);
                                    System.out.println(Message43);
                                    break;
                                case 5:// DISPLAYING MESSAGES SENT TO CONTACT5
                                    if(Message51 == "" && Message52 ==""&&Message53 == ""){System.out.println("There are no messages to display");
                                    break;
                                    }
                                    System.out.println("Displaying messages sent to " + contactname5 + ":");
                                     System.out.println(Message51);
                                    System.out.println(Message52);
                                    System.out.println(Message53);
                                    break;
                                default:
                                    System.out.println("Your Selection is invalid please enter an integer between 1-5");
                            }
                
                            break;
                        case 4:// CALL HISTORY

                            System.out.println("[1]" + contact1  + "  Outgoing call (" + c1 + ") times");
                            System.out.println("[2]" + contact2  + "  Outgoing call (" + c2 + ") times");
                            System.out.println("[3]" + contact3  + "  Outgoing call (" + c3 + ") times");
                            System.out.println("[4]" + contact4  + "  Outgoing call (" + c4 + ") times");
                            System.out.println("[5]" + contact5  + "  Outgoing call (" + c5 + ") times");

                            break;    
                        default:
                            System.out.println("invalid selection");
                    } 
                }
                break;

            case 4: //CONTACT MANAGEMENT
                while(true){
                System.out.println("-------------------------------------------");
                System.out.println("Enter what to do");
                System.out.println("[1]: Wiew Contact list");
                System.out.println("[2]: Add Contact");
                System.out.println("[3]: delete contact");
                System.out.println("[4]: edit contact"); 
                System.out.println("[5]: Main Menu");
                System.out.println("-------------------------------------------");

                int cm = sc.nextInt();

                if(cm==5){
                cases = true;
                break;        

                }
        
                switch (cm) {
                    case 1://CONTACTLIST
                        System.out.println("Wiewing contact list: ");
                        System.out.println("[1]" + contact1);
                        System.out.println("[2]" + contact2);
                        System.out.println("[3]" + contact3);
                        System.out.println("[4]" + contact4);
                        System.out.println("[5]" + contact5);

                        break;

                    case 2://ADD CONTACT
                        System.out.println("You can only add 5 Contacts to the smartwatch, Select to which number you would like to add the contact: ");
                        System.out.println("[1]" + contact1);
                        System.out.println("[2]" + contact2);
                        System.out.println("[3]" + contact3);
                        System.out.println("[4]" + contact4);
                        System.out.println("[5]" + contact5);
                        int slc = sc.nextInt();
                    
                    switch (slc) {
                        case 1://ADD CONTACT1
                            
                            if(contact1==""){
                            System.out.println("Enter name of the contact: ");
                            empty = sc.nextLine();
                            contactname1 = sc.nextLine();
                            System.out.println("Enter phone number of the contact:");
                             contactnumber1 = sc.nextLine();
                            
                            System.out.println("New contact added.");
                            contact1 =  contactname1  +" : " + contactnumber1;
                            }
                            
                            else {
                                System.out.println("This contact already exists");
                            }
                            break;
                            
                        case 2://ADD CONTACT2
                            if(contact2==""){
                            System.out.println("Enter name of the contact: ");
                          String empty2 = sc.nextLine();
                            contactname2 = sc.nextLine();
                            
                            System.out.println("Enter phone number of the contact: ");
                            contactnumber2 = sc.nextLine();
                            
                            System.out.println("New contact added.");
                            contact2 = contactname2  +" : " + contactnumber2;
                            }
                           else {
                                System.out.println("This contact already exists");
                            }
                                
                            break;
                            
                        case 3://ADD CONTACT3
                            
                            if(contact3==""){
                            System.out.println("Enter name of the contact: ");
                            empty = sc.nextLine();
                            contactname3 = sc.nextLine();
                            
                            System.out.println("Enter phone number of the contact: ");
                            contactnumber3 = sc.nextLine();
                            
                            System.out.println("New contact added.");
                            contact3 =  contactname3  +" : " + contactnumber3;
                            }
                            else {
                                System.out.println("This contact already exists ");
                            }
                            
                            break;
                            
                        case 4://ADD CONTACT4
                            if(contact4==""){
                            System.out.println("Enter name of the contact: ");
                            empty = sc.nextLine();
                            contactname4 = sc.nextLine();
                          
                            System.out.println("Enter phone number of the contact: ");
                            contactnumber4 = sc.nextLine();
                            
                            System.out.println("New contact added.");
                            contact4 = contactname4  +" : " + contactnumber4 ;
                            }
                            
                            break;   
                            
                        case 5://ADD CONTACT5
                            if(contact5 == ""){
                            System.out.println("Enter name of the contact: ");
                            empty = sc.nextLine();
                            contactname5 = sc.nextLine();
                           
                            System.out.println("Enter phone number of the contact: ");
                            contactnumber5 = sc.nextLine();
                            
                            System.out.println("New contact added.");
                            contact5= contactname5  +" : " + contactnumber5;
                            }
                            else{
                                System.out.println("This contact already exists ");
                            }
                    }
                            
                    break;
                    
                    
                case 3:// DELETE CONTACT
                    System.out.println("Select which contact you would like to delete: ");
                    System.out.println("[1]" + contact1);
                    System.out.println("[2]" + contact2);
                    System.out.println("[3]" + contact3);
                    System.out.println("[4]" + contact4);
                    System.out.println("[5]" + contact5);
                    int delete = sc.nextInt();
                    
                    switch (delete) {
                        case 1:// DELETE CONTACT1
                            if(contact1==""){
                                System.out.println("Contact doesn't exist");
                                break;
                            }
                            System.out.println("Deleting " + contact1);
                            contact1 = ""; 
                            
                            break;
                        case 2:// DELETE CONTACT2
                            if(contact2==""){
                                System.out.println("Contact doesn't exist");
                                break;
                            }
                            System.out.println("Deleting " + contact2);
                            contact2 ="";
                            break;
                        case 3:// DELETE CONTACT3
                            if(contact3==""){
                                System.out.println("Contact doesn't exist");
                                break;
                            }
                            System.out.println("Deleting " + contact3);
                            contact3 = "";
                            break;
                        case 4:// DELETE CONTACT4
                            if(contact4==""){
                                System.out.println("Contact doesn't exist");
                                break;
                            }
                            System.out.println("Deleting " + contact4);
                            contact4 = "";
                            break;
                        case 5:// DELETE CONTACT5
                            if(contact5==""){
                                System.out.println("Contact doesn't exist");
                                break;
                            }
                            System.out.println("Deleting " + contact5);
                            contact5 = "";
                            break;
                        default:
                            System.out.println("Your selection is invalid.");
                    }
                    
                
                break;
                    
                case 4: // EDIT CONTACT
                    System.out.println("Select which contact you would like to edit: ");
                    System.out.println("[1]" + contact1);
                    System.out.println("[2]" + contact2);
                    System.out.println("[3]" + contact3);
                    System.out.println("[4]" + contact4);
                    System.out.println("[5]" + contact5);
                    
                    int edit = sc.nextInt();
                    
                    switch (edit) {
                        case 1:// EDIT CONTACT1
                            if(contactnumber1 == ""){
                                System.out.println("There are no such contact to edit");
                            }
                            else {
                                System.out.println("[1] Edit name");
                                System.out.println("[2] Edit Number");
                                System.out.println("[3] Edit Both");
                                int namenumberorboth = sc.nextInt();
                            
                            if(namenumberorboth== 1){
                                System.out.println("Enter the edited name of the contact ");
                                String empty5 = sc.nextLine();
                                contactname1 = sc.nextLine();
                                
                                contact1 =  contactname1  +" : " + contactnumber1;
                            }
                            else if (namenumberorboth== 2){
                                System.out.println("Enter the edited number of the contact");
                                String empty5 =sc.nextLine();
                                contactnumber1 = sc.nextLine();
                                
                            contact1 =  contactname1  +" : " + contactnumber1;
                            }
                            
                            else if (namenumberorboth== 3){
                             System.out.println("Enter the edited name of the contact ");
                                String empty5 = sc.nextLine();
                                contactname1 = sc.nextLine();
                             System.out.println("Enter the edited number of the contact");
                             contactnumber1 = sc.nextLine();
                             contact1 =  contactname1  +" : " + contactnumber1;
                                
                            }
                            else {
                                System.out.println("invalid option.");
                            }
                            }
                            break;
                            
                        case 2:// EDIT CONTACT2
                            if(contactnumber2 == ""){
                                System.out.println("There are no such contact to edit");
                            }
                             else {
                                System.out.println("[1] Edit name");
                                System.out.println("[2] Edit Number");
                                System.out.println("[3] Edit Both");
                                int namenumberorboth = sc.nextInt();
                            
                            if(namenumberorboth== 2){
                                System.out.println("Enter the edited name of the contact ");
                                String empty5 = sc.nextLine();
                                contactname2 = sc.nextLine();
                                
                                contact2 =  contactname2  +" : " + contactnumber2;
                            }
                            else if (namenumberorboth== 2){
                                System.out.println("Enter the edited number of the contact");
                                String empty5 =sc.nextLine();
                                contactnumber2 = sc.nextLine();
                                
                            contact2 =  contactname2  +" : " + contactnumber2;
                            }
                            
                            else if (namenumberorboth== 3){
                             System.out.println("Enter the edited name of the contact ");
                                String empty5 = sc.nextLine();
                                contactname2 = sc.nextLine();
                             System.out.println("Enter the edited number of the contact");
                             contactnumber2 = sc.nextLine();
                             contact2 =  contactname2  +" : " + contactnumber2;
                                
                            }
                            else {
                                System.out.println("invalid option.");
                            }
                            }
                            break;
                            
                            
                        case 3:// EDIT CONTACT3
                            if(contactnumber3 == ""){
                                System.out.println("There are no such contact to edit");
                            }
                             else {
                                System.out.println("[1] Edit name");
                                System.out.println("[2] Edit Number");
                                System.out.println("[3] Edit Both");
                                int namenumberorboth = sc.nextInt();
                            
                            if(namenumberorboth== 1){
                                System.out.println("Enter the edited name of the contact ");
                                String empty5 = sc.nextLine();
                                contactname3 = sc.nextLine();
                                
                                contact3 =  contactname3  +" : " + contactnumber3;
                            }
                            else if (namenumberorboth== 2){
                                System.out.println("Enter the edited number of the contact");
                                String empty6 =sc.nextLine();
                                contactnumber3 = sc.nextLine();
                                
                            contact3 =  contactname3  +" : " + contactnumber3;
                            }
                            
                            else if (namenumberorboth== 3){
                             System.out.println("Enter the edited name of the contact ");
                                String empty5 = sc.nextLine();
                                contactname3 = sc.nextLine();
                             System.out.println("Enter the edited number of the contact");
                             contactnumber3 = sc.nextLine();
                             contact3 =  contactname3  +" : " + contactnumber3;
                                
                            }
                            else {
                                System.out.println("invalid option.");
                            }
                            }
                            break;
                            
                        case 4:// EDIT CONTACT4
                            if(contactnumber4 == ""){
                                System.out.println("There are no such contact to edit");
                            }
                             else {
                                System.out.println("[1] Edit name");
                                System.out.println("[2] Edit Number");
                                System.out.println("[3] Edit Both");
                                int namenumberorboth = sc.nextInt();
                            
                            if(namenumberorboth== 1){
                                System.out.println("Enter the edited name of the contact ");
                                String empty5 = sc.nextLine();
                                contactname4 = sc.nextLine();
                                
                                contact4 =  contactname4  +" : " + contactnumber4;
                            }
                            else if (namenumberorboth== 2){
                                System.out.println("Enter the edited number of the contact");
                                String empty6 =sc.nextLine();
                                contactnumber4 = sc.nextLine();
                                
                            contact4 =  contactname4  +" : " + contactnumber4;
                            }
                            
                            else if (namenumberorboth== 3){
                             System.out.println("Enter the edited name of the contact ");
                                String empty5 = sc.nextLine();
                                contactname4 = sc.nextLine();
                             System.out.println("Enter the edited number of the contact");
                             contactnumber4 = sc.nextLine();
                             contact4 =  contactname4  +" : " + contactnumber4;
                                
                            }
                            else {
                                System.out.println("invalid option.");
                            }
                            }
                            
                            break;
                            
                            
                        case 5:// EDIT CONTACT5
                            if(contactnumber5 == ""){
                                System.out.println("There are no such contact to edit");
                            }
                             else {
                                System.out.println("[1] Edit name");
                                System.out.println("[2] Edit Number");
                                System.out.println("[3] Edit Both");
                                int namenumberorboth = sc.nextInt();
                            
                            if(namenumberorboth== 1){
                                System.out.println("Enter the edited name of the contact ");
                                String empty5 = sc.nextLine();
                                contactname5 = sc.nextLine();
                                
                                contact5 =  contactname5  +" : " + contactnumber5;
                            }
                            else if (namenumberorboth== 2){
                                System.out.println("Enter the edited number of the contact");
                                String empty6 =sc.nextLine();
                                contactnumber5 = sc.nextLine();
                                
                            contact5 =  contactname5  +" : " + contactnumber5;
                            }
                            
                            else if (namenumberorboth== 3){
                             System.out.println("Enter the edited name of the contact ");
                                String empty5 = sc.nextLine();
                                contactname5 = sc.nextLine();
                             System.out.println("Enter the edited number of the contact");
                             contactnumber5 = sc.nextLine();
                             contact5 =  contactname5 +" : " + contactnumber5;
                                
                            }
                            else {
                                System.out.println("invalid option.");
                            }
                            }
                        break;
                   default:System.out.println("Your selection is invalid");
                    }
                } 
                }
               break;

            case 5://GAME (ROCK PAPER SCISSORS)
                {
                while(true){
                    System.out.println("-------------------------------------------"); 
                    System.out.println("TYPE YOUR MOVE:\n ROCK,\n PAPER\n OR SCISSORS ");
                    System.out.println("-------------------------------------------"); 
                    System.out.println("Type EXIT if you want to quit the game");
                    String move =sc.next();

                    if (move.equalsIgnoreCase("exit")) {
                        System.out.println("Exiting rock, paper & scissors!!");
                    cases = true;
                    break;
                    } 
                
               
                    if(!move.equalsIgnoreCase("rock")&&!move.equalsIgnoreCase("paper")&&!move.equalsIgnoreCase("scissors")&&!move.equals("exit")){
                        System.out.println("your move is not valid !");
                     System.out.println("-------------------------------------------"); 
                    }

                    else{
                        int random = (int)(Math.random()*3);
                        String OpponentMove = "";

               
                
                        switch (random) {
                            case 0: OpponentMove = "Rock";
                                break;
                            case 1: OpponentMove = "Paper";
                                break;
                            case 2: OpponentMove = "Scissors";
                                break;
                        }
              
                        System.out.println("Your move is: " + move);
                        System.out.println("Opponent move is: " + OpponentMove);

                        if(move.equalsIgnoreCase(OpponentMove)) {
                            System.out.println("You are tied");
                            System.out.println("-------------------------------------------"); 
                        }

                        else if((move.equalsIgnoreCase("rock")&& OpponentMove.equalsIgnoreCase("scissors")) || (move.equals("paper")&& OpponentMove.equals("rock")) ||(move.equals("scissors"))&&OpponentMove.equals("paper")){
                            System.out.println("YOU WON!!");
                            System.out.println("-------------------------------------------"); 

                        }


                        else {
                            System.out.println("YOU LOST!!");
                            System.out.println("-------------------------------------------"); 
                        }
                    }
                }
                break;
            }
                
                default: System.out.println("Your selection is invalid, Please enter an integer between 1-5");
                    cases=true;
            }
            
            
        }
    
    }
            
}
 


