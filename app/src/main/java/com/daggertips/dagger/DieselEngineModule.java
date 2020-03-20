package com.daggertips.dagger;

import com.daggertips.model.DieselEngine;
import com.daggertips.model.Engine;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine provideDieselEngine(DieselEngine engine);
    /*  @Provides
    Engine provideDieselEngine(DieselEngine engine){
        return engine;
    }*/
}
