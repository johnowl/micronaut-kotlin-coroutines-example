package com.johnowl

import io.micronaut.runtime.Micronaut.*
import reactor.blockhound.BlockHound

fun main(args: Array<String>) {

	BlockHound.install();

	build()
	    .args(*args)
		.packages("com.johnowl")
		.start()
}

