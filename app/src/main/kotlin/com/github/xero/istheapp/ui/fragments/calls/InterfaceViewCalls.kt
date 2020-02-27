package com.github.xero.istheapp.ui.fragments.calls

import com.github.xero.istheapp.ui.activities.base.InterfaceView
import com.github.xero.istheapp.ui.adapters.callsadapter.CallsRecyclerAdapter

/**
 * Created by luis rafael on 12/03/18.
 */
interface InterfaceViewCalls : InterfaceView {

    fun setRecyclerAdapter(recyclerAdapter: CallsRecyclerAdapter)

}