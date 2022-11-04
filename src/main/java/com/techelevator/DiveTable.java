package com.techelevator;

public class DiveTable {
    // instance variables

    private int depth;
    private int bottomTime;
    private int pressureGroup;
    private int surfaceInterval;
    private int pressureGroupAfterSI;

    public int getPressureGroup() {
        return pressureGroup;
    }

    public int getPressureGroupAfterSI() {
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

    public char calculatePressureGroup(int depth, int bottomTime){
        // Map<Integer, List<Integers>>
    }
}
