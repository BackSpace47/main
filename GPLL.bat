@echo off
color 12
setlocal enabledelayedexpansion




::Define the files
set quoteFile="quotes.txt"
set signatureTemplate="template.txt"
set signatureFile="signature.html"

::Define constants for ! and ^ substitutions in template
set "X=!"
set "C=^"

::Count the number of quotes
for /f %%N in ('find /c /v "" ^<%quoteFile%') do set quoteCount=%%N

::Pick a random number of quotes to skip
set /a "skip=%random% %% %quoteCount%"

::Load the selected quote into a variable
if %skip% gtr 0 (set skip=skip=%skip%) else (set skip=)
for /f "usebackq %skip% delims=" %%A in (%quoteFile%) do (
  set quote=%%A
  goto :break
)
:break

::Read the signature template and write the signature file
::Delayed expansion will automatically replace !quote!, !X! and !C!
setlocal enableDelayedExpansion
>%signatureFile% (
  for /f "usebackq delims=" %%A in (%signatureTemplate%) do echo %%A
)











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





echo Paradox Coders Team
git pull

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

