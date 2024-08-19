library(ggplot2)
library(GGally)
library(CGPfunctions)
library(leaflet)

file_path <- "C:/Users/mstga/OneDrive/Desktop/Bellevue/DataAnalysisAndVisualization/TermProject/ConcussionInjuries2012-2014.csv"

concussion_data <- read.csv(file_path)

# read CSV file
concussion_data <- read.csv(file_path)

# count the occurrences of every player position and convert to data frame
position_counts <- as.data.frame(table(concussion_data$Position))

# rename columns in data frame
colnames(position_counts) <- c("Position", "Count")

# plot bar graph
ggplot(position_counts, aes(x = Position, y = Count)) +
  geom_bar(stat = "identity", fill = "skyblue", color = "black") +
  labs(title = "Count of Players by Position", x = "Position", y = "Count") +
  theme_minimal() +
  theme(axis.text.x = element_text(angle = 45, hjust = 1))  # Rotate x-axis labels for better readability

# convert the date column to date type and extract the year
concussion_data$Date <- as.Date(concussion_data$Date, format = "%d/%m/%Y")
concussion_data$Year <- format(concussion_data$Date, "%Y")

# filter to find concussions
concussions <- subset(concussion_data, grepl("Concussion", Reported.Injury.Type))

# count concussions per year
concussions_by_year <- table(concussions$Year)
concussions_by_year <- as.data.frame(concussions_by_year)
colnames(concussions_by_year) <- c("Year", "Count")

# plot the line graph
ggplot(concussions_by_year, aes(x = Year, y = Count, group = 1)) +
  geom_line(color = "skyblue", size = 1.5) +
  geom_point(color = "blue", size = 3) +
  labs(title = "Number of Concussions by Year", x = "Year", y = "Number of Concussions") +
  theme_minimal() +
  theme(axis.text.x = element_text(angle = 45, hjust = 1))  # Rotate x-axis labels for better readability

ggplot(concussion_data, aes(x = Season, y = Games.Missed)) + geom_point(color = "orange") + labs(title = "Scatter Plot: Season vs Games Missed", x = "Season", y = "Games Missed") + theme_minimal()

ggplot(concussion_data, aes(x = Position, y = Games.Missed)) + geom_boxplot(fill = "lightgreen", color = "darkgreen") + labs(title = "Box Plot: Weeks Missed by Position", x = "Position", y = "Games.Missed") + theme_minimal() + theme(axis.text.x = element_text(angle = 45, hjust = 1))

ggplot(concussion_data, aes(x = Weeks.Injured)) + geom_histogram(binwidth = 1, fill = "purple", color = "black") + labs(title= "Histogram: Distribution of Weeks of Injury", x="Weeks Injured", y ="Frequency") + theme_minimal() + scale_y_continuous(breaks = scales::pretty_breaks(n = 10))

ggplot(data = concussion_data, aes(x = Date, y = Position, fill = Weeks.Injured)) + geom_tile() + scale_fill_gradient(low = "white", high = "red", name = "Weeks Injured") + labs(title = "Heatmap of Date and Position of Injury", x = "Date", y = "Position") + theme_minimal() + theme(axis.text.x = element_text(angle = 45, hjust = 1))
