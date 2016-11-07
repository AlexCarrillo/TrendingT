
/*-------------------------------------------------------------------------------------------------
*
*File: GlideImageLoader.java
* Autor: Jesús Alejandro Carrillo Arreola
* Contact: alexcarrilloar@gmail.com
* Date: October/30/2016
* Description: Class to implements ImageLoader Interface (Handle Glide Library)
*
*Last Modification
* Date                 Modified by                  Modification
*==================================================================================================
*October/30/2016    J. Alejandro Carrillo Arreola    load method implementation was added
*------------------------------------------------------------------------------------------------ */
package ma.alexcarrilloar.android.trendingt.lib;

import android.widget.ImageView;

import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import ma.alexcarrilloar.android.trendingt.lib.base.ImageLoader;

/**
 * Created by alexcarrilloar on 10/30/16.
 */
public class GlideImageLoader implements ImageLoader {

    //Variable to handle the Request
    private RequestManager glideRequestManager;

    //Constructor to receive the instance of glideRequestManager
    public GlideImageLoader(RequestManager glideRequestManager) {
        this.glideRequestManager = glideRequestManager;
    }

    //Method to put the image in an imageView, passing URL and adjusting size
    @Override
    public void load(ImageView imageView, String URL) {
        glideRequestManager
                .load(URL)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .override(600,400)
                .into(imageView);
    }
}
