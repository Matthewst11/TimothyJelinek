library(treemap)

group <- c("Cat","Dog","Bird", "Squirrel", "Rabbit")
value <- c(39, 43, 22, 13, 10)
data <- data.frame(group,value)

treemap(data,
        index="group",
        vSize="value",
        type="index"
)