/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datapreprocessing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Hammad
 */
public class DataPreprocessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileReader in = new FileReader("dataSetNonNumerical.txt");
        BufferedReader br = new BufferedReader(in);
        File file1 = new File("positiveExamples.txt");
        file1.createNewFile();
        BufferedWriter writer1 = new BufferedWriter(new FileWriter(file1));
        File file2 = new File("negativeExamples.txt");
        file2.createNewFile();
        BufferedWriter writer2 = new BufferedWriter(new FileWriter(file2));
        ArrayList<String> listNegative= new ArrayList<String>();
        String line;
        int[] values= new int[20];
        while ((line = br.readLine()) != null) {
            //System.out.println(line);
            String[] value = line.split("\\s+");
            if(Integer.parseInt(value[value.length-1])==1){
                writer1.write(line+"\n");
            }
            else{
                listNegative.add(line);
                writer2.write(line+"\n");
            }
            //System.out.println(value[value.length-1]);
            //values=new int[value.length];
//            for(int i=0;i<value.length;i++){
//                System.out.println(values[i]);//values[i]=Integer.parseInt(value[i]);
//            }
        }
        writer1.flush();
        writer2.flush();
        writer1.close();
        writer2.close();
        br.close();
        //checking account
        int[] counter= new int[4];
        for(int i=0;i<listNegative.size();i++){
            String[] value = listNegative.get(i).split("\\s+");
            //System.out.println(value[2]);
              if(value[0].equals("A11")){
                  counter[0]++;
              }
              else if(value[0].equals("A12")){
                  counter[1]++;
              }
              else if(value[0].equals("A13")){
                  counter[2]++;
              }
              else{
                  counter[3]++;
              }
        }
        System.out.println("A11\t"+counter[0]+"\t->"+4+"\t normalise->"+1);
        System.out.println("A12\t"+counter[1]+"\t->"+3+"\t normalise->"+0.7);
        System.out.println("A13\t"+counter[2]+"\t->"+1+"\t normalise->"+0.4);
        System.out.println("A14\t"+counter[3]+"\t->"+2+"\t normalise->"+0.1);
        System.out.println("\n\n\n\n");
        
