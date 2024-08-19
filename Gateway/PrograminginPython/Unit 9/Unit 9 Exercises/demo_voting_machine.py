##
# Demonstrate the voting machine class
#
from voting_machine import VotingMachine

# create an instance of a new voting machine - aka instantiation
vm = VotingMachine()

# cast some votes
vm.voteRepublican()
vm.voteDemocrat()
vm.voteDemocrat()
vm.voteRepublican()
vm.voteDemocrat()
vm.voteRepublican()
vm.voteDemocrat()
vm.voteDemocrat()
vm.voteRepublican()

# show the vote total - or tallies
print("Democrats: %d   Republicans: %d" % vm.getTallies())

# clear thew votes and vote again
print()
vm.reset()
print("votes cleared\n")

# vote early and often - or just vote again 
vm.voteRepublican()
vm.voteDemocrat()
vm.voteDemocrat()
vm.voteRepublican()
vm.voteDemocrat()
vm.voteRepublican()
vm.voteDemocrat()
vm.voteDemocrat()
vm.voteRepublican()
vm.voteDemocrat()
print("Democrats: %d   Republicans: %d" % vm.getTallies())