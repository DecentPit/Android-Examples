package com.decentstudio.core.adapters

import androidx.recyclerview.widget.DiffUtil

interface BaseItemCallBack<T: Any> {
	fun create() = object : DiffUtil.ItemCallback<T>() {
		override fun areItemsTheSame(oldItem: T, newItem: T) = this@BaseItemCallBack.areItemsTheSame(oldItem, newItem)

		override fun areContentsTheSame(oldItem: T, newItem: T) = this@BaseItemCallBack.areContentsTheSame(oldItem, newItem)

		override fun getChangePayload(oldItem: T, newItem: T): Any? = this@BaseItemCallBack.getChangePayload(oldItem, newItem)
	}

	fun areItemsTheSame(oldItem: T, newItem: T) = oldItem === newItem

	fun areContentsTheSame(oldItem: T, newItem: T) = oldItem == newItem

	fun getChangePayload(oldItem: T, newItem: T) = null
}