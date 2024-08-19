##
# Define a class to represent a voting machine.
#
# A voting machine that keeps track of votes for each of two parties.
class VotingMachine:
    ## construct a new voting machine
    #
    def __init__(self):
        self._dem_count = 0
        self._rep_count = 0
        
    ## Record votes for democrats
    #
    def voteDemocrat(self):
        self._dem_count += 1
        
    ## Record votes for republicans
    #
    def voteRepublican(self):
        self._rep_count += 1
        
    ## Get tally of votes for each party
    # @return - a tuple with dem & rep tallies respectively
    # he tuple prevents data being changed
    def getTallies(self):
        return (self._dem_count, self._rep_count)
    
    ## reset for the voting machine
    #
    def reset(self):
        self._dem_count = 0
        self._rep_count = 0
        