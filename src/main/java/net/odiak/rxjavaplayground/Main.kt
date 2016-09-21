@file:JvmName("Main")
package net.odiak.rxjavaplayground

import rx.Observable

fun main(args: Array<String>) {
    Observable.just("oops!").subscribe {
        println(it)
    }
}
