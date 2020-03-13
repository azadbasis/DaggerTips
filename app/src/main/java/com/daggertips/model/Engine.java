package com.daggertips.model;

public class Engine {
    private Block block;
    private Cylinders cylinders;
    private SparkPlugs sparkPlugs;

    public Engine(Block block, Cylinders cylinders, SparkPlugs sparkPlugs) {
        this.block = block;
        this.cylinders = cylinders;
        this.sparkPlugs = sparkPlugs;
    }
}
