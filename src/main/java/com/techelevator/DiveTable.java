package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class DiveTable {
    // instance variables

    private int depth;
    private int bottomTime;
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

    // derived variable
    public char getPressureGroup(){
        depthRoundUp();
        bottomTimeRoundUp();
        String dTKey = dKey + "," + tKey;
        return mapPressureGroup.get(dTKey);
    }
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
    public String bottomTimeRoundUp() {
    return tKey;
    }
        //TODO: all time rounds for depths other than 35

    // TODO METHOD: Calculate next pressure group after knowing surface interval
    //TODO METHOD: Calculate how long a surface interval needs to be in order to safely make 2 dives
}
