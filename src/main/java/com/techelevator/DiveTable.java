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

    public Map<String, Character> map = Map.of(
            "35,10", 'A',
            "35,19", 'B');

    public char calculatePressureGroup(){
        String dHash = "";
        String tHash = "";
        if (depth <= 35){
            dHash = "35";
        }
        if (bottomTime <=10){
            tHash = "10";
        }
        String DTHash = dHash +","+tHash;
        return map.get(DTHash);
    }

}
