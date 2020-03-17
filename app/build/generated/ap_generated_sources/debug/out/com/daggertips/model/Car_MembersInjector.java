// Generated by Dagger (https://google.github.io/dagger).
package com.daggertips.model;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class Car_MembersInjector implements MembersInjector<Car> {
  private final Provider<Remote> remoteProvider;

  public Car_MembersInjector(Provider<Remote> remoteProvider) {
    this.remoteProvider = remoteProvider;
  }

  public static MembersInjector<Car> create(Provider<Remote> remoteProvider) {
    return new Car_MembersInjector(remoteProvider);
  }

  @Override
  public void injectMembers(Car instance) {
    injectEnableRemote(instance, remoteProvider.get());
  }

  public static void injectEnableRemote(Car instance, Remote remote) {
    instance.enableRemote(remote);
  }
}
