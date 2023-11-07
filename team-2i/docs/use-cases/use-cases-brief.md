# Use Case Brief

Use-case list:
1. edu.vassar.cmpu203.wakeupapp.model.Pet: Actors = User, Game App
2. edu.vassar.cmpu203.wakeupapp.model.Alarm: Actors = User, Phone, Game App
3. edu.vassar.cmpu203.wakeupapp.model.Hangman: Actors = User, Game App

### Fully Dressed Use-cases:

>Use-case name = Playing edu.vassar.cmpu203.wakeupapp.model.Hangman

Priority = High

Level = User goal

Primary actor = User

Stakeholders and interests = User - Wants to be able to run through a round of edu.vassar.cmpu203.wakeupapp.model.Hangman, to be able to win or lose, and to select letters and have the system respond in a quick fashion.

Preconditions = Game is opened for the first time that day. If opened already, hangman doesn't automatically start.

Post-conditions (success guarantee) =  
- Coins awarded (based on how many body parts avoided being added)  
- HH either kept the same or awarded depending on if it was previously depleted.

Workflow = (Shown in separate use-case file)

Non-functional requirements = 
- May need to link to an outside dictionary source (only 5 letter words). Ideally words related to a specific theme-of-the-week.
- Should be easy and straight-forward to use.
- Should display english characters and hangman body imagery.
- Should work on android mobile phones.
- Should respond within 1-2 seconds of letter selection 95% of the time.

>Use-case name = Interacting with edu.vassar.cmpu203.wakeupapp.model.Pet

Priority = Medium

Level = User goal

Primary actor = User

Stakeholders and interests = User - Wants edu.vassar.cmpu203.wakeupapp.model.Pet to gain/maintain health/happiness(hh) via the edu.vassar.cmpu203.wakeupapp.controller.game system, wants to be able to purchase and apply pet items/accessories to pet.

Preconditions = Starts with full hh and no accessories.

Post-conditions =  
- Accessories added to pet.
- hh responds to user's edu.vassar.cmpu203.wakeupapp.controller.game completion.

Workflow = (Shown in separate use-case file)

Non-functional requirements =
- Should work on android mobile phones.
- Should respond within 3-5 seconds of edu.vassar.cmpu203.wakeupapp.controller.game completion 95% of the time.
- Should respond within 2-3 seconds of accessory placement 95% of the time.
- Should graphically show pet and updates with accessories and reflect happiness/health levels.

>Use-case name = Shutting edu.vassar.cmpu203.wakeupapp.model.Alarm

Priority = High

Level = User goal

Primary actor = User

Stakeholders and interests = User - Wants to be able to get alarm to stop when app is opened.

Preconditions =
- edu.vassar.cmpu203.wakeupapp.model.Alarm is set
- App is linked to alarm system

Post-conditions =  
- edu.vassar.cmpu203.wakeupapp.model.Alarm is stopped
- Game is opened

Workflow = (Shown in separate use-case file)

Non-functional requirements =
- Should work on android mobile phones.
- Should stop alarm within 1-2 seconds of app opening 97% of the time.
- Should support ability to connect app to alarm system.