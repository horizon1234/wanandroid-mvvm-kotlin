package luyao.wanandroid

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 *Time:2020/1/15
 *Author:yhzhang26
 */
class demoObserverJA8 : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun create(){}
}