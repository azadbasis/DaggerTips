// Generated by Dagger (https://google.github.io/dagger).
package com.daggertips.model;

import dagger.internal.Factory;

public final class Engine_Factory implements Factory<Engine> {
  private static final Engine_Factory INSTANCE = new Engine_Factory();

  @Override
  public Engine get() {
    return provideInstance();
  }

  public static Engine provideInstance() {
    return new Engine();
  }

  public static Engine_Factory create() {
    return INSTANCE;
  }

  public static Engine newEngine() {
    return new Engine();
  }
}
