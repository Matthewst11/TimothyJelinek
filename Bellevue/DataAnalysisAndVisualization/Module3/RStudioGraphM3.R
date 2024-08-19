library(ggplot2)
data(trees)

head(trees, 6)

p <- ggplot(data=trees, aes(x = Girth, y=Height)) + geom_violin()
print(p)