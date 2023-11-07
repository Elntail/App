# Conceptual classes

Conceptual category:
- 


``` plantuml

hide footbox
actor User as user
participant "Letter-guesses" as letguess
participant "letter-checker" as letcheck
participant "word-answer" as wordans
participant "counter" as count

user -->> letguess **: 
letguess -->> letcheck **: 
letcheck -->> wordans **:
letcheck -->> count **:

```
```plantuml
hide footbox
title Guessing Letters 
skin rose

actor User as user
participant "TextUI" as main
participant "Controller" as cont
participant "Hangman" as hang
participant "Dictionary" as dict

user -> main : pick "play"
main -->> cont : runHangman()
cont -->> hang : runHangman()
hang -->> dict : answer = getRandomWord()
hang -->> main : display Prompt()
main -> user : display Prompt
user -> main : picks letter
main -->> hang : playerAns = modifyPAns()
hang -->> main : display Counter()
main -> user : display counter
hang -->> main : display curSteve()
main -> user : display steve



```
```plantuml
hide footbox

title Guessing Words 
skin rose

actor User as user
participant "TextUI" as main
participant "Controller" as cont
participant "Hangman" as hang
participant "Dictionary" as dict

user -> main : pick "play"
main -->> cont : runHangman()
cont -->> hang : runHangman()
hang -->> dict : answer = getRandomWord()
hang -->> main : display Prompt()
main -> user : display Prompt
user -> main : picks word
main -->> hang : playerAns = addWord()
hang -->> main : display Counter()
main -> user : display counter
hang -->> main : display curSteve()
main -> user : display steve


```

