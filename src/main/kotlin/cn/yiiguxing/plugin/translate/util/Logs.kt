@file:Suppress("unused")

package cn.yiiguxing.plugin.translate.util

import com.intellij.openapi.diagnostic.Logger

fun Logger.v(message: String) = trace(message)
fun Logger.d(message: String) = debug(message)
fun Logger.i(message: String) = info(message)
fun Logger.w(tr: Throwable) = warn(tr)
fun Logger.w(message: String) = warn(message)
fun Logger.w(message: String, tr: Throwable) = warn(message, tr)
fun Logger.e(message: String) = error(message)
fun Logger.e(message: String, tr: Throwable) = error(message, tr)
fun Logger.e(message: String, tr: Throwable? = null, vararg details: String) = error(message, tr, *details)