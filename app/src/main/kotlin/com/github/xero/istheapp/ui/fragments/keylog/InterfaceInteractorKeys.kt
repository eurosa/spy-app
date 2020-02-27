package com.github.xero.istheapp.ui.fragments.keylog

import com.github.xero.istheapp.di.PerActivity
import com.github.xero.istheapp.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 18/03/18.
 */
@PerActivity
interface InterfaceInteractorKeys<V : InterfaceViewKeys> : InterfaceInteractor<V> {
    fun valueEventEnableKeys()
}