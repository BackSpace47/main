Color 12
@echo off


ECHO.
ECHO ................................................................
Echo Would you like to create a shaped, shapless, or furnace recipe?
ECHO ................................................................
ECHO.


ECHO 1 - Shaped
ECHO 2 - Shapeless
echo 3 - Furnace Recipe

CHOICE /C:123
IF ERRORLEVEL 1 SET M=1
IF ERRORLEVEL 2 SET M=2
IF Errorlevel 3 SET M=3








IF %M%==1 GOTO Shaped
IF %M%==2 GOTO Shapeless
IF %M%==3 GOTO Furnace







:shaped
open S.bat
cls
exit






:shapless
open SL.bat
cls
exit



:furnace
open FS.bat
cls 
exit


