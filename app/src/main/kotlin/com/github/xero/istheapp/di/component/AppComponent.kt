package com.github.xero.istheapp.di.component

import com.github.xero.istheapp.app.IsTheApp
import com.github.xero.istheapp.data.rxFirebase.InterfaceFirebase
import com.github.xero.istheapp.di.module.AppModule
import com.github.xero.istheapp.di.module.FirebaseModule
import com.github.xero.istheapp.services.accessibilityData.AccessibilityDataService
import com.github.xero.istheapp.services.notificationService.NotificationService
import dagger.Component
import javax.inject.Singleton

/**
 * Created by luis rafael on 13/03/18.
 */
@Singleton
@Component(modules = [AppModule::class, FirebaseModule::class])
interface AppComponent {

    fun inject(app: IsTheApp)
    fun inject(accessibilityDataService: AccessibilityDataService)
    fun inject(notificationService: NotificationService)
    fun getInterfaceFirebase(): InterfaceFirebase

}