package com.github.xero.istheapp.di.component

import com.github.xero.istheapp.di.PerService
import com.github.xero.istheapp.di.module.ServiceModule
import com.github.xero.istheapp.services.calls.CallsService
import com.github.xero.istheapp.services.sms.SmsService
import com.github.xero.istheapp.services.social.MonitorService
import dagger.Component

/**
 * Created by luis rafael on 13/03/18.
 */
@PerService
@Component(dependencies = [AppComponent::class], modules = [ServiceModule::class])
interface ServiceComponent {

    fun inject(callsService: CallsService)
    fun inject(smsService: SmsService)
    fun inject(monitorService: MonitorService)

}