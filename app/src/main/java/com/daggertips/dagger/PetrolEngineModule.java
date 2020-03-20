package com.daggertips.dagger;

import com.daggertips.model.Engine;
import com.daggertips.model.PetrolEngine;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine providePetrolEngine(PetrolEngine engine);

  /*  @Provides
    Engine providePetrolEngine(PetrolEngine engine){
        return engine;
    }*/
}
