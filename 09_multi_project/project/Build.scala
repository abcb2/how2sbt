import sbt._

object MultiProject extends Build {
  lazy val root = Project(
    id = "multi_root",
    base = file(".")
  ) aggregate (project1, project2)

  lazy val project1 = Project(
    id = "multi_project1",
    base = file("project1")
  )

  lazy val project2 = Project(
    id = "multi_project2",
    base = file("project2")
  )

}