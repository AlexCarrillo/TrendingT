/*-------------------------------------------------------------------------------------------------
*
*File: EventBus.java
* Autor: Jesús Alejandro Carrillo Arreola
* Contact: alexcarrilloar@gmail.com
* Date: October/30/2016
* Description: Interface to handle EventBus Library
*
*Last Modification
* Date                 Modified by                  Modification
*==================================================================================================
*October/30/2016    J. Alejandro Carrillo Arreola    register, unregister, post abstract methods were added
*------------------------------------------------------------------------------------------------ */


package ma.alexcarrilloar.android.trendingt.lib.base;


public interface EventBus {
    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
