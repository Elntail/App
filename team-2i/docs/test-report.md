We tested the edu.vassar.cmpu203.wakeupapp.controller.game to see if dictionary words would repeat upon play. Played edu.vassar.cmpu203.wakeupapp.controller.game consecutively to see if words repeat before whole list has been iterated through. Words proved to not repeat / properly iterated through and ignored words not 5 letters in length. List infinitely repeats until user exits.

If letter is incorrect, this is shown. Point docked.

If letter is correct, this is documented.

If letter is repeated, then system asks for retry. No points docked.

If word is guessed (and is 5 letters), then incorrect mark tallied and word stored.

If word is guessed that isn't 5 letters, then system asks for retry.No points docked.

If word is guessed correctly, edu.vassar.cmpu203.wakeupapp.controller.game ends (win).

If "exit" or "quit" is typed, edu.vassar.cmpu203.wakeupapp.controller.game ends.

If all correct letters are guessed, edu.vassar.cmpu203.wakeupapp.controller.game ends (win).

If all body parts are made, edu.vassar.cmpu203.wakeupapp.controller.game is lost.

- Temporary test prints are placed in edu.vassar.cmpu203.wakeupapp.model.Dictionary class to show the state of the list made:
![Screen Shot 2023-03-22 at 1.44.25 PM.png](..%2F..%2FDesktop%2FScreen%20Shot%202023-03-22%20at%201.44.25%20PM.png)

- Example edu.vassar.cmpu203.wakeupapp.controller.game: the first 5 letter word / answer is aback:

loribeth@Loris-MacBook-Pro-2 team-2i % javac edu.vassar.cmpu203.wakeupapp.controller.Controller.java
java edu.vassar.cmpu203.wakeupapp.controller.Controller
sprinkles
aback
dog
abase
scrap
abate
Welcome to hangman! This is steve:
(0/6)
Steve will die.
Save Steve by guessing the word.
Good luck.
You can also quit at any time by typing 'quit' or 'exit', if you are a monster that is...
(0/6)
Please guess a valid letter
---------------------------------------------
(0/6)
Current Word : _____
Used Words: []
Used Letters: []
a
That is a correct letter. Guess again.
---------------------------------------------
(0/6)
Current Word : a_a__
Used Words: []
Used Letters: [a]
a
Incorrect Input. Please try again.
---------------------------------------------
(0/6)
Current Word : a_a__
Used Words: []
Used Letters: [a]
d
Bad guess. Steve now loses a limb.
You now have 5 attempts...
---------------------------------------------
HEAD (1/6)
Current Word : a_a__
Used Words: []
Used Letters: [a, d]
words
Incorrect word guess. Maybe next time
You now have 4 attempts...
---------------------------------------------
HEAD, BODY (2/6)
Current Word : a_a__
Used Words: [words]
Used Letters: [a, d]
four
Incorrect Word length. Please try again.
---------------------------------------------
HEAD, BODY (2/6)
Current Word : a_a__
Used Words: [words]
Used Letters: [a, d]
abate
Incorrect word guess. Maybe next time
You now have 3 attempts...
---------------------------------------------
HEAD, BODY, RIGHT ARM (3/6)
Current Word : a_a__
Used Words: [words, abate]
Used Letters: [a, d]
aback
---------------------------------------------
HEAD, BODY, RIGHT ARM (3/6)
That is correct. The answer is: aback
---------------------------------------------
edu.vassar.cmpu203.wakeupapp.model.Hangman edu.vassar.cmpu203.wakeupapp.view.Status = true

- The same list persists. The next 5 letter word / answer is abase.

sprinkles
aback
dog
abase
scrap
abate
Welcome to hangman! This is steve:
(0/6)
Steve will die.
Save Steve by guessing the word.
Good luck.
You can also quit at any time by typing 'quit' or 'exit', if you are a monster that is...
(0/6)
Please guess a valid letter
---------------------------------------------
(0/6)
Current Word : _____
Used Words: []
Used Letters: []

