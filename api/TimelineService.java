/*-------------------------------------------------------------------------------------------------
*
*File: TimelineService.java
* Autor: Jesús Alejandro Carrillo Arreola
* Contact: alexcarrilloar@gmail.com
* Date: October/27/2016
* Description: It is an application to see the trending topics, images and memes of your friends
*
*Last Modification
* Date                 Modified by                  Modification
*==================================================================================================
*October/28/2016    J. Alejandro Carrillo Arreola    Petition to retrieve values from Twitter using Retrofit was created
*------------------------------------------------------------------------------------------------ */

package ma.alexcarrilloar.android.trendingt.api;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.models.Tweet;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by alexcarrilloar on 10/27/16.
 */
public interface TimelineService {
    @GET("/1.1/statuses/home_timeline.json")
    void homeTimeLine(@Query("count")Integer count,
                      @Query("trim_user")Boolean trim_user,
                      @Query("exlude_replies")Boolean exclude_replies,
                      @Query("contributor_details")Boolean contributor_details,
                      @Query("include_entities")Boolean include_entities,
                      Callback<List<Tweet>> callback);
}
