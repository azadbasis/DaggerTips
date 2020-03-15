package com.daggertips;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.daggertips.model.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        //  car=component.getCar();
        component.inject(this);
        car.drive();
    }
}
