```plantuml

skin rose
title Alarm Game

'define swimlanes
|#technology|Alarm|
|#implementation|Hangman|
|#lightblue|Pet|

|Alarm|
start

:Alarm __goes off__;
:Alarm app is __opened__;

|Hangman|
if (//Game completed?//) then (yes)
|Pet|
:Reward __health/happiness(hh) & coins, Add to streak__;
else (no)
|Pet|
:Lose __hh and lose a streak day__;
endif

end
```