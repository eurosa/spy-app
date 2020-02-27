package com.github.xero.istheapp.ui.fragments.message

import com.github.xero.istheapp.ui.activities.base.InterfaceView
import com.github.xero.istheapp.ui.adapters.smsadapter.SmsRecyclerAdapter

/**
 * Created by luis rafael on 20/03/18.
 */
interface InterfaceViewMessage : InterfaceView {

    fun setRecyclerAdapter(smsRecyclerAdapter: SmsRecyclerAdapter)

}