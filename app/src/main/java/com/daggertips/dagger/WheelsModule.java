package com.daggertips.dagger;

import com.daggertips.model.Rims;
import com.daggertips.model.Tires;
import com.daggertips.model.Wheels;
import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims provideRims(){
        return new Rims();
    }

    @Provides
    Tires provideTires(){
        Tires tires=new Tires();
        tires.inflate();
        return tires;
    }
    @Provides
    Wheels provideWheels(Rims rims,Tires tires){
        return new Wheels(rims,tires);
    }
}
