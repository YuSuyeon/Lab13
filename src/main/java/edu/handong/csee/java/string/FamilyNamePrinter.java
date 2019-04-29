package edu.handong.csee.java.string;

public class FamilyNamePrinter{

    private String[] stringNames;
    private String[] familyNames;

    public static void main(String[] args){

        String names = args[0];
        FamilyNamePrinter myFamilyNamePrinter = new FamilyNamePrinter();
  
        myFamilyNamePrinter.printFamilyNames(names);     
    }    
    
    public void printFamilyNames(String names){

        stringNames = names.split(",");

        familyNames = new String[stringNames.length];
 
        for(int i=0; i < stringNames.length; i++){
            familyNames[i] = stringNames[i].trim().split(" ")[1];
        }

        for(String familyName: familyNames){
            System.out.println(familyName);
        }

    }

}