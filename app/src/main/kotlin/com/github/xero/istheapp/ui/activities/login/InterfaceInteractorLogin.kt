package com.github.xero.istheapp.ui.activities.login

import com.github.xero.istheapp.di.PerActivity
import com.github.xero.istheapp.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 9/03/18.
 */
@PerActivity
interface InterfaceInteractorLogin<V : InterfaceViewLogin> : InterfaceInteractor<V> {
    fun signInDisposable(email: String, pass: String)
}