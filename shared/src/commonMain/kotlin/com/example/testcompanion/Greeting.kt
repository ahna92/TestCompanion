package com.example.testcompanion

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext
import kotlin.native.concurrent.ThreadLocal

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    @ThreadLocal
    companion object {
        private var count = 0
        fun addCount() {
            count++
        }

        fun getCount(): Int {
            return count
        }

        fun onCallBack(action: () -> Unit) {
            GlobalScope.launch(Dispatchers.Default) {
                action()
            }
        }
    }
}