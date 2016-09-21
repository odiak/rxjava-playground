@file:JvmName("Main")
package net.odiak.rxjavaplayground

import rx.Observable
import rx.schedulers.Schedulers;

fun main(args: Array<String>) {
    val obs = Observable.create<String> { o ->
        o.onNext("A")
        Thread.sleep(100)
        o.onNext("B")
        Thread.sleep(100)
        o.onNext("C")
        o.onError(Throwable("hello"))
        o.onCompleted()
    }

    obs
            .doOnError({ e ->
                println(e)
            })
            .subscribe({ s ->
                println("onNext: $s")
            }, { e ->
                println("onError: $e")
            })
}
