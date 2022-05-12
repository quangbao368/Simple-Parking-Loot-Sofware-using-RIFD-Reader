/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.*;
import java.util.Scanner;
/**
 * @author Dearest
 */

public class Controler {
    public boolean checkcard(String the, File fileToCheckCard) {
        int count = 0;
        File filename = new File(String.valueOf(fileToCheckCard));
        if (filename.length() == 0) {
            count = 0;
        } else {
            try {
                FileReader myObj = new FileReader(fileToCheckCard);
                Scanner myReader = new Scanner(myObj);
                do {
                    String data = myReader.nextLine();
                    if (data == null) {
                        count = 0;
                    } else if (data.contains(the)) {
                        count = 1;
                    }
                } while (myReader.hasNextLine());
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getData(String word, File fileToGetData) {
        String data_return = null;
        File filename = new File(String.valueOf(fileToGetData));
        if (filename.length() != 0) {
            try {
                FileReader myObj = new FileReader(fileToGetData);
                Scanner myReader = new Scanner(myObj);

                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    if (data.contains(word)) {
                        data_return = data;
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

        return data_return;
    }

    public static long countLineNumberReader(File fileToWrite) {
        File file = new File(String.valueOf(fileToWrite));
        long lines = 0;
        try (LineNumberReader lnr = new LineNumberReader(new FileReader(fileToWrite))) {

            while (lnr.readLine() != null) ;
            lines = lnr.getLineNumber();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public void WriteToFile(String bike[], File fileToWrite) {
        try {
            FileWriter myWriter = new FileWriter(fileToWrite, true);
            BufferedWriter bw = new BufferedWriter(myWriter);
            bw.write(bike[0] + "_" + bike[1] + "_" + bike[2] + "_" + bike[3] + "_" + bike[4] + "_" + bike[5] + "_" + new java.util.Date() + "." + "\n");
            System.out.println("Successfully wrote to the file.");
            bw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public String[] readfile(String card, File FileToRead) {
        String[] card_property = null;
        File filename = new File(String.valueOf(FileToRead));
        String card_line = getData(card, FileToRead);
        if (filename.length() != 0) {
            try {
                //C:\\Users\\HoangDeShotgun\\IdeaProjects\\RIFD Card\\src\\dto\\data.txt
                FileReader myObj = new FileReader(FileToRead);
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    if (data.contains(card)) {
                        card_property = data.split("_");
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //System.out.println(card_property[1]);
        return card_property;
    }

    public void removeLineFromFile(String lineToRemove, File fileToRemove) {
        try {
            File inFile = new File(String.valueOf(fileToRemove));
            BufferedReader br = new BufferedReader(new FileReader(fileToRemove));
            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            if (!inFile.isFile()) {
                System.out.println("Parameter is not an existing file");
                return;
            }
            //Construct the new file that will later be renamed to the original filename.
            String line = null;
            //Read from the original file and write to the new
            //unless content matches data to be removed.
            while ((line = br.readLine()) != null) {
                if (!line.trim().equals(lineToRemove)) {
                    pw.println(line);
                    pw.flush();
                }
            }
            pw.close();
            br.close();

            //Delete the original file
            if (!inFile.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            //Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(inFile)) {
                System.out.println("Could not rename file");
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void runFileMp3(String pathFile) {
        try
        {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File(pathFile)));
            clip.start();
        }
        catch (IOException | LineUnavailableException | UnsupportedAudioFileException exc)
        {
        }
    }

//    public void runFileMp3(String pathFile){
//        try {
//            FileInputStream file = new FileInputStream(pathFile); //initialize the FileInputStream
//            Player player; //initialize the player
//            player = new Player(file);
//            player.play(); //start the player
//
//        } catch (JavaLayerException e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//    }



}
