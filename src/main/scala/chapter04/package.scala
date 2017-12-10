package main.scala

package object chapter04 {

  case class Node(
      name: String,
      children: Array[Node]
  )

  case class NodeSearch(
      name: String,
      children: Array[NodeSearch],
      visited: Boolean = false
  )

  //Optional
  case class Tree(
      root: Node
  )
}
