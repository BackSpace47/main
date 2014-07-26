


::===begin script
@echo off & setlocal enabledelayedexpansion
for /f "tokens=*" %%a in ('findstr /i /c:"<title>" *.htm') do (
set x="%%a"
:: you might get away with using a single delim char, but i tried to "safety" with 3.
set x=!x:title^>=*@$!
for /f "tokens=2 delims=*@$" %%b in (!x!) do (
set y="%%b"
set y=!y:~1,-3!
echo Daily Quote: !y!
>>titles echo !y!
)
)
::=== end
pause












echo.
echo.
set i=10
(Set /P j=Please Wait While We Process This...) < NUL
ECHO.
(Set /P j=......................................) < NUL
:Start
call :DisplayProgressBar %i%
:replace the next line by the operation you want to do
start CleanHouse


title Git Commit
color 12






set /p SomeVar=Enter Some Text Please







echo %SomeVar%



git commit -m "%SomeVar%"

pause




echo Paradox Coders Team
start CleanHouse



echo FINISHED
pause
exit


set /a i = i + 1
if /i %i% leq 100 goto start
ECHO.
ECHO.
(Set /P j=Complete!) < NUL
ECHO.
PAUSE>NUL
goto :EOF

:DisplayProgressBar
(Set /P j=.) < NUL
title %1%% Completed
exit /b
endlocal











BackSpace47 Notes


@echo off
title Git Commit
color 12

type NUL > Commit.txt




set /p SomeVar=Enter Some Text Please: 







echo %SomeVar%> Commit.txt

dir Commit.txt



git commit -m "%SomeVar%"

pause

type NUL > Commit.txt

cls
exit

