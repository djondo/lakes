package com.rudolf;

/**
 * Created by rudi on 10/4/2016.
 */
public class Lakes {

    public static void main(String args[]){
        // Create new lakeRun objects
        LakeRun Calhoun = new LakeRun("Calhoun", 12.56);
        LakeRun CedarLake = new LakeRun("Cedar", 23.15);
        LakeRun Harriet = new LakeRun("Harriet", 49.34);
        LakeRun Como = new LakeRun("Como", 39.12);

        // Print out information about each object
        Calhoun.writeLakeInfo();
        CedarLake.writeLakeInfo();
        Harriet.writeLakeInfo();
        Como.writeLakeInfo();
    }
}



