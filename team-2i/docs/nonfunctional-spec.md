# FURPS+ model:

1. Functional:
    - Must be able to import the system's alarm
    - edu.vassar.cmpu203.wakeupapp.model.Alarm must be able to open the app when run
    - User must be able to access the app to use the edu.vassar.cmpu203.wakeupapp.model.Pet System and minigames outside of the alarm
    - Get notifications of Word Theme of the Week
2. Usability:
    - Must be of ease of use
    - System must be intuitive when you open the app
    - Should be a 2 button press to import alarms to the system.
    - Good design choices
3. Reliability
    - (Stretch goal) May be linked to Google Play account or our website's account to recover data or to be accessed on other Android devices.
    - If there is crash during purchase, it should be logged and reinitialized when you reopen the app
    - If shutdown/ app closes during a minigame, if you return before the 5-minute timeout, return to previous move
    - Forgetting passwords, should be able to reset from email or through text
4. Performance:
    - Should be as responsive as any other app
    - Should be able to toggle performance of the app for all types of android smartphones
5. Supportability:
    - Code needs to modular, be able to implement other languages, mini-games, features
    - Configurable settings

# +, or ancilliary reqs:
6. Implementation:
    - App would primarily built for an Android smartphone environment, formatted as such. 
    - App interface will be in English, but would be able to support other languages in future.
    - edu.vassar.cmpu203.wakeupapp.model.Hangman will only use 5 letter words, following the word theme of the week
    - Needs to prevent player abuse by changing phone time
    - You can only be able to earn currency once a day
    - You can earn a bonus based on edu.vassar.cmpu203.wakeupapp.controller.game performance
    - Reset streak if fail to play 
7. Interface:
    - Should be able to use the system's alarm
      - If we cannot implement this feature, a backup plan would be to have an internal alarm that isn't connected to the system alarm.
8. Legal:
    - Words may be imported by a third-party website like Webster edu.vassar.cmpu203.wakeupapp.model.Dictionary. Have to get licensing rights to be able to use the words.
    - Future minigames may be licensed games, like Wordle or Duck Life. Licensing will be required.

