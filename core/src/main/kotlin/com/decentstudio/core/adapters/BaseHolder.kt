package com.decentstudio.core.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

open class BaseHolder<T>(
	parent: ViewGroup,
	@LayoutRes layoutId: Int,
	private val variableId: Int,
	private val binding: ViewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), layoutId, parent, false)) : RecyclerView.ViewHolder(binding.root) {

	fun hasPayloads(payloads: MutableList<Any>) = false

	@CallSuper
	fun bind(item: T) {
		binding.setVariable(variableId, item)
		binding.executePendingBindings()
	}
}