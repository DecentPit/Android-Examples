package com.decentstudio.models

import android.app.Activity
import com.decentstudio.MainActivity
import kotlin.reflect.KClass

enum class Example(val id: String, val activity: KClass<out Activity>) {
	CONSTRAINT_LAYOUT("ConstraintLayout", MainActivity::class),
	RECYCLER_VIEW("RecyclerView", MainActivity::class),
	TRANSITIONS("Transitions", MainActivity::class);
}