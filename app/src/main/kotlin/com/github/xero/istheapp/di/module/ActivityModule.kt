package com.github.xero.istheapp.di.module

import android.content.Context
import androidx.fragment.app.FragmentManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.xero.istheapp.di.PerActivity
import com.github.xero.istheapp.ui.activities.login.InteractorLogin
import com.github.xero.istheapp.ui.activities.login.InterfaceInteractorLogin
import com.github.xero.istheapp.ui.activities.login.InterfaceViewLogin
import com.github.xero.istheapp.ui.activities.mainparent.InteractorMainParent
import com.github.xero.istheapp.ui.activities.mainparent.InterfaceInteractorMainParent
import com.github.xero.istheapp.ui.activities.mainparent.InterfaceViewMainParent
import com.github.xero.istheapp.ui.activities.register.InteractorRegister
import com.github.xero.istheapp.ui.activities.register.InterfaceInteractorRegister
import com.github.xero.istheapp.ui.activities.register.InterfaceViewRegister
import com.github.xero.istheapp.ui.fragments.calls.InteractorCalls
import com.github.xero.istheapp.ui.fragments.calls.InterfaceInteractorCalls
import com.github.xero.istheapp.ui.fragments.calls.InterfaceViewCalls
import com.github.xero.istheapp.ui.fragments.photo.InteractorPhoto
import com.github.xero.istheapp.ui.fragments.photo.InterfaceInteractorPhoto
import com.github.xero.istheapp.ui.fragments.photo.InterfaceViewPhoto
import com.github.xero.istheapp.ui.fragments.keylog.InteractorKeys
import com.github.xero.istheapp.ui.fragments.keylog.InterfaceInteractorKeys
import com.github.xero.istheapp.ui.fragments.keylog.InterfaceViewKeys
import com.github.xero.istheapp.ui.fragments.maps.InteractorMaps
import com.github.xero.istheapp.ui.fragments.maps.InterfaceInteractorMaps
import com.github.xero.istheapp.ui.fragments.maps.InterfaceViewMaps
import com.github.xero.istheapp.ui.fragments.message.InteractorMessage
import com.github.xero.istheapp.ui.fragments.message.InterfaceInteractorMessage
import com.github.xero.istheapp.ui.fragments.message.InterfaceViewMessage
import com.github.xero.istheapp.ui.fragments.notifications.InteractorNotifyMessage
import com.github.xero.istheapp.ui.fragments.notifications.InterfaceInteractorNotifyMessage
import com.github.xero.istheapp.ui.fragments.notifications.InterfaceViewNotifyMessage
import com.github.xero.istheapp.ui.fragments.recording.InteractorRecording
import com.github.xero.istheapp.ui.fragments.recording.InterfaceInteractorRecording
import com.github.xero.istheapp.ui.fragments.recording.InterfaceViewRecording
import com.github.xero.istheapp.ui.fragments.social.InteractorSocial
import com.github.xero.istheapp.ui.fragments.social.InterfaceInteractorSocial
import com.github.xero.istheapp.ui.fragments.social.InterfaceViewSocial
import com.google.android.gms.maps.SupportMapFragment
import dagger.Module
import dagger.Provides

/**
 * Created by luis rafael on 8/03/18.
 */
@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @Provides
    fun provideContext(): Context = activity.applicationContext

    @Provides
    fun provideActivity(): AppCompatActivity = activity

    @Provides
    fun provideSupportFragmentManager(): FragmentManager = activity.supportFragmentManager

    @Provides
    fun provideSupportMapFragment(): SupportMapFragment = SupportMapFragment.newInstance()

    @Provides
    fun provideLayoutManager(context: Context): LinearLayoutManager = LinearLayoutManager(context)

    @Provides
    @PerActivity
    fun provideInterfaceInteractorMain(interactorParent: InteractorMainParent<InterfaceViewMainParent>): InterfaceInteractorMainParent<InterfaceViewMainParent> = interactorParent

    @Provides
    @PerActivity
    fun provideInterfaceInteractorLogin(interactor: InteractorLogin<InterfaceViewLogin>): InterfaceInteractorLogin<InterfaceViewLogin> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorRegister(interactor: InteractorRegister<InterfaceViewRegister>): InterfaceInteractorRegister<InterfaceViewRegister> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorMaps(interactor: InteractorMaps<InterfaceViewMaps>): InterfaceInteractorMaps<InterfaceViewMaps> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorCalls(interactor: InteractorCalls<InterfaceViewCalls>): InterfaceInteractorCalls<InterfaceViewCalls> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorKeys(interactor: InteractorKeys<InterfaceViewKeys>): InterfaceInteractorKeys<InterfaceViewKeys> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorMessage(interactor: InteractorMessage<InterfaceViewMessage>): InterfaceInteractorMessage<InterfaceViewMessage> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorPhoto(interactor: InteractorPhoto<InterfaceViewPhoto>): InterfaceInteractorPhoto<InterfaceViewPhoto> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorSocial(interactor: InteractorSocial<InterfaceViewSocial>): InterfaceInteractorSocial<InterfaceViewSocial> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorRecording(interactor: InteractorRecording<InterfaceViewRecording>): InterfaceInteractorRecording<InterfaceViewRecording> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorNotify(interactor: InteractorNotifyMessage<InterfaceViewNotifyMessage>): InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage> = interactor


}