//        //Credit history
//         counter= new int[5];
//        for(int i=0;i<listNegative.size();i++){
//            String[] value = listNegative.get(i).split("\\s+");
//            //System.out.println(value[2]);
//              if(value[2].equals("A30")){
//                  counter[0]++;
//              }
//              else if(value[2].equals("A31")){
//                  counter[1]++;
//              }
//              else if(value[2].equals("A32")){
//                  counter[2]++;
//              }
//              else if(value[2].equals("A33")){
//                  counter[3]++;
//              }
//              else{
//                      counter[4]++;
//                      }
//        }
//        System.out.println("A30\t"+counter[0]);
//        System.out.println("A31\t"+counter[1]);
//        System.out.println("A32\t"+counter[2]);
//        System.out.println("A33\t"+counter[3]);
//        System.out.println("A34\t"+counter[4]);
//        System.out.println("\n\n\n\n");
//        //Purpose
//        counter= new int[11];
//        for(int i=0;i<listNegative.size();i++){
//            String[] value = listNegative.get(i).split("\\s+");
//            //System.out.println(value[2]);
//              if(value[3].equals("A40")){
//                  counter[0]++;
//              }
//              else if(value[3].equals("A41")){
//                  counter[1]++;
//              }
//              else if(value[3].equals("A42")){
//                  counter[2]++;
//              }
//              else if(value[3].equals("A43")){
//                  counter[3]++;
//              }
//              else if(value[3].equals("A44")){
//                  counter[4]++;
//              }
//              else if(value[3].equals("A45")){
//                  counter[5]++;
//              }
//              else if(value[3].equals("A46")){
//                  counter[6]++;
//              }
//              else if(value[3].equals("A47")){
//                  counter[7]++;
//              }
//              else if(value[3].equals("A48")){
//                  counter[8]++;
//              }
//              else if(value[3].equals("A49")){
//                  counter[9]++;
//              }
//              else{
//                      counter[10]++;
//                   }
//        }
//        System.out.println("A40\t"+counter[0]);
//        System.out.println("A41\t"+counter[1]);
//        System.out.println("A42\t"+counter[2]);
//        System.out.println("A43\t"+counter[3]);
//        System.out.println("A44\t"+counter[4]);
//        System.out.println("A45\t"+counter[5]);
//        System.out.println("A46\t"+counter[6]);
//        System.out.println("A47\t"+counter[7]);
//        System.out.println("A48\t"+counter[8]);
//        System.out.println("A49\t"+counter[9]);
//        System.out.println("A410\t"+counter[10]);
//        System.out.println("\n\n\n\n");
//        counter= new int[5];
//        for(int i=0;i<listNegative.size();i++){
//            String[] value = listNegative.get(i).split("\\s+");
//           // System.out.println(value[5]);
//
//              if(value[5].equals("A61")){
//                  counter[0]++;
//              }
//              else if(value[5].equals("A62")){
//                  counter[1]++;
//              }
//              else if(value[5].equals("A63")){
//                  counter[2]++;
//              }
//              else if(value[5].equals("A64")){
//                  counter[3]++;
//              }
//              
//              else{
//                      counter[4]++;
//                   }
//        }
//        System.out.println("A61\t"+counter[0]);
//        System.out.println("A62\t"+counter[1]);
//        System.out.println("A63\t"+counter[2]);
//        System.out.println("A64\t"+counter[3]);
//        System.out.println("A65\t"+counter[4]);
//        System.out.println("\n\n\n\n");
//        counter= new int[5];
//        for(int i=0;i<listNegative.size();i++){
//            String[] value = listNegative.get(i).split("\\s+");
//            //System.out.println(value[6]);
//
//              if(value[6].equals("A71")){
//                  counter[0]++;
//              }
//              else if(value[6].equals("A72")){
//                  counter[1]++;
//              }
//              else if(value[6].equals("A73")){
//                  counter[2]++;
//              }
//              else if(value[6].equals("A74")){
//                  counter[3]++;
//              }
//              
//              else{
//                      counter[4]++;
//                   }
//        }
//        System.out.println("A71\t"+counter[0]);
//        System.out.println("A72\t"+counter[1]);
//        System.out.println("A73\t"+counter[2]);
//        System.out.println("A74\t"+counter[3]);
//        System.out.println("A75\t"+counter[4]);
//        System.out.println("\n\n\n\n");
//        
//        counter= new int[5];
//        for(int i=0;i<listNegative.size();i++){
//            String[] value = listNegative.get(i).split("\\s+");
//            //System.out.println(value[8]);
//
//              if(value[8].equals("A91")){
//                  counter[0]++;
//              }
//              else if(value[8].equals("A92")){
//                  counter[1]++;
//              }
//              else if(value[8].equals("A93")){
//                  counter[2]++;
//              }
//              else if(value[8].equals("A94")){
//                  counter[3]++;
//              }
//              
//              else{
//                      counter[4]++;
//                   }
//        }
//        System.out.println("A91\t"+counter[0]);
//        System.out.println("A92\t"+counter[1]);
//        System.out.println("A93\t"+counter[2]);
//        System.out.println("A94\t"+counter[3]);
//        System.out.println("A95\t"+counter[4]);
//        System.out.println("\n\n\n\n");
//        counter= new int[3];
//        for(int i=0;i<listNegative.size();i++){
//            String[] value = listNegative.get(i).split("\\s+");
////            System.out.println(value[9]);
//
//
//              if(value[9].equals("A101")){
//                  counter[0]++;
//              }
//              else if(value[9].equals("A102")){
//                  counter[1]++;
//              }
//              else{
//                      counter[2]++;
//                   }
//        }
//        System.out.println("A101\t"+counter[0]);
//        System.out.println("A102\t"+counter[1]);
//        System.out.println("A103\t"+counter[2]);
//        System.out.println("\n\n\n\n");
//        counter= new int[5];
//        for(int i=0;i<listNegative.size();i++){
//            String[] value = listNegative.get(i).split("\\s+");
//            //System.out.println(value[11]);
//            
//
//              if(value[11].equals("A121")){
//                  counter[0]++;
//              }
//              else if(value[11].equals("A122")){
//                  counter[1]++;
//              }
//              else if(value[11].equals("A123")){
//                  counter[2]++;
//              }
//              
//              
//              else{
//                      counter[3]++;
//                   }
//        }
//        System.out.println("A121\t"+counter[0]);
//        System.out.println("A122\t"+counter[1]);
//        System.out.println("A123\t"+counter[2]);
//        System.out.println("A124\t"+counter[3]);
//        
//        System.out.println("\n\n\n\n");
//        counter= new int[3];
//        for(int i=0;i<listNegative.size();i++){
//            String[] value = listNegative.get(i).split("\\s+");
//            //System.out.println(value[13]);
//            //System.exit(1);
//
//              if(value[13].equals("A141")){
//                  counter[0]++;
//              }
//              else if(value[13].equals("A142")){
//                  counter[1]++;
//              }
//              else{
//                      counter[2]++;
//                   }
//        }
//        System.out.println("A141\t"+counter[0]);
//        System.out.println("A142\t"+counter[1]);
//        System.out.println("A143\t"+counter[2]);
//        System.out.println("\n\n\n\n");
//        counter= new int[3];
//        for(int i=0;i<listNegative.size();i++){
//            String[] value = listNegative.get(i).split("\\s+");
//            //System.out.println(value[14]);
//            //System.exit(1);
//
//              if(value[14].equals("A151")){
//                  counter[0]++;
//              }
//              else if(value[14].equals("A152")){
//                  counter[1]++;
//              }
//              else{
//                      counter[2]++;
//                   }
//        }
//        System.out.println("A151\t"+counter[0]);
//        System.out.println("A152\t"+counter[1]);
//        System.out.println("A153\t"+counter[2]);
//        System.out.println("\n\n\n\n");
//        counter= new int[5];
//        for(int i=0;i<listNegative.size();i++){
//            String[] value = listNegative.get(i).split("\\s+");
//            //System.out.println(value[16]);
//            
//            
//
//              if(value[16].equals("A171")){
//                  counter[0]++;
//              }
//              else if(value[16].equals("A172")){
//                  counter[1]++;
//              }
//              else if(value[16].equals("A173")){
//                  counter[2]++;
//              }
//              else{
//                      counter[3]++;
//                   }
//        }
//        System.out.println("A171\t"+counter[0]);
//        System.out.println("A172\t"+counter[1]);
//        System.out.println("A173\t"+counter[2]);
//        System.out.println("A174\t"+counter[3]);
//        
//        System.out.println("\n\n\n\n");
//        counter= new int[2];
//        for(int i=0;i<listNegative.size();i++){
//            String[] value = listNegative.get(i).split("\\s+");
//            //System.out.println(value[18]);
//            //System.exit(1);
//              if(value[18].equals("A191")){
//                  counter[0]++;
//              }
//              
//              else{
//                      counter[1]++;
//                   }
//        }
//        System.out.println("A191\t"+counter[0]);
//        System.out.println("A192\t"+counter[1]);
//        System.out.println("\n\n\n\n");
//        counter= new int[2];
//        for(int i=0;i<listNegative.size();i++){
//            String[] value = listNegative.get(i).split("\\s+");
//            //System.out.println(value[18]);
//            //System.exit(1);
//              if(value[19].equals("A201")){
//                  counter[0]++;
//              }
//              
//              else{
//                      counter[1]++;
//                   }
//        }
//        System.out.println("A201\t"+counter[0]);
//        System.out.println("A202\t"+counter[1]);
//        System.out.println("\n\n\n\n");
//        ArrayList<String[]> list = new ArrayList<String[]>();
//        String line;
//        int[] values = new int[25];
//        FileReader fread = new FileReader("da.txt");
//        BufferedReader bread = new BufferedReader(fread);
//        while ((line = bread.readLine()) != null) {
//            System.out.println(line);
//            String[] value = line.split("\\s+");
//            list.add(value);
            //System.out.println(value[value.length-1]);
            //values=new int[value.length];
