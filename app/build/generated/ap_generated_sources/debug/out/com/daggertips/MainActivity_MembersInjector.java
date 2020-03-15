// Generated by Dagger (https://google.github.io/dagger).
package com.daggertips;

import com.daggertips.model.Car;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<Car> carProvider;

  public MainActivity_MembersInjector(Provider<Car> carProvider) {
    this.carProvider = carProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<Car> carProvider) {
    return new MainActivity_MembersInjector(carProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectCar(instance, carProvider.get());
  }

  public static void injectCar(MainActivity instance, Car car) {
    instance.car = car;
  }
}
