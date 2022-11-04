package com.techelevator;

import java.util.HashMap;


import java.util.Map;

import static java.util.Map.entry;

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
    public char getPressureGroup() {
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

    // static stuff?
    public Map<String, int[]> bottomTimeTable = new HashMap<String, int[]>() {{
        put("35", new int[]{10, 19, 25, 29, 32, 36, 40, 44, 48, 52, 57, 62, 67, 73, 79, 85, 92, 100, 108, 117, 127, 139, 152, 168, 188, 205});
        put("40", new int[]{9, 16, 22, 25, 27, 31, 34, 37, 40, 44, 48, 51, 55, 60, 64, 69, 74, 79, 85, 91, 97, 104, 111, 120, 129, 140});
        put("50", new int[]{7,13,17,19,21,24,26,28,31,33,36,39,41,44,47,50,53,57,60,63,67,71,75,80});
        put("60", new int[]{6,11,14,16,17,19,21,23,25,27,29,31,33,35,37,39,42,44,47,49,52,54,55});
        put("70", new int[]{5,9,12,13,15,16,18,19,21,22,24,26,27,29,31,33,35,36,38,40});
        put("80", new int[]{4,8,10,11,13,14,15,17,18,19,21,22,23,25,26,28,29,30});
        put("90", new int[]{4,7,9,10,11,12,13,15,16,17,18,19,21,22,23,24,25});
        put("100", new int[]{3,6,8,9,10,11,12,13,14,15,16,17,18,19,20});
        put("110", new int[]{3,6,7,8,9,10,11,12,13,14,15,16});
        put("120", new int[]{3,5,6,7,8,9,10,11,12,13});
    }};
    //why double curlies?

    // methods

    public Map<String, Character> mapPressureGroup = Map.ofEntries(
            entry("35,10",'A'),
            entry("35,19",'B'),
            entry("35,25",'C'),
            entry("35,29",'D'),
            entry("35,32",'E'),
            entry("35,36",'F'),
            entry("35,40",'G'),
            entry("35,44",'H'),
            entry("35,48",'I'),
            entry("35,52",'J'),
            entry("35,57",'K'),
            entry("35,62",'L'),
            entry("35,67",'M'),
            entry("35,73",'N'),
            entry("35,79",'O'),
            entry("35,85",'P'),
            entry("35,92",'Q'),
            entry("35,100",'R'),
            entry("35,108",'S'),
            entry("35,117",'T'),
            entry("35,127",'U'),
            entry("35,139",'V'),
            entry("35,152",'W'),
            entry("35,168",'X'),
            entry("35,188",'Y'),
            entry("35,205",'Z')
    );


    public String depthRoundUp() {
        if (depth <= 35) {
            dKey = "35";
        } else if (depth <= 40) {
            dKey = "40";
        } else if (depth <= 50) {
            dKey = "50";
        } else if (depth <= 60) {
            dKey = "60";
        } else if (depth <= 70) {
            dKey = "70";
        } else if (depth <= 80) {
            dKey = "80";
        } else if (depth <= 90) {
            dKey = "90";
        } else if (depth <= 100) {
            dKey = "100";
        } else if (depth <= 110) {
            dKey = "110";
        } else if (depth <= 120) {
            dKey = "120";
        } else if (depth <= 130) {
            dKey = "130";
        } else if (depth <= 140) {
            dKey = "140";
        }
        return dKey;
    }

    public String bottomTimeRoundUp() {
        //inputs: bottomTimeTable, dKey, bottomTime
        int[] times = bottomTimeTable.get(dKey);
        for (int i = 0; i < times.length; i++) {
            int time = times[i];
            if (bottomTime <= time) {
                tKey = String.valueOf(times[i]);
                break;
            }
            //output: tKey


        }
        return tKey;
        //TODO: all time rounds for depths other than 35

        // TODO METHOD: Calculate next pressure group after knowing surface interval
        //TODO METHOD: Calculate how long a surface interval needs to be in order to safely make 2 dives
    }
}
