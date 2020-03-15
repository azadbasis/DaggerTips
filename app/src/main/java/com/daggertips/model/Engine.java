package com.daggertips.model;

import javax.inject.Inject;

public class Engine {
    private Block block;
    private Cylinders cylinders;
    private SparkPlugs sparkPlugs;

    @Inject
    public Engine() {

    }
}
