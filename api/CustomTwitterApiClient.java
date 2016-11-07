/*-------------------------------------------------------------------------------------------------
*
*File: CustomTwitterApiClient.java
* Autor: Jesús Alejandro Carrillo Arreola
* Contact: alexcarrilloar@gmail.com
* Date: October/27/2016
* Description: It is an application to see the trending topics, images and memes of your friends
*
*Last Modification
* Date                 Modified by                  Modification
*==================================================================================================
*October/28/2016    J. Alejandro Carrillo Arreola    getTimelineService method to access to the API was created
*------------------------------------------------------------------------------------------------ */

package ma.alexcarrilloar.android.trendingt.api;

import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.TwitterApiClient;

/**
 * Created by alexcarrilloar on 10/27/16.
 */
public class CustomTwitterApiClient extends TwitterApiClient {

    public CustomTwitterApiClient(Session session) {
        super(session);
    }

    public TimelineService getTimelineService()
    {
        return getService(TimelineService.class);
    }
}
