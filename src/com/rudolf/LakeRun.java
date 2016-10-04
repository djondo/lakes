package com.rudolf;

public class LakeRun {

/**
 * Created by rudi on 10/2/2016.
 */

            String name;
            double time;

            // Constructor

            LakeRun(String lakeName, double lakeTime) {
                this.name = lakeName;
                this.time = lakeTime;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public double getTime() {
                return time;
            }

            public void setTime(double time) {
                this.time = time;
            }
            public void writeLakeInfo(){
                System.out.println("Lake " + getName() + ": " + getTime());
            }
        }

        // write your code here



