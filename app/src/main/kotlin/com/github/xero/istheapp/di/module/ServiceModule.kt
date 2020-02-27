package com.github.xero.istheapp.di.module

import android.app.Service
import android.content.Context
import com.github.xero.istheapp.di.PerService
import com.github.xero.istheapp.services.calls.InteractorCalls
import com.github.xero.istheapp.services.calls.InterfaceInteractorCalls
import com.github.xero.istheapp.services.calls.InterfaceServiceCalls
import com.github.xero.istheapp.services.sms.InteractorSms
import com.github.xero.istheapp.services.sms.InterfaceInteractorSms
import com.github.xero.istheapp.services.sms.InterfaceServiceSms
import dagger.Module
import dagger.Provides

/**
 * Created by luis rafael on 13/03/18.
 */
@Module
class ServiceModule(var service:Service) {

    @Provides
    fun provideContext(): Context = service.applicationContext

    @Provides
    @PerService
    fun provideInterfaceInteractorCalls(interactor: InteractorCalls<InterfaceServiceCalls>): InterfaceInteractorCalls<InterfaceServiceCalls> = interactor

    @Provides
    @PerService
    fun provideInterfaceInteractorSms(interactor: InteractorSms<InterfaceServiceSms>): InterfaceInteractorSms<InterfaceServiceSms> = interactor

}