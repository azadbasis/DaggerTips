package com.daggertips.dagger;

import com.daggertips.MainActivity;
import com.daggertips.model.Car;

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}
