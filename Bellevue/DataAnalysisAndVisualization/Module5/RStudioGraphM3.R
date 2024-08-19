library(ggplot2)
library(GGally)
library(CGPfunctions)
library(leaflet)

data(trees)

geojson_file <- "C:/Users/mstga/OneDrive/Desktop/Bellevue/DataAnalysisAndVisualization/Module7/world.geojson"

my_sf <- read_sf(geojson_file)

names(my_sf)

my_sf <- my_sf[substr(my_sf$NAME, 1, 2) == "An", ]

ggplot() + 
  geom_sf(data = my_sf, aes(fill = NAME)) +
  scale_fill_viridis_d() +
  theme_void() +
  labs(title = "Cartogram of Countries starting with 'An")