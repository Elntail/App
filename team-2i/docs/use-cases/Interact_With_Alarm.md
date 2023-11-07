```plantuml

skin rose
title Activating and Shutting Alarm Use-Case

'define swimlanes
|#technology|User|
|#implementation|Phone|
|#lightblue|App|

|Phone|
start

:Alarm __goes off via Built-in alarm app__;

|App|
:Pop-up asks user to enter game app;

if (//App opened?//) then (yes)
|User|
:Game app is chosen to be opened;

|Phone|
:Alarm __stops__;

|App|
:Execute Play of Hangman;


else (no)
|Phone|
:Continues to alarm for 5 minutes;
|App|
:Lose hh and lose a streak day;
endif

:This will be updated next iteration;

end
```





