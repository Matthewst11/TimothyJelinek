def fractional_knapsack(values, weights, capacity):
    """
    Solve the fractional knapsack problem and return the maximum value that can be obtained.
    """
    # This creates a list of tuples (value, weight, value-to-weight ratio)
    items = [(v, w, v / w) for v, w in zip(values, weights)]

    # This sorts items based on value-to-weight ratio in descending order
    items.sort(key=lambda x: x[2], reverse=True)

    # This initializes total value and remaining capacity
    total_value = 0
    remaining_capacity = capacity

    # This iterates through sorted items
    for item in items:
        if item[1] <= remaining_capacity:
            # This takes the entire item if it fits
            total_value += item[0]
            remaining_capacity -= item[1]
        else:
            # This takes a fraction of the item
            fraction = remaining_capacity / item[1]
            total_value += item[0] * fraction
            break

    return total_value
    pass

def coin_change_greedy(coins, amount):
    """
    Using a greedy approach, determine the minimum number of coins needed to make the given amount.
    If it's not possible to make the amount using the given coin denominations, return -1.
    """
    # This sorts coins in descending order
    coins.sort(reverse=True)

    # This initialize the count of coins needed
    num_coins = 0

    # This iterates through coins
    for coin in coins:
        while amount >= coin:
            # This uses as many coins of this denomination as possible
            amount -= coin
            num_coins += 1

    # This checks if amount is not zero, it's not possible to make the amount
    if amount != 0:
        return -1
    else:
        return num_coins
    pass

def activity_selection(activities):
    """
    Given a list of 'activities' where each activity is represented as a tuple (start_time, end_time),
    determine the maximum number of activities that can be scheduled without any conflicts.
    Return the list of selected activities.
    """
     # This sorts activities by end time
    activities.sort(key=lambda x: x[1])

    # This initializes a list for selected activities
    selected_activities = [activities[0]]

    # This initializes the end time of the last selected activity
    last_end_time = activities[0][1]

    # This iterates through sorted activities starting from the second
    for activity in activities[1:]:
        if activity[0] >= last_end_time:
            # Checks if activity does not conflict with previous selection
            selected_activities.append(activity)
            last_end_time = activity[1]

    return selected_activities
    pass
