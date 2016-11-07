/*-------------------------------------------------------------------------------------------------
*
*File: GreenRobotEventBus.java
* Autor: Jesús Alejandro Carrillo Arreola
* Contact: alexcarrilloar@gmail.com
* Date: October/30/2016
* Description: Class to implements EventBus Interface (Handle EventBus Library)
*
*Last Modification
* Date                 Modified by                  Modification
*==================================================================================================
*October/30/2016    J. Alejandro Carrillo Arreola    register, unregister, post abstract methods were added
*------------------------------------------------------------------------------------------------ */

package ma.alexcarrilloar.android.trendingt.lib;

import ma.alexcarrilloar.android.trendingt.lib.base.EventBus;

public class GreenRobotEventBus implements EventBus {
    //Variable to handle eventBus Instance
    org.greenrobot.eventbus.EventBus eventBus;

    //Constructor to receive eventBus Instance
    public GreenRobotEventBus(org.greenrobot.eventbus.EventBus eventBus) {
        this.eventBus = eventBus;
    }

    //Method to register a subscriber to EventBus Instance
    @Override
    public void register(Object subscriber) {
       eventBus.register(subscriber);
    }

    //Method to unregister a subscriber to EventBus Instance
    @Override
    public void unregister(Object subscriber) {
        eventBus.unregister(subscriber);
    }
    //Method to post an event
    @Override
    public void post(Object event) {
        eventBus.post(event);
    }
}
