package com.daggertips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.daggertips.model.Block;
import com.daggertips.model.Car;
import com.daggertips.model.Cylinders;
import com.daggertips.model.Engine;
import com.daggertips.model.Rims;
import com.daggertips.model.SparkPlugs;
import com.daggertips.model.Tires;
import com.daggertips.model.Wheels;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Block block = new Block();
        Cylinders cylinders = new Cylinders();
        SparkPlugs sparkPlugs = new SparkPlugs();
        Engine engine = new Engine(block, cylinders, sparkPlugs);
        Rims rims = new Rims();
        Tires tires = new Tires();
        Wheels wheels = new Wheels(tires, rims);
        Car car = new Car(engine, wheels);
        car.drive();
    }
}
