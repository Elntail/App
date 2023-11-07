```plantuml
skin rose
title Interacting With Shop

'define swimlanes
|#technology|User|
|#implementation|App|
|User|
start


while (Not Quit) is (yes)
:Select Type of Item for Purchase;
:User selects __buy item__;


|App|
if(Coins >= Item Cost) then (yes)

:Coins are depleted;
:Item added to inventory;

:Inform User that cannot buy item;

else (no)
endif
if(User Selects Equip) then (yes)
|User|
:User Selects __Equip__;
:Interacting with edu.vassar.cmpu203.wakeupapp.model.Pet;

else (no)
endif
endwhile
|User|
:User Selects Quit;
end
```