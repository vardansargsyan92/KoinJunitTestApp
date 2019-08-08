package com.example.koinjunittest.bindings

import android.view.View
import androidx.databinding.BindingAdapter
import com.example.koinjunittestviewmodels.base.ICommand


@BindingAdapter(value = ["command", "commandParameter"], requireAll = false)
fun bindViewCommand(view: View, command: ICommand?, commandParameter: Any?) {
    view.setOnClickListener { _ ->
        command?.execute(commandParameter)
    }
}


@BindingAdapter(value = ["isVisible"])
fun bindViewVisibility(view: View, isVisible: Any?) {
    val visible = getVisibility(isVisible)
    view.visibility = if (visible) View.VISIBLE else View.INVISIBLE
}

@BindingAdapter(value = ["isGone"])
fun bindViewIsGone(view: View, isInvisible: Any?) {
    val visible = getVisibility(isInvisible)
    view.visibility = if (visible) View.GONE else View.VISIBLE
}

@BindingAdapter(value = ["isInvisible"])
fun bindViewInvisibility(view: View, isInvisible: Any?) {
    val visible = getVisibility(isInvisible)
    view.visibility = if (visible) View.INVISIBLE else View.VISIBLE
}

private fun getVisibility(visibility: Any?): Boolean {
    var isVisible = true
    when (visibility) {
        null -> isVisible = false
        is Boolean -> isVisible = (visibility as Boolean?)!!
        is String -> isVisible = visibility.isNotEmpty()
    }
    return isVisible
}

