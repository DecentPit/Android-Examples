package com.decentstudio.core.adapters

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

abstract class BaseAdapter<T>(itemCallback: DiffUtil.ItemCallback<T>) : ListAdapter<T, BaseHolder<T>>(itemCallback) {
	override fun onBindViewHolder(holder: BaseHolder<T>, position: Int) {
		holder.bind(getItem(position))
	}

	override fun onBindViewHolder(holder: BaseHolder<T>, position: Int, payloads: MutableList<Any>) {
		if (holder.hasPayloads(payloads))
			holder.bind(getItem(position))
		super.onBindViewHolder(holder, position, payloads)
	}
}