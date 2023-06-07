package com.backtocding.noteappjetpackcompose.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Modules are used to add bindings to Hilt
 * In other words, to tell Hilt to provide instances of different types.
 * To create a room database, we would need to use a builder
 * to create an instance of the database because we don't want a database
 * to be created everytime the app starts.
 * So think of this module like, this is going to be a place that will add
 * all of those bindings to Hilt, which means we can add a mechanism that will allow us to
 * instantiate or to create certain dependencies,
 * such as creating database and provide all of that.
 */

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
}