//            for(int i=0;i<value.length;i++){
//                System.out.println(values[i]);//values[i]=Integer.parseInt(value[i]);
//            }
        }
//        int max;
//        int min;
//        int dataattribute=list.get(0).length;
//        System.out.println(dataattribute-1);
//        DecimalFormat df = new DecimalFormat("#.##");
//        
//        for(int i=0;i<dataattribute-1;i++){
//            max=0;
//            min=100;
//            for(int p=0;p<list.size();p++){
//               String[] value= list.get(p);
//               if(Integer.parseInt(value[i])>max){
//                   max=Integer.parseInt(value[i]);
//               }
//               if(Integer.parseInt(value[i])<min){
//                   min=Integer.parseInt(value[i]);
//               }
//            }
//            for(int p=0;p<list.size();p++){
//               String[] value= list.get(p);
//               //System.out.println(value[i]);
//               double temp=0;
//               if(max==2 && min==1){
//                  temp=((Double.parseDouble(value[i])-min)/(max-min))*(1-0.5)+0.5;
//               }
//               else{
//                  temp=((Double.parseDouble(value[i])-min)/(max-min))*(1-0.1)+0.1;
//               }
//               temp=Double.valueOf(df.format(temp));
//              // System.out.printf("\t%f\n",temp);
//               value[i]=String.valueOf(temp);
//               //System.out.println(value[i]);
//               
//            }
//            System.out.println("\n\nmax="+max+"\tmin="+min);
//            
//            
//            
//        }
//        File file3 = new File("finalReducedDataSetGain2.txt");
//        file3.createNewFile();
//        BufferedWriter writer3 = new BufferedWriter(new FileWriter(file3));
//
//        for (int j = 0; j < list.size(); j++) {
//            String[] value = list.get(j);
//            String temp = "";
//            for (int i = 0; i < value.length; i++) {
//                if (i == 0 || i == 19 || i == 2 || i == 1 || i == 4 || i == 5 || i == 12 || i == 14 ||i==20) {
//                    //String temp = String.join(",", value);
//                    if(i!=0){
//                        temp =temp+ "," +value[i];
//                    }
//                    else{
//                        temp =temp+value[i];
//                    }
//                }
//            }
//            System.out.println(temp);
//            writer3.write(temp + "\n");
//        }
//
//    writer3.flush ();
//
//    writer3.close ();

//}

public static boolean isInteger(String str) {
        int length = str.length();
        if (str == null) {
            return false;
        }
        if (str.isEmpty()) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

}