---------------------------------------------
(0/6)
That is correct. The answer is: abase
---------------------------------------------
edu.vassar.cmpu203.wakeupapp.model.Hangman edu.vassar.cmpu203.wakeupapp.view.Status = true

sprinkles
aback
dog
abase
scrap
abate
Welcome to hangman! This is steve:
(0/6)
Steve will die.
Save Steve by guessing the word.
Good luck.
You can also quit at any time by typing 'quit' or 'exit', if you are a monster that is...
(0/6)
Please guess a valid letter
---------------------------------------------
(0/6)
Current Word : _____
Used Words: []
Used Letters: []

- Now I will continue through the rest of the list

---------------------------------------------
(0/6)
That is correct. The answer is: scrap
---------------------------------------------
edu.vassar.cmpu203.wakeupapp.model.Hangman edu.vassar.cmpu203.wakeupapp.view.Status = true
sprinkles
aback
dog
abase
scrap
abate
Welcome to hangman! This is steve:
(0/6)
Steve will die.
Save Steve by guessing the word.
Good luck.
You can also quit at any time by typing 'quit' or 'exit', if you are a monster that is...
(0/6)
Please guess a valid letter
---------------------------------------------
(0/6)
Current Word : _____
Used Words: []
Used Letters: []
abate
---------------------------------------------
(0/6)
That is correct. The answer is: abate
---------------------------------------------
edu.vassar.cmpu203.wakeupapp.model.Hangman edu.vassar.cmpu203.wakeupapp.view.Status = true
sprinkles
aback
dog
abase
scrap
abate
sprinkles
aback
dog
abase
scrap
abate
Welcome to hangman! This is steve:
(0/6)
Steve will die.
Save Steve by guessing the word.
Good luck.
You can also quit at any time by typing 'quit' or 'exit', if you are a monster that is...
(0/6)
Please guess a valid letter
---------------------------------------------
(0/6)
Current Word : _____
Used Words: []
Used Letters: []

- List is shown to repeat in the same order as a fail-safe, so now aback is the answer again.

---------------------------------------------
(0/6)
That is correct. The answer is: aback
---------------------------------------------
edu.vassar.cmpu203.wakeupapp.model.Hangman edu.vassar.cmpu203.wakeupapp.view.Status = true
sprinkles
aback
dog
abase
scrap
abate
Welcome to hangman! This is steve:
(0/6)
Steve will die.
Save Steve by guessing the word.
Good luck.
You can also quit at any time by typing 'quit' or 'exit', if you are a monster that is...
(0/6)
Please guess a valid letter
---------------------------------------------
(0/6)
Current Word : _____
Used Words: []
Used Letters: []


-To exit, one must write "exit" or "quit"

exit
GOODBYE. U LEFT STEVE TO HANG LIKE AN ANIMAL.
loribeth@Loris-MacBook-Pro-2 team-2i % 

- Now I will compile and start a new session to show that "quit" works in addition to "exit".

loribeth@Loris-MacBook-Pro-2 team-2i % javac edu.vassar.cmpu203.wakeupapp.controller.Controller.java
java edu.vassar.cmpu203.wakeupapp.controller.Controller
aback
abate
dog
abase
scrap
sprinkles
Welcome to hangman! This is steve:
(0/6)
Steve will die.
Save Steve by guessing the word.
Good luck.
You can also quit at any time by typing 'quit' or 'exit', if you are a monster that is...
(0/6)
Please guess a valid letter
---------------------------------------------
(0/6)
Current Word : _____
Used Words: []
Used Letters: []
quit
GOODBYE. U LEFT STEVE TO HANG LIKE AN ANIMAL.
loribeth@Loris-MacBook-Pro-2 team-2i %     

- All letters guessed correctly without typing whole word guess wins the edu.vassar.cmpu203.wakeupapp.controller.game (in this example, abase is the answer):

