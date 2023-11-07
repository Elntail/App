```plantuml
skin rose
title Playing Hangman Use-Case

'define swimlanes
|#technology|User|
|#implementation|App|

|App|
start
:Alarm is activated;
if(//Alarm turned off before 5 minutes//) then (yes)



|App|
:Display State of Hangman;
while (//Play Time Under 5 minutes//) is (yes)

|User|
if(Exit the Game?) then (yes)

|App|
:End __Game__;
:__Lose hh and lose a streak day__;:End __Game__;
:__Lose hh and lose a streak day__;
end

else (no)
endif
|User|
if(Choose what kind of Guess You Want to Make.) then (Letter)
|App|
:Checking Letter Use Case;


else (Word)
:Checking Word Use Case;

endif
endwhile
else (no)
endif
:End __Game__;
:__Lose hh and lose a streak day__;
end

```
```plantuml
skin rose
title Checking Word Use-Case

'define swimlanes
|#technology|User|
|#implementation|App|


|User|
start
:Guess a Word;
|App|
if(Word Already Guessed or Word Length not equal to Answer) then (yes)
|User|
:State it;
|App|
else (no)
if(Player Word Guessed equals Answer) then (yes)

:End __Game__;
:Reward __health/happiness(hh) & coins, Add to streak__;
end
else (no)
:Update Counter;
if (Counter = 6) then (yes)
:End game;
:Lose hh and lose a streak day;
end
else (no)
endif
:Update Word Bank;

endif
endif
end



```
```plantuml
skin rose
title Checking Letter Use-Case

'define swimlanes
|#technology|User|
|#implementation|App|


|User|
start
:Picks a letter;

|App|
if(Letter Already Guessed) then (yes)
|User|
:State it;
|App|
else (no)
if(Letter in Word) then (yes)

:Update User Answer;

if(Player Answer equal to Word?) then (yes)
:End __Game__;
:Reward __health/happiness(hh) & coins, Add to streak__;
end
else (no)
endif


else (no)
:Update __Counter__;
if (//Counter// == 6) then (yes)
:End __Game__;
:__Lose hh and lose a streak day__;
end

else (no)
endif
endif
:Update Letter Bank;
endif

end
```

