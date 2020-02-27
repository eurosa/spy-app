package com.github.xero.istheapp.ui.fragments.calls

import com.github.xero.istheapp.di.PerActivity
import com.github.xero.istheapp.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 12/03/18.
 */
@PerActivity
interface InterfaceInteractorCalls<V : InterfaceViewCalls> : InterfaceInteractor<V> {
    fun stopAudioCallHolder()
}