loribeth@Loris-MacBook-Pro-2 team-2i % javac edu.vassar.cmpu203.wakeupapp.controller.Controller.java
java edu.vassar.cmpu203.wakeupapp.controller.Controller
abase
abate
scrap
sprinkles
aback
dog
Welcome to hangman! This is steve:
(0/6)
Steve will die.
Save Steve by guessing the word.
Good luck.
You can also quit at any time by typing 'quit' or 'exit', if you are a monster that is...
(0/6)
Please guess a valid letter
---------------------------------------------
(0/6)
Current Word : _____
Used Words: []
Used Letters: []
a
That is a correct letter. Guess again.
---------------------------------------------
(0/6)
Current Word : a_a__
Used Words: []
Used Letters: [a]
b
That is a correct letter. Guess again.
---------------------------------------------
(0/6)
Current Word : aba__
Used Words: []
Used Letters: [a, b]
s
That is a correct letter. Guess again.
---------------------------------------------
(0/6)
Current Word : abas_
Used Words: []
Used Letters: [a, b, s]
e
---------------------------------------------
(0/6)
That is correct. The answer is : abase
---------------------------------------------
edu.vassar.cmpu203.wakeupapp.model.Hangman edu.vassar.cmpu203.wakeupapp.view.Status = true

- The new answer is abate, and if all letters/word guesses are incorrect, then you lose:

abase
abate
scrap
sprinkles
aback
dog
Welcome to hangman! This is steve:
(0/6)
Steve will die.
Save Steve by guessing the word.
Good luck.
You can also quit at any time by typing 'quit' or 'exit', if you are a monster that is...
(0/6)
Please guess a valid letter
---------------------------------------------
(0/6)
Current Word : _____
Used Words: []
Used Letters: []

words
Incorrect word guess. Maybe next time
You now have 5 attempts...
---------------------------------------------
HEAD (1/6)
Current Word : _____
Used Words: [words]
Used Letters: []
w
Bad guess. Steve now loses a limb.
You now have 4 attempts...
---------------------------------------------
HEAD, BODY (2/6)
Current Word : _____
Used Words: [words]
Used Letters: [w]
x
Bad guess. Steve now loses a limb.
You now have 3 attempts...
---------------------------------------------
HEAD, BODY, RIGHT ARM (3/6)
Current Word : _____
Used Words: [words]
Used Letters: [w, x]
v
Bad guess. Steve now loses a limb.
You now have 2 attempts...
---------------------------------------------
HEAD, BODY, RIGHT ARM, LEFT ARM (4/6)
Current Word : _____
Used Words: [words]
Used Letters: [w, x, v]
l
Bad guess. Steve now loses a limb.
You now have 1 attempts...
---------------------------------------------
HEAD, BODY, RIGHT ARM, LEFT ARM, RIGHT LEG (5/6)
Current Word : _____
Used Words: [words]
Used Letters: [w, x, v, l]
death
Incorrect word guess. Maybe next time
You now have 0 attempts...
---------------------------------------------
HEAD, BODY, RIGHT ARM, LEFT ARM, RIGHT LEG, LEFT LEG (complete)he dead. I mean he was hanging so technically he was already died a long time ago but you know, he dead.
Steve is dead. U suck...
edu.vassar.cmpu203.wakeupapp.model.Hangman edu.vassar.cmpu203.wakeupapp.view.Status = false

- (anad again, edu.vassar.cmpu203.wakeupapp.controller.game repeats again unless exited with "exit" or "quit"...):

abase
abate
scrap
sprinkles
aback
dog
Welcome to hangman! This is steve:
(0/6)
Steve will die.
Save Steve by guessing the word.
Good luck.
You can also quit at any time by typing 'quit' or 'exit', if you are a monster that is...
(0/6)
Please guess a valid letter
---------------------------------------------
(0/6)
Current Word : _____
Used Words: []
Used Letters: []

exit
GOODBYE. U LEFT STEVE TO HANG LIKE AN ANIMAL.
loribeth@Loris-MacBook-Pro-2 team-2i % 

