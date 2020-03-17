// Generated by Dagger (https://google.github.io/dagger).
package com.daggertips.model;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class Car_Factory implements Factory<Car> {
  private final Provider<Engine> engineProvider;

  private final Provider<Wheels> wheelsProvider;

  private final Provider<Remote> remoteProvider;

  public Car_Factory(
      Provider<Engine> engineProvider,
      Provider<Wheels> wheelsProvider,
      Provider<Remote> remoteProvider) {
    this.engineProvider = engineProvider;
    this.wheelsProvider = wheelsProvider;
    this.remoteProvider = remoteProvider;
  }

  @Override
  public Car get() {
    return provideInstance(engineProvider, wheelsProvider, remoteProvider);
  }

  public static Car provideInstance(
      Provider<Engine> engineProvider,
      Provider<Wheels> wheelsProvider,
      Provider<Remote> remoteProvider) {
    Car instance = new Car(engineProvider.get(), wheelsProvider.get());
    Car_MembersInjector.injectEnableRemote(instance, remoteProvider.get());
    return instance;
  }

  public static Car_Factory create(
      Provider<Engine> engineProvider,
      Provider<Wheels> wheelsProvider,
      Provider<Remote> remoteProvider) {
    return new Car_Factory(engineProvider, wheelsProvider, remoteProvider);
  }

  public static Car newCar(Engine engine, Wheels wheels) {
    return new Car(engine, wheels);
  }
}
