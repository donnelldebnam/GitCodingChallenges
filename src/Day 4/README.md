## Day 4 Exercise (Dyanmic Programming)

### What is Dyanmic Programming?

Dynamic programming is ultimately a solution to <i>expensive</i> calls on <b>recursive</b> functions, that we 
compute over and over again in a single algorithm. Dynamic programming allows us to simply store the results 
of subproblems, so that we do not have to re-compute them when needed later. This simple optimization reduces time complexities from <b>exponential</b> to <b>polynomial</b>.

Think of dynamic programming as the computer's brain that you actually have access to. You're essentially asking the computer, "Do you have the answer to this small problem?". If the computer does have the answer, it can spit it out in no time. If not, you must make the computation, however, you're allowed to then store the answer, since you'll likely use the information sometime in the future.

### Before You Begin...

* If this is your first exercise, fork the root repository and clone the repo to your account with 
`git clone https://github.com/<YOUR_USERNAME>/GitCodingChallenges`

* After cloning, make sure the remote is set to your account with `git remote -v` <-- this should return
a link with your username in it


### Objectives & Tips

* In this exercise, you'll be tasked with designing a dynamic programming-based algorithm that will drastically
increase the speed of the typical recursive fibonacci algorithm

* The ***main ideas*** here are: 
  * Have some ultimate storage unit/caching system that will be able to tell us if we've already computed the output (y)
  for some given input (x)
  * If we haven't seen this input before, we then compute the output (y) given x and then store the output for future reference

* Once you have implemented the method, be sure to `add`, `commit`, and `push` your changes
