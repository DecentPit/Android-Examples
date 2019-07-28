package com.decentstudio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.decentstudio.adapters.ExamplesAdapter
import com.decentstudio.databinding.ActivityMainBinding
import com.decentstudio.models.Example

class MainActivity : AppCompatActivity() {
	private lateinit var binding: ActivityMainBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
		setSupportActionBar(binding.toolbar)
		val adapter = ExamplesAdapter()
		binding.mainMenu.adapter = adapter
		val toMutableList = Example.values().toMutableList()
		toMutableList.removeAt(0)
		adapter.submitList(toMutableList)
		binding.mainMenu.post {
			adapter.submitList(Example.values().toMutableList())
		}
	}
}
