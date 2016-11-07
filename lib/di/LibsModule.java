/*-------------------------------------------------------------------------------------------------
*
*File: LibsModule.java
* Autor: Jesús Alejandro Carrillo Arreola
* Contact: alexcarrilloar@gmail.com
* Date: October/30/2016
* Description: Implements the dependency injection
*
*Last Modification
* Date                 Modified by                  Modification
*==================================================================================================
*October/30/2016    J. Alejandro Carrillo Arreola    Methods to provides an instance for EventBus and GlideImageLoader
*------------------------------------------------------------------------------------------------ */

package ma.alexcarrilloar.android.trendingt.lib.di;

import android.app.Fragment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ma.alexcarrilloar.android.trendingt.lib.GlideImageLoader;
import ma.alexcarrilloar.android.trendingt.lib.GreenRobotEventBus;
import ma.alexcarrilloar.android.trendingt.lib.base.EventBus;
import ma.alexcarrilloar.android.trendingt.lib.base.ImageLoader;

@Module
public class LibsModule {

    //Define a fragment to handle the context
    Fragment fragment;

    public LibsModule(Fragment fragment) {
        this.fragment = fragment;
    }

    //Methods to receive an instance of a event bus from GreenRobot
    @Provides
    @Singleton
    EventBus providesEventBus(org.greenrobot.eventbus.EventBus eventBus)
    {
        return new GreenRobotEventBus(eventBus);
    }

    @Provides
    @Singleton
    org.greenrobot.eventbus.EventBus providesLibraryEventBus()
    {
        return org.greenrobot.eventbus.EventBus.getDefault();
    }
//------------------------------------------------------------------------------

    //Methods to handle the instance of Glide
    @Provides
    @Singleton
    ImageLoader providesImageLoader(RequestManager requestManager)
    {
        return new GlideImageLoader(requestManager);
    }

    @Provides
    @Singleton
    RequestManager providesRequestManager(Fragment fragment)
    {
        return  Glide.with(fragment);
    }

    @Provides
    @Singleton
    Fragment providesFragment()
    {
        return this.fragment;
    }

  //-----------------------------------------------------------------------------

}
