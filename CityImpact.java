package com.example.maincitypro;
//Isaac Bouwkamp proper code 5/3/22 - 5/12/22
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CityImpact {

    protected String name = "";
    protected String email = "";
    protected String address = "";
    protected String zip = "";
    protected String phone = "";
    protected int numHouseHold = 0;
    protected int numChildren = 0;
    protected int numVeterans = 0;
    protected int numSeniors = 0;
    protected String timeDate;
    protected int status = 0; //New status area

    protected double version = 1.04;

    protected String filePath = "C:\\Users\\idbou\\Desktop\\CityImpactData\\Database.txt";//FilePATH//FilePATH//FilePATH//FilePATH//FilePATH//FilePATH
    protected String filePathToday = "C:\\Users\\idbou\\Desktop\\CityImpactData\\TodayData.txt";//FilePATHtoday//FilePATHtoday//FilePATHtoday//FilePATHtoday//FilePATHtoday//FilePATHtoday//FilePATHtoday


    protected String option0 = " 0 - SAVE";//
    protected String option1 = " 1 - Search";//
    protected String option2 = " 2 - New Guest";//
    protected String option3 = " 3 - Change Data";//
    protected String option4 = " 4 - Delete Guest from Database";//
    protected String option5 = " 5 - Delete Guest from Today's list";//
    protected String option6 = " 6 - Today's List";//
    protected String option7 = " 7 - Today's Total Number";//
    protected String option8 = " 8 - Database List";//
    protected String option9 = " 9 - Database Total Number";//
    protected String option10 = " 10 - All Emails";//
    protected String option11 = " 12 - LOAD lost Today's List Data";//

    protected boolean input = false;
    protected int save = 0;
    protected int search = 1;
    protected int newGuest = 2;
    protected int changeData = 3;
    protected int deleteFromDatabase = 4;
    protected int deleteFromToday = 5;
    protected int todayList = 6;
    protected int todayTotalNum = 7;
    protected int databaseList = 8;
    protected int databaseTotalNum = 9;
    protected int allEmails = 10;
    protected int loadLostToday = 12;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void Cityimpact(){
        this.name = "";
        this.email = "";
        this.address = "";
        this.zip = "";
        this.phone = "";
        this.numHouseHold = 0;
        this.numChildren = 0;
        this.numVeterans = 0;
        this.numSeniors = 0;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getZip(){
        return this.zip;
    }

    public void setZip(String zip){
        this.zip = zip;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public int getNumHouseHold(){
        return this.numHouseHold;
    }

    public void setNumHouseHold(int numHouseHold){
        this.numHouseHold = numHouseHold;
    }

    public int getNumChildren(){
        return this.numChildren;
    }

    public void setNumChildren(int numChildren){
        this.numChildren = numChildren;
    }

    public int getNumVeterans(){
        return this.numVeterans;
    }

    public void setNumVeterans(int numVeterans){
        this.numVeterans = numVeterans;
    }

    public int getNumSeniors(){
        return this.numSeniors;
    }

    public void setNumSeniors(int numSeniors){
        this.numSeniors = numSeniors;
    }

    public String getTimeDate(){
        return timeDate;
    }

    public void setTimeDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss"); // change hh to HH to have military time
        LocalDateTime now = LocalDateTime.now();
        this.timeDate = dtf.format(now);

    }

    public void setTimeDate(String day){
        this.timeDate = day;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public int getStatus(){
        return this.status;
    }


    public void load(ArrayList<CityImpact> city){

        //int con = 0;
        int insideCount = 0;
        try { //Loading

            CityImpact c = new CityImpact();

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = "";
            while((line = reader.readLine()) != null) {
                if (insideCount == 0) {

                    city.add(c = new CityImpact()); //New object to put into the list

                    c.setName(line);
                    insideCount++;
                    //System.out.println(c.getName());
                } else if (insideCount == 1) {
                    c.setEmail(line);
                    insideCount++;
                    //System.out.println(c.getEmail());
                } else if (insideCount == 2) {
                    c.setAddress(line);
                    insideCount++;
                    //System.out.println(c.getAddress());
                } else if (insideCount == 3) {
                    c.setZip(line);
                    insideCount++;
                    //System.out.println(c.getZip());
                } else if (insideCount == 4) {
                    c.setPhone(line);
                    insideCount++;
                    //System.out.println(c.getPhone());
                } else if (insideCount == 5) {
                    c.setNumHouseHold(Integer.parseInt(line));
                    insideCount++;
                    //System.out.println(c.getNumHouseHold());
                } else if (insideCount == 6) {
                    c.setNumChildren(Integer.parseInt(line));
                    insideCount++;
                    //System.out.println(c.getNumChildren());
                } else if (insideCount == 7) {
                    c.setNumVeterans(Integer.parseInt(line));
                    insideCount++;
                    //System.out.println(c.getNumVeterans());
                } else if (insideCount == 8) {
                    c.setNumSeniors(Integer.parseInt(line));
                    insideCount++;

                } else if (insideCount == 9){
                    c.setTimeDate(line);
                    insideCount++; // Change this for status from insideCount = 0 to insideCount++;//////////////////////////////////////////
                    //con++;
                }
                //insideCount = 0;
                //When transfer the new code, comment out this next else if and change the above insideCount = 0;
                // /*
                else if (insideCount == 10){///////////////////////////////////////////////////////////////////////
                    c.setStatus(Integer.parseInt(line));
                    insideCount = 0;
                }
                // */
                //Add status of person
            }
            reader.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }//End of Load

    public String menu(){
        return "" + this.option0 + "\n" + option1 + "\n" + option2 + "\n" + option3 + "\n" + option4 + "\n" +
                option5 + "\n" + option6 + "\n" + option7 + "\n" + option8 + "\n" + option9 + "\n" +
                option10 + "\n" + option11 + "\n";
    }

    public String versionDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss"); // change hh to HH to have military time
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now) + "\n" + (" Version " + version) + "\n";
    }

    public boolean correctInputMenu(String in){
        int inp = 0;
        try{
            inp = Integer.valueOf(in);
        }
        catch(NumberFormatException e){
            inp = -1;
            System.out.println(":P wrong input :P");
        }

        if (inp == this.save || inp == this.search || inp == this.newGuest || inp == this.changeData || inp == this.deleteFromDatabase || inp == this.deleteFromToday
                || inp == this.todayList || inp == this.todayTotalNum || inp == this.databaseList || inp == this.databaseTotalNum || inp == this.allEmails
                || inp == this.loadLostToday) {  //this just makes sure the program doesn't crash
            return true;
        }
        return false;
    }//End of correct input menu

    public void save(ArrayList<CityImpact> cityImpactArrayList, ArrayList<CityImpact> currentDayList){
        //System.out.println("Saving");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(this.filePath));
            for (int i = 0; i < cityImpactArrayList.size(); i++) {


                bw.write(cityImpactArrayList.get(i).getName() + "\n");
                bw.write(cityImpactArrayList.get(i).getEmail() + "\n");
                bw.write(cityImpactArrayList.get(i).getAddress() + "\n");
                bw.write(cityImpactArrayList.get(i).getZip() + "\n");
                bw.write(cityImpactArrayList.get(i).getPhone() + "\n");
                bw.write(cityImpactArrayList.get(i).getNumHouseHold() + "\n");
                bw.write(cityImpactArrayList.get(i).getNumChildren() + "\n");
                bw.write(cityImpactArrayList.get(i).getNumVeterans() + "\n");
                bw.write(cityImpactArrayList.get(i).getNumSeniors() + "\n");
                bw.write(cityImpactArrayList.get(i).getTimeDate() + "\n");
                bw.write(cityImpactArrayList.get(i).getStatus() + "\n");//////////////////////////////add status/\/\/
            }
            //System.out.println("Saved Database");
            bw.close();
        } catch (FileNotFoundException error) {
            System.out.println("File not found ");
        } catch (Exception ex) {
            System.out.println("Something went wrong");
            return;
        }

        try {
            BufferedWriter bmw = new BufferedWriter(new FileWriter(this.filePathToday));
            for (int i = 0; i < currentDayList.size(); i++) {

                bmw.write(currentDayList.get(i).getName() + "\n");
                bmw.write(currentDayList.get(i).getEmail() + "\n");
                bmw.write(currentDayList.get(i).getAddress() + "\n");
                bmw.write(currentDayList.get(i).getZip() + "\n");
                bmw.write(currentDayList.get(i).getPhone() + "\n");
                bmw.write(currentDayList.get(i).getNumHouseHold() + "\n");
                bmw.write(currentDayList.get(i).getNumChildren() + "\n");
                bmw.write(currentDayList.get(i).getNumVeterans() + "\n");
                bmw.write(currentDayList.get(i).getNumSeniors() + "\n");
                bmw.write(currentDayList.get(i).getTimeDate() + "\n");
                bmw.write(currentDayList.get(i).getStatus() + "\n");/////////////////////////////////add Status/\/\/
            }
            //System.out.println("Saved Today's List");
            bmw.close();
        } catch (FileNotFoundException error) {
            System.out.println("File not found ");
        } catch (Exception ex) {
            System.out.println("Something went wrong");
            return;
        }
    }//End of Saving

    public void search(ArrayList<CityImpact> cityImpactArrayList, ArrayList<CityImpact> currentDayList){
        System.out.println("Search any part of the name");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        int counts = input.length();

        for (int i = 0; i < cityImpactArrayList.size(); i++) {
            //System.out.println("Got to the size of the data array");
            for (int k = 0; k < cityImpactArrayList.get(i).getName().length(); k++) {
                //System.out.println("Got size of the " + i + " name");
                if (k + counts <= cityImpactArrayList.get(i).getName().length()) {
                    //System.out.println("passed check for index location" + k + " " + counts);
                    if (input.equals(cityImpactArrayList.get(i).getName().toLowerCase().substring(k, k + counts))) {
                        System.out.println("Name: " + cityImpactArrayList.get(i).getName());
                        System.out.println("Email: " + cityImpactArrayList.get(i).getEmail());
                        System.out.println("Address: " + cityImpactArrayList.get(i).getAddress());
                        System.out.println("ZIP code: " + cityImpactArrayList.get(i).getZip());
                        System.out.println("Phone number: " + cityImpactArrayList.get(i).getPhone());
                        System.out.println("Number of people in household: " + cityImpactArrayList.get(i).getNumHouseHold());
                        System.out.println("Number of children: " + cityImpactArrayList.get(i).getNumChildren());
                        System.out.println("Number of veterans: " + cityImpactArrayList.get(i).getNumVeterans());
                        System.out.println("Number of seniors: " + cityImpactArrayList.get(i).getNumSeniors());
                        System.out.println("Date: " + cityImpactArrayList.get(i).getTimeDate());
                        System.out.println("Status: " + cityImpactArrayList.get(i).getStatus());
                        System.out.println();////////////////////////////////////////////////////// add Status/\/\/

                    }
                }
            }
        }
        System.out.println();


        int complete = 0;
        System.out.println("Copy/Type the name to add to today's list, press ENTER to not add to the today's list");
        Scanner scanConfirm = new Scanner(System.in);
        String confName = scanConfirm.nextLine();

        CityImpact curr = new CityImpact();
        for (int i = 0; i < cityImpactArrayList.size(); i++) {
            if (confName.equals(cityImpactArrayList.get(i).getName())) {
                curr.setName(cityImpactArrayList.get(i).getName());
                curr.setEmail(cityImpactArrayList.get(i).getEmail());
                curr.setAddress(cityImpactArrayList.get(i).getAddress());
                curr.setZip(cityImpactArrayList.get(i).getZip());
                curr.setPhone(cityImpactArrayList.get(i).getPhone());
                curr.setNumHouseHold(cityImpactArrayList.get(i).getNumHouseHold());
                curr.setNumChildren(cityImpactArrayList.get(i).getNumChildren());
                curr.setNumVeterans(cityImpactArrayList.get(i).getNumVeterans());
                curr.setNumSeniors(cityImpactArrayList.get(i).getNumSeniors());
                curr.setTimeDate();
                /////////////////////////////////////////////////////////////////////////////add status

                System.out.println("What is their status? 1 - Emergency, 2 - Income Programs, 3 - Insufficient Income");

                Scanner scanStatus = new Scanner(System.in);
                String statusInput = scanStatus.nextLine();


                try{
                    int statusNumber = Integer.parseInt(statusInput);//Add something to let user know if the status went in
                    cityImpactArrayList.get(i).setStatus(statusNumber);
                }
                catch (NumberFormatException ex){
                    //ex.printStackTrace();
                }
                curr.setStatus(cityImpactArrayList.get(i).getStatus());

                currentDayList.add(curr);
                complete++;
            }
        }
        if (complete > 0) {
            System.out.println(confName + " has been added to today's list"); //Add something on the status
        } else if(confName.equals("")) {
            System.out.println("Continue");
        }
        else{
            System.out.println("Incorrect Name (Must be exact)");
        }
    }//End of search

    public void newGuest(ArrayList<CityImpact> cityImpactArrayList, ArrayList<CityImpact> currentDayList){
        int isInData = 0;
        System.out.println("What is the name of guest?");
        Scanner Gname = new Scanner(System.in);
        String newNa = Gname.nextLine();
        String fastName = newNa;
        fastName = fastName.toLowerCase();
        for (int n = 0; n < cityImpactArrayList.size(); n++) {
            if (fastName.equals(cityImpactArrayList.get(n).getName().toLowerCase())) {
                System.out.println("This name is already in the database");
                isInData++;
            }
        }
        if(isInData == 0) {
            String name = newNa;
            CityImpact Guest = new CityImpact();
            Guest.setName(name);

            System.out.println("What is their email?");
            Scanner Gemail = new Scanner(System.in);
            String email = Gemail.nextLine();
            Guest.setEmail(email);

            System.out.println("What is their home address?");
            Scanner Gaddress = new Scanner(System.in);
            String address = Gaddress.nextLine();
            Guest.setAddress(address);

            System.out.println("What is their ZIP code?");
            Scanner Gzip = new Scanner(System.in);
            String zip = Gzip.nextLine();
            Guest.setZip(zip);

            System.out.println("What is their phone number?");
            Scanner Gphone = new Scanner(System.in);
            String phone = Gphone.nextLine();
            Guest.setPhone(phone);

            System.out.println("What is the number of people in their household?");
            Scanner GnumHouseHold = new Scanner(System.in);
            if (GnumHouseHold.hasNextInt()) {
                int numHouseHold = GnumHouseHold.nextInt();
                Guest.setNumHouseHold(numHouseHold);
            } else {
                Guest.setNumHouseHold(999);
                System.out.println("That is not a number, household set to 999 /////////////////////////////");
                System.out.println("Change this data in the Change data from menu //////////////////////////");
            }

            System.out.println("What is the number of children?");
            Scanner GnumChildren = new Scanner(System.in);
            if (GnumChildren.hasNextInt()) {
                int numChildren = GnumChildren.nextInt();
                Guest.setNumChildren(numChildren);
            } else {
                Guest.setNumChildren(999);
                System.out.println("That is not a number, children set to 999 /////////////////////////////");
                System.out.println("Change this data in the Change data from menu //////////////////////////");
            }

            System.out.println("What is the number of veterans?");
            Scanner GnumVeterans = new Scanner(System.in);
            if (GnumVeterans.hasNextInt()) {
                int numVeterans = GnumVeterans.nextInt();
                Guest.setNumVeterans(numVeterans);
            } else {
                Guest.setNumVeterans(999);
                System.out.println("That is not a number, veterans set to 999 /////////////////////////////");
                System.out.println("Change this data in the Change data from menu //////////////////////////");
            }

            System.out.println("What is the number of seniors 65+ ?");
            Scanner GnumSeniors = new Scanner(System.in);
            if (GnumSeniors.hasNextInt()) {
                int numSeniors = GnumSeniors.nextInt();
                Guest.setNumSeniors(numSeniors);
            } else {
                Guest.setNumSeniors(999);
                System.out.println("That is not a number, seniors set to 999 /////////////////////////////");
                System.out.println("Change this data in the Change data from menu //////////////////////////");
            }

            ///*
            System.out.println("What is the status of the person");///////Work on status here!!!!
            Scanner GStatus = new Scanner(System.in);
            if (GStatus.hasNextInt()){
                int status = GStatus.nextInt();
                Guest.setStatus(status);
            } else {
                Guest.setStatus(0);
                System.out.println("That is not a number, status set to 0 ///////////////////////////////");
                System.out.println("Change this data in the Change data from menu //////////////////////////");
            }
            //*/
            Guest.setTimeDate();
            /////////////////////////////////////////////////////////////////STATUS is above/\/\/
            //double check final output
            System.out.println("Name: " + Guest.getName());
            System.out.println("Email: " + Guest.getEmail());
            System.out.println("Address: " + Guest.getAddress());
            System.out.println("ZIP code: " + Guest.getZip());
            System.out.println("Phone number: " + Guest.getPhone());
            System.out.println("Number of people in household: " + Guest.getNumHouseHold());
            System.out.println("Number of children: " + Guest.getNumChildren());
            System.out.println("Number of veterans: " + Guest.getNumVeterans());
            System.out.println("Number of seniors: " + Guest.getNumSeniors());
            System.out.println("Date: " + Guest.getTimeDate());
            System.out.println("Status: " + Guest.getStatus());
            /////////////////////////////////////////////////////////////////////////add Status/\/\/

            cityImpactArrayList.add(Guest);
            currentDayList.add(Guest);

            System.out.println();

        }
    }//End of newGuest

    public void databaseList(ArrayList<CityImpact> cityImpactArrayList){
        System.out.println("All information in Data file");
        CityImpact person = new CityImpact();
        for (int i = 0; i < cityImpactArrayList.size(); i++) {
            person = cityImpactArrayList.get(i);

            System.out.print(ANSI_BLUE + "Name: " + ANSI_RESET + person.getName() + " ");
            System.out.print(ANSI_BLUE + "Email: " + ANSI_RESET + person.getEmail() + " ");
            System.out.print(ANSI_BLUE + "Address: " + ANSI_RESET + person.getAddress() + " ");
            System.out.print(ANSI_BLUE + "ZIP code: " + ANSI_RESET + person.getZip() + " ");
            System.out.print(ANSI_BLUE + "Phone number: " + ANSI_RESET + person.getPhone() + " ");
            System.out.print(ANSI_BLUE + "#ppl in house: " + ANSI_RESET + person.getNumHouseHold() + " ");
            System.out.print(ANSI_BLUE + "#children: " + ANSI_RESET + person.getNumChildren() + " ");
            System.out.print(ANSI_BLUE + "#veterans: " + ANSI_RESET + person.getNumVeterans() + " ");
            System.out.print(ANSI_BLUE + "#seniors: " + ANSI_RESET + person.getNumSeniors() + " ");
            System.out.print(ANSI_BLUE + "Date: " + ANSI_RESET + person.getTimeDate() + " ");
            System.out.print(ANSI_BLUE + "Status: " + ANSI_RESET + person.getStatus() + " ");
            ////////////////////////////////////////////////////////////////////add Status/\/\/
            System.out.println();
        }
    }//End of DatabaseList

    public void allEmails(ArrayList<CityImpact> cityImpactArrayList){
        CityImpact person1 = new CityImpact();
        for (int i = 0; i < cityImpactArrayList.size(); i++) {
            person1 = cityImpactArrayList.get(i);
            System.out.print(person1.getEmail() + " ");
        }
        System.out.println();
        System.out.println();
    }//End of allEmails

    public void changeData(ArrayList<CityImpact> cityImpactArrayList, ArrayList<CityImpact> currentDayList){
        String foundName = "";
        int count = 0;
        int found = 0;
        String foundNameToday = "";
        int countToday = 0;
        int foundToday = 0;

        System.out.println("Who's data do you want to change?");
        Scanner cname = new Scanner(System.in);
        String searchName = cname.nextLine();

        //System.out.println(searchName);      //What came in
        CityImpact findPerson = new CityImpact();
        for (int i = 0; i < cityImpactArrayList.size(); i++) {  //Looks for the name in the array list
            findPerson = cityImpactArrayList.get(i);

            if (searchName.equals(cityImpactArrayList.get(i).getName())) {
                foundName = searchName;
                count = i;
                found = 1;
            }
        }

        CityImpact findPersonToday = new CityImpact();
        for (int i = 0; i < currentDayList.size(); i++) {  //Looks for the name in the array list
            findPersonToday = currentDayList.get(i);

            if (searchName.equals(currentDayList.get(i).getName())) {
                foundNameToday = searchName;
                countToday = i;
                foundToday = 1;
            }
        }

        if (found == 1) { //asking what part of the data needs to be changed
            int change = 0;
            while(change == 0){
                System.out.println("What data do you want to change?");
                System.out.println(" n - Name");
                System.out.println(" e - Email");
                System.out.println(" a - Address");
                System.out.println(" z - ZIP Code");
                System.out.println(" p - Phone Number");
                System.out.println(" h - Number In Household");
                System.out.println(" c - Number Of Children");
                System.out.println(" v - Number Of Veterans");
                System.out.println(" s - Number Of Seniors");
                System.out.println(" t - Status");
                /////////////////////////////////////////////////////////////////Add Status////\/\/\/\/

                Scanner varin = new Scanner(System.in);
                String in2 = varin.nextLine();

                if (in2.equals("n") || in2.equals("e") || in2.equals("a") || in2.equals("z") || in2.equals("p") || in2.equals("h")
                        || in2.equals("c") || in2.equals("v") || in2.equals("s") || in2.equals("t")) {
                    /////////////////////////////////////////////////////////////Add Status///\/\/\/\/\/\/
                    if (in2.equals("n")) {
                        System.out.println("What is the new Name?");
                        Scanner name1 = new Scanner(System.in);
                        String newName = name1.nextLine();
                        cityImpactArrayList.get(count).setName(newName);
                        if (foundToday > 0) {
                            currentDayList.get(countToday).setName(newName);
                            //System.out.println("");
                            // this is the place for the confermation of the change
                        }
                    }
                    if (in2.equals("e")) {
                        System.out.println("What is the new email?");
                        Scanner email2 = new Scanner(System.in);
                        String newEmail = email2.nextLine();
                        cityImpactArrayList.get(count).setEmail(newEmail);
                        if (foundToday > 0) {
                            currentDayList.get(countToday).setEmail(newEmail);
                        }

                    }

                    if (in2.equals("a")) {
                        System.out.println("What is the new address?");
                        Scanner address2 = new Scanner(System.in);
                        String newAddress = address2.nextLine();
                        cityImpactArrayList.get(count).setAddress(newAddress);
                        if (foundToday > 0) {
                            currentDayList.get(countToday).setAddress(newAddress);
                        }

                    }
                    if (in2.equals("z")) {
                        System.out.println("What is the new ZIP code?");
                        Scanner zip3 = new Scanner(System.in);
                        String newZip = zip3.nextLine();
                        cityImpactArrayList.get(count).setZip(newZip);
                        if (foundToday > 0) {
                            currentDayList.get(countToday).setZip(newZip);
                        }

                    }
                    if (in2.equals("p")) {
                        System.out.println("What is the new phone number?");
                        Scanner phone4 = new Scanner(System.in);
                        String newPhone = phone4.nextLine();
                        cityImpactArrayList.get(count).setPhone(newPhone);
                        if (foundToday > 0) {
                            currentDayList.get(countToday).setPhone(newPhone);
                        }

                    }
                    if (in2.equals("h")) {
                        System.out.println("What is the new number of people in household?");
                        Scanner numHouse5 = new Scanner(System.in);
                        if (numHouse5.hasNextInt()) {
                            int newHouse = numHouse5.nextInt();
                            cityImpactArrayList.get(count).setNumHouseHold(newHouse);
                            if (foundToday > 0) {
                                currentDayList.get(countToday).setNumHouseHold(newHouse);
                            }
                        } else {
                            System.out.println("That is not a number, RESETTING");
                        }

                    }
                    if (in2.equals("c")) {
                        System.out.println("What is the new number of children?");
                        Scanner numChildren6 = new Scanner(System.in);
                        if (numChildren6.hasNextInt()) {
                            int newChildren = numChildren6.nextInt();
                            cityImpactArrayList.get(count).setNumChildren(newChildren);
                            if (foundToday > 0) {
                                currentDayList.get(countToday).setNumChildren(newChildren);
                            }
                        } else {
                            System.out.println("That is not a number, RESETTING");
                        }

                    }
                    if (in2.equals("v")) {
                        System.out.println("What is the new number of veterans?");
                        Scanner numVeterans7 = new Scanner(System.in);
                        if (numVeterans7.hasNextInt()) {
                            int newVeterans = numVeterans7.nextInt();
                            cityImpactArrayList.get(count).setNumVeterans(newVeterans);
                            if (foundToday > 0) {
                                currentDayList.get(countToday).setNumVeterans(newVeterans);
                            }
                        } else {
                            System.out.println("That is not a number, RESETTING");
                        }

                    }
                    if (in2.equals("s")) {
                        System.out.println("What is the new number of Seniors?");
                        Scanner numSeniors8 = new Scanner(System.in);
                        if (numSeniors8.hasNextInt()) {
                            int newSeniors = numSeniors8.nextInt();
                            cityImpactArrayList.get(count).setNumSeniors(newSeniors);
                            if (foundToday > 0) {
                                currentDayList.get(countToday).setNumSeniors(newSeniors);
                            }
                        } else {
                            System.out.println("That is not an option, RESETTING");
                        }

                    }

                    /////////////////////////////////////////////////////Add Status//////////\/\/\/\/\/
                    ///*
                    if (in2.equals("t")) {
                        System.out.println("What is the new Status? 1 - Emergency, 2 - Income Programs, 3 - Insufficient Income");
                        Scanner status9 = new Scanner(System.in);
                        if (status9.hasNextInt()) {
                            int newStatus = status9.nextInt();
                            cityImpactArrayList.get(count).setStatus(newStatus);
                            if (foundToday > 0) {
                                currentDayList.get(countToday).setStatus(newStatus);
                            }
                        } else {
                            System.out.println("That is not an option, RESETTING");
                        }
                    }//*/
                }
                System.out.println("Do you want to change anything else about " + searchName + "? y/n");
                Scanner answer = new Scanner(System.in);
                String YNAnswer = answer.nextLine();

                if (YNAnswer.equals("n")) {
                    change = 1;
                }
            }
        } else {
            System.out.println("Name was not found, is it spelled correctly?");
        }
    }//End of changeData

    public void deleteFromDatabase(ArrayList<CityImpact> cityImpactArrayList, ArrayList<CityImpact> currentDayList){
        System.out.println("Who's data do you want to delete from database?");
        Scanner cname = new Scanner(System.in);
        String deleteName = cname.nextLine();

        for (int i = 0; i < cityImpactArrayList.size(); i++) {  //Looks for the name in the array list

            if (deleteName.equals(cityImpactArrayList.get(i).getName())) {
                cityImpactArrayList.remove(i);
                System.out.println("Successfully deleted " + deleteName + " from database");
            }
        }
        for (int i = 0; i < currentDayList.size(); i++) {  //Looks for the name in the array list
            if (deleteName.equals(currentDayList.get(i).getName())) {
                currentDayList.remove(i);
                System.out.println("Successfully deleted " + deleteName + " from today's list");

            }
        }
    }//End of deleteFromDatabase
    //so many duplicates
    public void deleteFromToday(ArrayList<CityImpact> currentDayList){
        System.out.println("Who's data do you want to delete in today's list?");
        Scanner cname = new Scanner(System.in);
        String deleteTodayName = cname.nextLine();

        for (int i = 0; i < currentDayList.size(); i++) {  //Looks for the name in the array list

            if (deleteTodayName.equals(currentDayList.get(i).getName())) {
                currentDayList.remove(i);
                System.out.println("Successfully deleted " + deleteTodayName + " from today's list");
            }
        }
    }//End of deleteFromToday

    public void databaseTotalNum(ArrayList<CityImpact> cityImpactArrayList){
        int countNumHousehold = 0;
        int countNumChildren = 0;
        int countNumVeterans = 0;
        int countNumSeniors = 0;
        int countTotal = 0;
        int countStatus0 = 0;//no status
        int countStatus1 = 0;//all emergencies
        int countStatus2 = 0;//Income Programs
        int countStatus3 = 0;//Insufficient Income

        for (int i = 0; i < cityImpactArrayList.size(); i++) {
            countNumHousehold += cityImpactArrayList.get(i).getNumHouseHold();
            countNumChildren += cityImpactArrayList.get(i).getNumChildren();
            countNumVeterans += cityImpactArrayList.get(i).getNumVeterans();
            countNumSeniors += cityImpactArrayList.get(i).getNumSeniors();
            countTotal++;
            if(cityImpactArrayList.get(i).getStatus() == 1){
                countStatus1++;
            } else if(cityImpactArrayList.get(i).getStatus() == 2){
                countStatus2++;
            } else if(cityImpactArrayList.get(i).getStatus() == 3){
                countStatus3++;
            } else{
                countStatus0++;
            }
        }


        System.out.println("Total Number Of People: " + countTotal);
        System.out.println("Total Number Of People Per Household: " + countNumHousehold);
        System.out.println("Total Number Of Children: " + countNumChildren);
        System.out.println("Total Number Of Veterans: " + countNumVeterans);
        System.out.println("Total Number Of Seniors: " + countNumSeniors);
        System.out.println("Total Number Of 1 - Emergencies: " + countStatus1);
        System.out.println("Total Number Of 2 - Income Programs: " + countStatus2);
        System.out.println("Total Number Of 3 - Insufficient Income: " + countStatus3);
        System.out.println("Total Number Of No Status: " + countStatus0);
        System.out.println();
    }//End of databaseTotalNum
    //These two are identical, no reason to have both
    public void todayTotalNum(ArrayList<CityImpact> currentDayList){
        int countDNumHousehold = 0;
        int countDNumChildren = 0;
        int countDNumVeterans = 0;
        int countDNumSeniors = 0;
        int countDTotal = 0;
        int countDStatus0 = 0;//no status
        int countDStatus1 = 0;//all emergencies
        int countDStatus2 = 0;//Income Programs
        int countDStatus3 = 0;//Insufficient Income

        for (int i = 0; i < currentDayList.size(); i++) {
            countDNumHousehold += currentDayList.get(i).getNumHouseHold();
            countDNumChildren += currentDayList.get(i).getNumChildren();
            countDNumVeterans += currentDayList.get(i).getNumVeterans();
            countDNumSeniors += currentDayList.get(i).getNumSeniors();
            countDTotal++;
            if(currentDayList.get(i).getStatus() == 1){
                countDStatus1++;
            } else if(currentDayList.get(i).getStatus() == 2){
                countDStatus2++;
            } else if(currentDayList.get(i).getStatus() == 3){
                countDStatus3++;
            } else{
                countDStatus0++;
            }
        }

        //System.out.println(dtf.format(now));
        System.out.println("Total Number Of People Today: " + countDTotal);
        System.out.println("Total Number Of People Per Household: " + countDNumHousehold);
        System.out.println("Total Number Of Children: " + countDNumChildren);
        System.out.println("Total Number Of Veterans: " + countDNumVeterans);
        System.out.println("Total Number Of Seniors: " + countDNumSeniors);
        System.out.println("Total Number Of 1 - Emergencies: " + countDStatus1);
        System.out.println("Total Number Of 2 - Income Programs: " + countDStatus2);
        System.out.println("Total Number Of 3 - Insufficient Income: " + countDStatus3);
        System.out.println("Total Number Of No Status: " + countDStatus0);
        System.out.println();
    }//End of todayTotalNum

    public void todayList(ArrayList<CityImpact> currentDayList){
        System.out.println("All current day information");
        CityImpact person = new CityImpact();
        for (int i = 0; i < currentDayList.size(); i++) {
            person = currentDayList.get(i);

            System.out.print(ANSI_BLUE + "Name: " + ANSI_RESET + person.getName() + " ");
            System.out.print(ANSI_BLUE + "Email: " + ANSI_RESET + person.getEmail() + " ");
            System.out.print(ANSI_BLUE + "Address: " + ANSI_RESET + person.getAddress() + " ");
            System.out.print(ANSI_BLUE + "ZIP code: " + ANSI_RESET + person.getZip() + " ");
            System.out.print(ANSI_BLUE + "Phone number: " + ANSI_RESET + person.getPhone() + " ");
            System.out.print(ANSI_BLUE + "#ppl in house: " + ANSI_RESET + person.getNumHouseHold() + " ");
            System.out.print(ANSI_BLUE + "#children: " + ANSI_RESET + person.getNumChildren() + " ");
            System.out.print(ANSI_BLUE + "#veterans: " + ANSI_RESET + person.getNumVeterans() + " ");
            System.out.print(ANSI_BLUE + "#seniors: " + ANSI_RESET + person.getNumSeniors() + " ");
            System.out.print(ANSI_BLUE + "Date: " + ANSI_RESET + person.getTimeDate() + " ");
            System.out.print(ANSI_BLUE + "Status: " + ANSI_RESET + person.getStatus() + " ");
            /////////////////////////////////////////////////////////////////////add Status
            System.out.println();
        }
    }//End of todayList

    public void loadLostToday(ArrayList<CityImpact> currentDayList){
        System.out.println("Loading last Today's list data");

        int insideCountToday = 0;
        try { //Loading

            CityImpact c = new CityImpact();

            BufferedReader reader = new BufferedReader(new FileReader(filePathToday));
            String lines = "";
            while((lines = reader.readLine()) != null) {
                if (insideCountToday == 0) {

                    currentDayList.add(c = new CityImpact()); //New object to put into the list

                    c.setName(lines);
                    insideCountToday++;
                    //System.out.println(c.getName());
                } else if (insideCountToday == 1) {
                    c.setEmail(lines);
                    insideCountToday++;
                    //System.out.println(c.getEmail());
                } else if (insideCountToday == 2) {
                    c.setAddress(lines);
                    insideCountToday++;
                    //System.out.println(c.getAddress());
                } else if (insideCountToday == 3) {
                    c.setZip(lines);
                    insideCountToday++;
                    //System.out.println(c.getZip());
                } else if (insideCountToday == 4) {
                    c.setPhone(lines);
                    insideCountToday++;
                    //System.out.println(c.getPhone());
                } else if (insideCountToday == 5) {
                    c.setNumHouseHold(Integer.parseInt(lines));
                    insideCountToday++;
                    //System.out.println(c.getNumHouseHold());
                } else if (insideCountToday == 6) {
                    c.setNumChildren(Integer.parseInt(lines));
                    insideCountToday++;
                    //System.out.println(c.getNumChildren());
                } else if (insideCountToday == 7) {
                    c.setNumVeterans(Integer.parseInt(lines));
                    insideCountToday++;
                    //System.out.println(c.getNumVeterans());
                } else if (insideCountToday == 8) {
                    c.setNumSeniors(Integer.parseInt(lines));
                    insideCountToday++;

                } else if (insideCountToday == 9){
                    c.setTimeDate(lines);
                    insideCountToday++;
                    //con++;///////////////////////////////////////////////////////////////////Add Status/\/\/
                } else if (insideCountToday == 10) {
                    c.setStatus(Integer.parseInt(lines));
                    insideCountToday = 0;
                }
            }
            reader.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Loading failed");
        }
        System.out.println("Loaded last Today's list data successfully");
    }//End of loadLostToday

    public void mainOptions(CityImpact MASTER, ArrayList<CityImpact> cityImpactArrayList, ArrayList<CityImpact> currentDayList, int in){
        if(in == this.save){
            MASTER.save(cityImpactArrayList, currentDayList);
            System.out.println("SAVED EVERYTHING");
        }
        if(in == this.search){
            MASTER.search(cityImpactArrayList, currentDayList);
        }
        if(in == this.newGuest){
            MASTER.newGuest(cityImpactArrayList, currentDayList);
        }
        if(in == this.databaseList){
            MASTER.databaseList(cityImpactArrayList);
        }
        if(in == this.allEmails){
            MASTER.allEmails(cityImpactArrayList);
        }
        if(in == this.changeData){
            MASTER.changeData(cityImpactArrayList, currentDayList);
        }
        if(in == this.deleteFromDatabase){
            MASTER.deleteFromDatabase(cityImpactArrayList, currentDayList);
        }
        if(in == this.deleteFromToday){
            MASTER.deleteFromToday(currentDayList);
        }
        if(in == this.databaseTotalNum){
            MASTER.databaseTotalNum(cityImpactArrayList);
        }
        if(in == this.todayTotalNum){
            MASTER.todayTotalNum(currentDayList);
        }
        if(in == this.todayList){
            MASTER.todayList(currentDayList);
        }
        if(in == this.loadLostToday){
            MASTER.loadLostToday(currentDayList);
        }
    }//End of all the options

    public static void main(String[] arg){

        CityImpact MASTER = new CityImpact();


        ArrayList<CityImpact> cityImpactArrayList = new ArrayList();
        ArrayList<CityImpact> currentDayList = new ArrayList();

        MASTER.load(cityImpactArrayList);
        System.out.println(MASTER.versionDate());
        System.out.println(MASTER.menu());

        //System.out.println(cityImpactArrayList.toString());//Testing to see if things are loading in.

        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {

            String into = s.next();
            if(MASTER.correctInputMenu(into)){
                int in = Integer.valueOf(into);
                MASTER.mainOptions(MASTER, cityImpactArrayList, currentDayList, in);
                MASTER.save(cityImpactArrayList, currentDayList);
                System.out.println("Auto Saved");
                System.out.println(MASTER.menu());
            }//End of correct input on the menu
        }//End of the original while loop
    }//End of MAIN
}//End of Class
