@echo off
start CleanHouse
cls

color 12

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




CHOICE /C:1234567
IF ERRORLEVEL 1 SET M=1
IF ERRORLEVEL 2 SET M=2
IF ERRORLEVEL 3 SET M=3
IF ERRORLEVEL 4 SET M=4
IF ERRORLEVEL 5 SET M=5
IF ERRORLEVEL 6 SET M=6
IF ERRORLEVEL 7 SET M=7








IF %M%==1 GOTO VfullCOMMIT
IF %M%==2 GOTO VADD
IF %M%==3 GOTO VCOMMIT
IF %M%==4 GOTO VPUSH
IF %M%==5 GOTO VPULL
IF %M%==6 GOTO VFrog
IF %M%==7 GOTO VEXIT









:VfullCOMMIT
start FC.bat
exit

:VADD
start GA.bat
exit

:VCOMMIT
start GC.bat
exit

:VPUSH
start GPSH.bat
exit

:VPULL
start GPLL.bat
exit

:VFrog
start GS.bat

