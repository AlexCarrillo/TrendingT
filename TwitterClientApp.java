/*-------------------------------------------------------------------------------------------------
*
*File: TwitterClientApp.java
* Autor: Jesús Alejandro Carrillo Arreola
* Contact: alexcarrilloar@gmail.com
* Date: October/27/2016
* Description: It is an application to see the trending topics, images and memes of your friends
*
*Last Modification
* Date                 Modified by                  Modification
*==================================================================================================
*October/28/2016    J. Alejandro Carrillo Arreola    initFabric Method was added
*------------------------------------------------------------------------------------------------ */

package ma.alexcarrilloar.android.trendingt;

import android.app.Application;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;

import io.fabric.sdk.android.Fabric;

public class TwitterClientApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initFabric();
    }

    //Initializes Twitter
    private void initFabric() {
        TwitterAuthConfig authConfig = new TwitterAuthConfig(BuildConfig.TWITTER_KEY,BuildConfig.TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
    }
}
