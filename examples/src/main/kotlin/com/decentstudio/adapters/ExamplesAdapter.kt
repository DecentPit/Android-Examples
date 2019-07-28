package com.decentstudio.adapters

import android.view.ViewGroup
import com.decentstudio.BR
import com.decentstudio.R
import com.decentstudio.core.adapters.BaseAdapter
import com.decentstudio.core.adapters.BaseHolder
import com.decentstudio.core.adapters.BaseItemCallBack
import com.decentstudio.models.Example

class ExamplesAdapter : BaseAdapter<Example>(create()) {
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = BaseHolder<Example>(parent, R.layout.item_example, BR.example)

	companion object : BaseItemCallBack<Example>
}