@echo off

cls

:Menu



ECHO.
ECHO .............................................................
ECHO PRESS 1, 2, 3, 4, 5, OR 6 to select your task, or 7 to EXIT.
ECHO .............................................................
ECHO.
ECHO 1 - Full Commit (Runs the add, commit, and push command)
ECHO 2 - Git Add
ECHO 3 - Git Commit
echo 4 - Git Push
echo 5 - Git Pull
echo 6 - Git Status
ECHO 7 - EXIT
ECHO.

SET /P M=Type 1, 2, 3, 4, 5, 6, or 7 then press ENTER:
IF %M%==1 GOTO VfullCOMMIT
IF %M%==2 GOTO VADD
IF %M%==3 GOTO VCOMMIT
IF %M%==4 GOTO VPUSH
IF %M%==5 GOTO VPULL
IF %M%==6 GOTO VSTATUS
IF %M%==7 GOTO VEXIT


:VfullCOMMIT
start FC.bat

:VADD
start GA.bat

:VCOMMIT
start GC.bat

:VPUSH
start GPSH.bat

:VPULL
start GPLL.bat

:VSTATUS
start GS.bat