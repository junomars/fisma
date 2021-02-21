package me.synology.junomars

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("me.synology.junomars")
		.start()
}

