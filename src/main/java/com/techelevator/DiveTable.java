package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class DiveTable {
    // instance variables

    private int depth;
    private int bottomTime;
    private char pressureGroup;
    private int surfaceInterval;
    private char pressureGroupAfterSI;
    private String dKey;
    private String tKey;

    public String getTKey() {
        return tKey;
    }

    public String getDKey() {
        return dKey;
    }

    public char getPressureGroup() {
        return pressureGroup;
    }

    public char getPressureGroupAfterSI() {
        return pressureGroupAfterSI;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getBottomTime() {
        return bottomTime;
    }

    public void setBottomTime(int bottomTime) {
        this.bottomTime = bottomTime;
    }

    public int getSurfaceInterval() {
        return depth;
    }

    public void setSurfaceInterval(int surfaceInterval) {
        this.surfaceInterval = surfaceInterval;
    }

    //

    // constructor
    public DiveTable(int depth, int bottomTime, int surfaceInterval) {
        this.depth = depth;
        this.bottomTime = bottomTime;
        this.surfaceInterval = surfaceInterval;
    }
    // methods

    public Map<String, Character> mapPressureGroup = Map.of(
            //TODO: finish map for pressure group

            "35,10", 'A',
            "35,19", 'B',
            "35,25",'C',
            "35,29", 'D',
            "35,32", 'E');

    public char calculatePressureGroup(){
        depthRoundUp();
        bottomTimeRoundUp();
        String dTKey = dKey + "," + tKey;
        return mapPressureGroup.get(dTKey);
    }
    public String depthRoundUp(){
        if (depth <= 35){
            dKey = "35";
        }
        else if (depth <= 40){
            dKey = "40";
        }
        else if (depth <= 50){
            dKey = "50";
        }
        else if (depth <= 60){
            dKey = "60";
        }
        else if (depth <= 70){
            dKey = "70";
        }
        else if (depth <= 80){
            dKey = "80";
        }
        else if (depth <= 90){
            dKey = "90";
        }
        else if (depth <= 100){
            dKey = "100";
        }
        else if (depth <= 110){
            dKey = "110";
        }
        else if (depth <= 120){
            dKey = "120";
        }
        else if (depth <= 130){
            dKey = "130";
        }
        else if (depth <= 140){
            dKey = "140";
        }
        return dKey;
    }
    public String bottomTimeRoundUp(){
        //TODO: all time rounds for depths other than 35

        if (getDKey() == "35"){
            if (bottomTime <=10){
                tKey = "10";
            }
            else if (bottomTime <=19){
                tKey = "19";
            }
            else if (bottomTime <=25){
                tKey = "25";
            }
            else if (bottomTime <=29){
                tKey = "29";
            }
            else if (bottomTime <=32){
                tKey = "32";
            }
            else if (bottomTime <=36){
                tKey = "36";
            }
            else if (bottomTime <=40){
                tKey = "40";
            }
            else if (bottomTime <=44){
                tKey = "44";
            }
            else if (bottomTime <=48){
                tKey = "48";
            }
            else if (bottomTime <=52){
                tKey = "52";
            }
            else if (bottomTime <=57){
                tKey = "57";
            }
            else if (bottomTime <=62){
                tKey = "62";
            }
            else if (bottomTime <=67){
                tKey = "67";
            }
            else if (bottomTime <=73){
                tKey = "73";
            }
            else if (bottomTime <=85) {
                tKey = "85";}
            else if (bottomTime <= 92) {
                tKey = "92";
            }
            else if (bottomTime <= 100) {
                tKey = "100";
            }
            else if (bottomTime <= 108) {
                tKey = "108";
            }
            else if (bottomTime <= 117) {
                tKey = "117";
            }
            else if (bottomTime <= 127) {
                tKey = "127";
            }
            else if (bottomTime <= 139) {
                tKey = "139";
            }
            else if (bottomTime <= 152) {
                tKey = "152";
            }
            else if (bottomTime <= 168) {
                tKey = "168";
            }
            else if (bottomTime <= 188) {
                tKey = "188";
            }
            else if (bottomTime <= 205) {
                tKey = "205";
            }
        }
        return tKey;
    }
    // TODO METHOD: Calculate next pressure group after knowing surface interval
    //TODO METHOD: Calculate how long a surface interval needs to be in order to safely make 2 dives
}
