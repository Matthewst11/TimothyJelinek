library(ggplot2)
data(trees)

trees_matrix <- as.matrix(trees[, c("Girth", "Height")])

heatmap(trees_matrix, Rowv = NA, Colv = NA, col = heat.colors(10), scale="column")



