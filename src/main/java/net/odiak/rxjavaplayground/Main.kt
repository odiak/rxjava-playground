@file:JvmName("Main")
package net.odiak.rxjavaplayground

import rx.Observable
import rx.subjects.BehaviorSubject

fun main(args: Array<String>) {
    val sub = BehaviorSubject.create<String>()

    sub.subscribe {
        println("@1: $it")
    }

    sub.onNext("A")
    sub.onNext("B")
    sub.onNext("C")

    sub.subscribe {
        println("@2: $it")
    }

    sub.onNext("D")
    sub.onNext("E")
    sub.onNext("F")
}
