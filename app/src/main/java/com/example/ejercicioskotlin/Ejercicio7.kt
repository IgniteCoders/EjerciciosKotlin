package com.example.ejercicioskotlin

/** Subasta especial **/

fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    /*if (bid != null) {
        return bid.amount
    } else {
        return minimumPrice
    }*/

    return bid?.amount ?: minimumPrice
}