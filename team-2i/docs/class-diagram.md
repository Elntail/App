

```plantuml
skin rose
hide circle
hide empty methods

' classes
class Hangman{
answer : String
counter : int = 6
steve : String
playerAns : String
Counter() : int
getWords() : String
getAnswer() : String
getPlayerAns() : String
containsWord(String word) : boolean
containsLet(String word) : boolean
addWord(String word) : void
updateSteve() : void
modifyPAns(String guessed) : boolean
}

class Alarm{
time : int
}


class Dictionary{
words : String[] 
availWords : ArrayList<String> 
usedWords : ArrayList<String> 
itr: Iterator<String> 

getWord() : String 
}


class game{
isWinner : boolean 
reward : int 
alarmOn : boolean
# setDefault() : void
# activateAlarm() : void
# deactivateAlarm() : void
# give_award() : int
playGame(boolean activeAlarm) : void
}

class guesses{
letters : String[] = {a, b,...z}
words : ArrayList<String>
availLet: ArrayList<String>
usedLet: ArrayList<String>

removeLet(char letter) : void
}

class WakeUpApp{
pet
curHangman
}

class Pet{
species : String
color : String
prop : Status
}

class Status{
~ health : int {100}
~ happiness : int {100}
- getHealth() : int 
- getHappiness() : int 
modifyHlh(int amount) : void
modifyHap(int amount) : void
toString() : String
}

' associations
game "1" - "*" WakeUpApp : contains
Pet "1" - "*" WakeUpApp : contains
Alarm "1" - "*" WakeUpApp : contains

Hangman "1" - "*" game : Houses
Dictionary "1" - "1" Hangman : Gets-word
Pet "*" - "1" Status : Described-by
Hangman <|-- guesses : Nested-Class

```