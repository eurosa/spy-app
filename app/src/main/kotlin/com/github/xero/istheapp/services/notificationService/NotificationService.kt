package com.github.xero.istheapp.services.notificationService

import android.app.Notification
import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import com.github.xero.istheapp.app.IsTheApp
import com.github.xero.istheapp.utils.Consts.FACEBOOK_MESSENGER_PACK_NAME
import com.github.xero.istheapp.utils.Consts.INSTAGRAM_PACK_NAME
import com.github.xero.istheapp.utils.Consts.TYPE_INSTAGRAM
import com.github.xero.istheapp.utils.Consts.TYPE_MESSENGER
import com.github.xero.istheapp.utils.Consts.TYPE_WHATSAPP
import com.github.xero.istheapp.utils.Consts.WHATSAPP_PACK_NAME
import javax.inject.Inject

/**
 * Created by luis rafael on 27/03/19.
 */
class NotificationService : NotificationListenerService() {

    @Inject lateinit var interactor:InteractorNotificationService

    override fun onCreate() {
        super.onCreate()
        IsTheApp.appComponent.inject(this)
    }

    override fun onListenerConnected() {
        interactor.setRunService(true)
    }

    override fun onListenerDisconnected() {
        interactor.setRunService(false)
    }

    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        super.onNotificationPosted(sbn)

        if (sbn!=null){
            val typeNotification = matchTypeNotification(sbn.packageName)

            if (sbn.tag != null && typeNotification!=0){

                val bundle = sbn.notification.extras
                val text = bundle.getString(Notification.EXTRA_TEXT)
                val title = bundle.getString(Notification.EXTRA_TITLE)
                val icon = sbn.notification.largeIcon
                val nameImage = sbn.postTime

                interactor.getNotificationExists(nameImage.toString()){
                    interactor.setDataMessageNotification(typeNotification,text,title,nameImage.toString(),icon)
                }

            }
        }
    }

    private fun matchTypeNotification(packageName:String) : Int =
            when (packageName) {
                FACEBOOK_MESSENGER_PACK_NAME -> TYPE_MESSENGER
                WHATSAPP_PACK_NAME -> TYPE_WHATSAPP
                INSTAGRAM_PACK_NAME -> TYPE_INSTAGRAM
                else -> 0
            }

}