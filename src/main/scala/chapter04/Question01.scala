package main.scala.chapter04

import scala.collection.mutable

object Question01 {

  /* Given a directed graph, design and algorithm to find out whether there is a route between two nodes */

  // Implementation of BFS (Breadth-first-search)
  def existPath(nodeA: NodeSearch, nodeB: NodeSearch): Boolean = {

    val queue = mutable.Queue(nodeA.children)

//    queue.dequeue().map()

    false
  }

}
