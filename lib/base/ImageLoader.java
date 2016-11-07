/*-------------------------------------------------------------------------------------------------
*
*File: ImageLoader.java
* Autor: Jesús Alejandro Carrillo Arreola
* Contact: alexcarrilloar@gmail.com
* Date: October/30/2016
* Description: Interface to handle Glide Library
*
*Last Modification
* Date                 Modified by                  Modification
*==================================================================================================
*October/30/2016    J. Alejandro Carrillo Arreola    load abstract method was added
*------------------------------------------------------------------------------------------------ */

package ma.alexcarrilloar.android.trendingt.lib.base;

import android.widget.ImageView;

public interface ImageLoader {

    void load(ImageView imageView, String URL);
}
